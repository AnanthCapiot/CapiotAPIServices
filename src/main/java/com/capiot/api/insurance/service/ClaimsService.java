package com.capiot.api.insurance.service;

import com.capiot.api.insurance.exception.ClaimNotFoundException;
import com.capiot.api.insurance.model.Claim;

import java.util.List;

public interface ClaimsService {

    public List<Claim> getAllClaims() throws Exception;

    public Claim getClaim( String claimID ) throws ClaimNotFoundException;
}
