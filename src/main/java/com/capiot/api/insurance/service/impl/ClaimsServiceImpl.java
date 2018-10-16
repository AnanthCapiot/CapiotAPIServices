package com.capiot.api.insurance.service.impl;

import com.capiot.api.insurance.exception.ClaimNotFoundException;
import com.capiot.api.insurance.model.*;
import com.capiot.api.insurance.service.ClaimsService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ClaimsServiceImpl implements ClaimsService  {

    @Override
    public List<Claim> getAllClaims() throws Exception {
        List<Claim> allClaims = new ArrayList<>();
        allClaims.add( getTestClaim() );
        return allClaims;
    }

    @Override
    public Claim getClaim(String claimID) throws ClaimNotFoundException {
        return null;
    }

    private Claim getTestClaim() {
        Claim aClaim = new Claim();
        aClaim.setClaimID( UUID.randomUUID().toString().toUpperCase().substring( 0, 8 ));

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

        VehicleIncident anAccident = new VehicleIncident();
        anAccident.setIncidentID( UUID.randomUUID().toString().toUpperCase().substring( 0, 8 ));
        anAccident.setChasisNumber( "600132CTZP78900" );
        anAccident.setRegistrationNumber( "TG 10 AB - MA 9827" );
        anAccident.setGdFIRNumber( "TG/JMS ST PS/2018/10/16/44" );
        anAccident.setNameOfPoliceStation( "Telangana - Hyd - James Street PS" );
        anAccident.setIncidentDateTime(LocalDateTime.of( 2018, 10, 15, 9, 22 ));
        anAccident.setIncidentType( "Accident" );
        anAccident.setNumberOfOccupants( 1 );
        anAccident.setPlaceOfIncident( "Paradise Flyover" );
        anAccident.setPoliceReport( true );

        Driver driver = new Driver();
        driver.setDriverID( UUID.randomUUID().toString().toUpperCase().substring( 0, 8 ));
        driver.setDlIssuingRTO( "TG SECBAD RTO" );
        driver.setDlNumber( "TG HYD DL 8877/2018/3399" );
        driver.setMobileNumber( "987 456 1230" );
        driver.setDlIssuingRTO( "RTO Secunderabad" );
        driver.setName( "Richard Williams" );
        driver.setRelationshipWithInsured( "Self" );

        aClaim.setPolicyHolderDetails( claimant );
        aClaim.setIncidentDetails( anAccident );
        aClaim.setIncidentType( "Accident" );
        aClaim.setIncidentCircumstanceStatement( "Speeding Innova (AP 10SA - EZ5431 ) from rear hits Claimant's " +
                "Honda City car in traffic - Damaged Rear Bumper and Trunk, eventually Claimant's vehicle hit" +
                "waiting Ford City in front damaging Front Bumper of Claimant and Ford City's Rear Bumper" );
        aClaim.setDriverDetails( driver );
        aClaim.setClaimDate( LocalDate.of( 2018, 10, 16 ));
        aClaim.setClaimantName( claimant.getNameOfInsured() );
        aClaim.setClaimSigned( true );

        ThirdPartyInvolvementInfo aTP = new ThirdPartyInvolvementInfo();
        aTP.setTpID( UUID.randomUUID().toString().toUpperCase().substring( 0, 8 ));
        aTP.setContactNumber( "984 919 2266" );
        aTP.setIdentification( "RT Brijesh bearing license number 'TG HYD DL 112/2012/5482'" );
        aTP.setInjuryDamageDesc( "RT Brijesh car was hit by Claimant's car - chain reaction" );
        aTP.setInspectionAddress( claimantAddress );
        aTP.setTpType( "Vehicle" );
        List<ThirdPartyInvolvementInfo> tpDetails = new ArrayList<>();
        tpDetails.add( aTP );
        aClaim.setTpDetails( tpDetails );

        ClaimDocument firDoc = new ClaimDocument();
        firDoc.setDocID( UUID.randomUUID().toString().toUpperCase().substring( 0, 8 ));
        firDoc.setApproved( true );
        firDoc.setCreatedDate( LocalDate.of( 2018, 10, 15 ));
        firDoc.setDocID( "FIR" );
        firDoc.setDocName( "Police Panchanama/FIR" );
        firDoc.setFileName( "CLM_11223344_DOC_11223344-1" );
        firDoc.setSigned( true );

        ClaimDocument claimForm = new ClaimDocument();
        claimForm.setDocID( UUID.randomUUID().toString().toUpperCase().substring( 0, 8 ));
        claimForm.setApproved( true );
        claimForm.setCreatedDate( LocalDate.of( 2018, 10, 15 ));
        claimForm.setDocID( "CLM FRM" );
        claimForm.setDocName( "Duly filled and signed claim form" );
        claimForm.setFileName( "CLM_11223344_DOC_11223344-2" );
        claimForm.setSigned( true );

        List<ClaimDocument> claimDocs = new ArrayList<>();
        claimDocs.add( firDoc );
        claimDocs.add( claimForm );
        aClaim.setClaimDocuments( claimDocs );

        return aClaim;
    }
}
