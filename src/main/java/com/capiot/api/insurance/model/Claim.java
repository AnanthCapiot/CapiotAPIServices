package com.capiot.api.insurance.model;

import java.time.LocalDate;
import java.util.List;

public class Claim {

    private PolicyHolder policyHolderDetails;

    private VehicleIncident incidentDetails;

    private String incidentType; //Accident or Theft

    //Purpose of travel, Incident location, etc.
    private String incidentCircumstanceStatement;

    private Driver driverDetails;

    private List<ClaimDocument> claimDocuments;

    private List<ThirdPartyInvolvementInfo> tpDetails;

    private LocalDate claimDate;

    private String claimantName;

    private boolean claimSigned;

    public PolicyHolder getPolicyHolderDetails() {
        return policyHolderDetails;
    }

    public void setPolicyHolderDetails(PolicyHolder policyHolderDetails) {
        this.policyHolderDetails = policyHolderDetails;
    }

    public VehicleIncident getIncidentDetails() {
        return incidentDetails;
    }

    public void setIncidentDetails(VehicleIncident incidentDetails) {
        this.incidentDetails = incidentDetails;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getIncidentCircumstanceStatement() {
        return incidentCircumstanceStatement;
    }

    public void setIncidentCircumstanceStatement(String incidentCircumstanceStatement) {
        this.incidentCircumstanceStatement = incidentCircumstanceStatement;
    }

    public Driver getDriverDetails() {
        return driverDetails;
    }

    public void setDriverDetails(Driver driverDetails) {
        this.driverDetails = driverDetails;
    }

    public List<ClaimDocument> getClaimDocuments() {
        return claimDocuments;
    }

    public void setClaimDocuments(List<ClaimDocument> claimDocuments) {
        this.claimDocuments = claimDocuments;
    }

    public List<ThirdPartyInvolvementInfo> getTpDetails() {
        return tpDetails;
    }

    public void setTpDetails(List<ThirdPartyInvolvementInfo> tpDetails) {
        this.tpDetails = tpDetails;
    }

    public LocalDate getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(LocalDate claimDate) {
        this.claimDate = claimDate;
    }

    public String getClaimantName() {
        return claimantName;
    }

    public void setClaimantName(String claimantName) {
        this.claimantName = claimantName;
    }

    public boolean isClaimSigned() {
        return claimSigned;
    }

    public void setClaimSigned(boolean claimSigned) {
        this.claimSigned = claimSigned;
    }
}
