package com.capiot.api.insurance.controllers;

import com.capiot.api.insurance.model.Claim;
import com.capiot.api.travel.model.Booking;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClaimsController {
    @RequestMapping(value = "/claims", method = RequestMethod.GET)
    public List<Claim> getAllClaims() throws Exception {
//        List<Claim> allBookings = bookingService.getAllBookings();
        return null;
    }
}
