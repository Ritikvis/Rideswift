package com.RideSwift.RideSwift.transformer;

import com.RideSwift.RideSwift.dto.request.DriverRequest;
import com.RideSwift.RideSwift.dto.response.DriverResponse;
import com.RideSwift.RideSwift.model.Driver;

public class DriverTransformer {

    // Method to transform DriverRequest to Driver
    public static Driver driverRequestToDriver(DriverRequest driverRequest) {
        Driver driver = new Driver();
        driver.setName(driverRequest.getName());
        driver.setAge(driverRequest.getAge());
        driver.setMobNo(driverRequest.getMobNo());
        driver.setRating(0);  // Assuming default rating of 0
        driver.setPanNumber(driverRequest.getPanNumber());
        return driver;
    }

    // Method to transform Driver to DriverResponse
    public static DriverResponse driverToDriverResponse(Driver driver) {
        DriverResponse driverResponse = new DriverResponse();
        driverResponse.setName(driver.getName());
        driverResponse.setRating(driver.getRating());
        driverResponse.setMobNo(driver.getMobNo());
        driverResponse.setCabResponse(CabTransformer.cabToCabResponse(driver.getCab()));
        return driverResponse;
    }
}
