package com.capiot.api.insurance.controllers;

import com.capiot.api.insurance.model.Claim;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping(value = "/bookings", method = RequestMethod.POST)
    public Claim createBooking( @RequestBody Claim newClaim )	{
        // create new Booking, return Booking with generated ID
        return newClaim;
    }
}
