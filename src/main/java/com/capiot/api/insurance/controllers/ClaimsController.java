package com.capiot.api.insurance.controllers;

import com.capiot.api.insurance.model.Claim;
import com.capiot.api.insurance.service.ClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClaimsController {

    @Autowired
    private ClaimsService claimsService;

    @RequestMapping(value = "/claims", method = RequestMethod.GET)
    public List<Claim> getAllClaims() throws Exception {
        return claimsService.getAllClaims();
    }

    @RequestMapping(value = "/claims/create", method = RequestMethod.POST)
    public Claim createClaim( @RequestBody Claim newClaim )	{
        // create new Claim, return Claim with generated ID
        return newClaim;
    }
}
