package com.RideSwift.RideSwift.service;

import com.RideSwift.RideSwift.dto.request.DriverRequest;
import com.RideSwift.RideSwift.model.Cab;
import com.RideSwift.RideSwift.model.Driver;
import com.RideSwift.RideSwift.repository.DriverRepository;
import com.RideSwift.RideSwift.transformer.CabTransformer;
import com.RideSwift.RideSwift.transformer.DriverTransformer;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    //    @Autowired
    //    DriverRepository driverRepository;

    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public String addDriver(DriverRequest driverRequest) {

        // driver request -> driver
        // cab Request -> cab
        Driver driver = DriverTransformer.driverRequestToDriver(driverRequest);
        Cab cab = CabTransformer.cabRequestToCab(driverRequest.getCab());

        // set the relationship attributrs
        driver.setCab(cab);
        cab.setDriver(driver);

        driverRepository.save(driver);  // save both driver and cab
        return "Driver and Cab saved successfully";

    }

    public Driver getDriver(String mobNo) {
        return driverRepository.findByMobNo(mobNo);
    }
}
