package com.capiot.api.insurance.model;

public class Driver {

    private String name;

    private String dlNumber;

    private String dlIssuingRTO;

    private String mobileNumber;

    private String relationshipWithInsured;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDlNumber() {
        return dlNumber;
    }

    public void setDlNumber(String dlNumber) {
        this.dlNumber = dlNumber;
    }

    public String getDlIssuingRTO() {
        return dlIssuingRTO;
    }

    public void setDlIssuingRTO(String dlIssuingRTO) {
        this.dlIssuingRTO = dlIssuingRTO;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getRelationshipWithInsured() {
        return relationshipWithInsured;
    }

    public void setRelationshipWithInsured(String relationshipWithInsured) {
        this.relationshipWithInsured = relationshipWithInsured;
    }
}
