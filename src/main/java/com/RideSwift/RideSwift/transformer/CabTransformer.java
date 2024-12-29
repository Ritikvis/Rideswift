package com.RideSwift.RideSwift.transformer;

import com.RideSwift.RideSwift.dto.request.CabRequest;
import com.RideSwift.RideSwift.dto.response.CabResponse;
import com.RideSwift.RideSwift.model.Cab;

public class CabTransformer {

    // Method to transform CabRequest to Cab
    public static Cab cabRequestToCab(CabRequest cabRequest){
        Cab cab = new Cab();
        cab.setCabNo(cabRequest.getCabNo());
        cab.setCarModel(cabRequest.getCarModel());
        cab.setFarePerKm(cabRequest.getFarePerKm());
        cab.setNumberOfSeats(cabRequest.getNumberOfSeats());
        cab.setCarType(cabRequest.getCarType());
        cab.setAvailable(true);  // Assuming the cab is available by default
        return cab;
    }

    // Method to transform Cab to CabResponse
    public static CabResponse cabToCabResponse(Cab cab){
        CabResponse cabResponse = new CabResponse();
        cabResponse.setCabNo(cab.getCabNo());
        cabResponse.setCarModel(cab.getCarModel());
        cabResponse.setFarePerKm(cab.getFarePerKm());
        return cabResponse;
    }
}
