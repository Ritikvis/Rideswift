package com.RideSwift.RideSwift.service;

import com.RideSwift.RideSwift.dto.request.TripBookingRequest;
import com.RideSwift.RideSwift.dto.response.TripBookingResponse;
import com.RideSwift.RideSwift.exception.CabNotAvailableException;
import com.RideSwift.RideSwift.exception.CustomerNotFoundException;
import com.RideSwift.RideSwift.model.Cab;
import com.RideSwift.RideSwift.model.Customer;
import com.RideSwift.RideSwift.model.TripBooking;
import com.RideSwift.RideSwift.repository.CabRepository;
import com.RideSwift.RideSwift.repository.CustomerRepository;
import com.RideSwift.RideSwift.repository.DriverRepository;
import com.RideSwift.RideSwift.repository.TripBookingRepository;
import com.RideSwift.RideSwift.transformer.BookingTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TripBookingService {
    @Autowired
    private  CabRepository cabRepository;
    @Autowired
    private  DriverRepository driverRepository;
    @Autowired
    private TripBookingRepository tripBookingRepository;
    @Autowired
    private CustomerRepository customerRepository;

    private final JavaMailSender javaMailSender = new JavaMailSenderImpl(); // Initialize the JavaMailSender here

    public TripBookingResponse bookCab(boolean applyCoupon,
                                       TripBookingRequest tripBookingRequest) {

        // validate email id of the customer
        Customer customer = customerRepository.findByEmailId(tripBookingRequest
                .getCustomerEmailId());

        if (customer == null) {
            throw new CustomerNotFoundException("Invalid email id");
        }

        // check if a cab is available or not for booking
        // get a random available cab
        Cab cab = cabRepository.getRandomAvailableCab();
        if (cab == null) {
            throw new CabNotAvailableException("Sorry! All drivers are busy right now!!");
        }

        // prepare the booking entity
        TripBooking tripBooking = BookingTransformer.bookingRequestToBooking(tripBookingRequest);
        tripBooking.setTotalFare(cab.getFarePerKm() * tripBookingRequest.getTripDistanceInKm());
        tripBooking.setCustomer(customer);
        tripBooking.setDriver(cab.getDriver());

        // save booking
        TripBooking savedTripBooking = tripBookingRepository.save(tripBooking);

        customer.getBookings().add(savedTripBooking);
        cab.setAvailable(false);
        cab.getDriver().getBookings().add(savedTripBooking);

        // customer and booking
        customerRepository.save(customer); // customer + savedBooking
        driverRepository.save(cab.getDriver()); // driver + cab + savedBooking

        sendEmail(savedTripBooking);

        // last step -> prepare booking response
        return BookingTransformer.tripBookingToTripBookingResponse(savedTripBooking);

    }

    private void sendEmail(TripBooking savedTripBooking) {

        // prepare your email
        String text = "Congrats!! " + savedTripBooking.getCustomer().getName()
                + " your ride is booked with " + savedTripBooking.getDriver().getName();

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("acciojobspring@gmail.com");
        simpleMailMessage.setTo(savedTripBooking.getCustomer().getEmailId());
        simpleMailMessage.setSubject("Cab Booked!!!");
        simpleMailMessage.setText(text);

        // send the email
        javaMailSender.send(simpleMailMessage);
    }
}
