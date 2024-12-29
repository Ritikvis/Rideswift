package com.RideSwift.RideSwift.transformer;

import com.RideSwift.RideSwift.dto.request.CustomerRequest;
import com.RideSwift.RideSwift.dto.response.CustomerResponse;
import com.RideSwift.RideSwift.model.Customer;

public class CustomerTransformer {

    // Method to transform CustomerRequest to Customer
    public static Customer customerRequestToCustomer(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setAge(customerRequest.getAge());
        customer.setAddress(customerRequest.getAddress());
        customer.setEmailId(customerRequest.getEmailId());
        customer.setGender(customerRequest.getGender());
        // Set other properties as needed
        return customer;
    }

    // Method to transform Customer to CustomerResponse
    public static CustomerResponse customerToCustomerResponse(Customer customer) {
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setName(customer.getName());
        customerResponse.setEmailId(customer.getEmailId());
        // Set other properties as needed
        return customerResponse;
    }
}
