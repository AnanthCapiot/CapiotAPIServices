package com.capiot.api.insurance.controllers;

import com.capiot.api.insurance.model.Address;
import com.capiot.api.insurance.model.PolicyHolder;
import com.capiot.api.insurance.model.PolicyHolderBankDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class PolicyHolderController {

    @RequestMapping(value = "/policyHolders/create", method = RequestMethod.POST )
    public PolicyHolder createPolicyHolder(PolicyHolder newPolicyHolder )   {
        newPolicyHolder.setPolicyHolderID(UUID.randomUUID().toString().toUpperCase().substring( 0, 8 ));
        return newPolicyHolder;
    }

    @RequestMapping(value = "/policyHolders", method = RequestMethod.GET )
    public List<PolicyHolder> getPolicyHolders() {
        ArrayList<PolicyHolder> policyHolders = new ArrayList<>();
        policyHolders.add( getTestPolicyHolder() );
        return policyHolders;
    }

    private PolicyHolder getTestPolicyHolder() {
        PolicyHolder claimant = new PolicyHolder();
        claimant.setPolicyHolderID( UUID.randomUUID().toString().toUpperCase().substring( 0, 8 ));
        claimant.setPolicyNumber( "ATO-001-234-4455" );
        claimant.setCoverNoteNumber( "CN-001-234-4455" );
        claimant.setDob( LocalDate.of( 1970, 2, 1 ));
        claimant.setEmailID( "rwilliams@yahoo.net" );
        claimant.setGender( "M" );
        claimant.setMobileNumber( "987 456 1230");
        claimant.setNameOfInsured( "Richard Williams" );

        Address claimantAddress = new Address();
        claimantAddress.setBuilding( "Plot No 15" );
        claimantAddress.setStreet( "22nd Street" );
        claimantAddress.setArea( "Kukatpally" );
        claimantAddress.setCity( "Hyderabad" );
        claimantAddress.setPostcode( "500 072" );
        claimantAddress.setState( "Telangana" );
        claimantAddress.setCountry( "India" );
        claimant.setAddress( claimantAddress );

        PolicyHolderBankDetails claimantBankDetails = new PolicyHolderBankDetails();
        claimantBankDetails.setAccountName( "Richard Williams" );
        claimantBankDetails.setAccountNumber( "123-456-7890" );
        claimantBankDetails.setAccountType( "Savings" );
        claimantBankDetails.setBankName( "ICICI Bank" );
        claimantBankDetails.setBranch( "Madhapur" );
        claimantBankDetails.setIfscCode( "ICIC00000117" );
        claimantBankDetails.setMicrCode( "ICICMICR-123" );
        claimantBankDetails.setPAN( "ZNMLM5187E" );
        claimantBankDetails.setSupportingDocProvided( true );
        claimantBankDetails.setSupportingDocType( "Cancelled Cheque" );
        claimant.setBankDetails( claimantBankDetails );

        return claimant;
    }
}
