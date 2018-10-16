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
        return null;
    }

    @RequestMapping(value = "/claims/create", method = RequestMethod.POST)
    public Claim createClaim( @RequestBody Claim newClaim )	{
        // create new Claim, return Claim with generated ID
        return newClaim;
    }
}
