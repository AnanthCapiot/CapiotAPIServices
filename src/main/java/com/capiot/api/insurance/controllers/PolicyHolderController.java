package com.capiot.api.insurance.controllers;

import com.capiot.api.insurance.model.PolicyHolder;
import org.springframework.web.bind.annotation.RestController;

import java.security.Policy;

@RestController
public class PolicyHolderController {

    public PolicyHolder createPolicyHolder(PolicyHolder newPolicyHolder )   {
        return newPolicyHolder;
    }
}
