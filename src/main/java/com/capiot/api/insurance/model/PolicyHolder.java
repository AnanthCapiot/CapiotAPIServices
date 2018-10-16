package com.capiot.api.insurance.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.LocalDate;

@JsonPropertyOrder({ "policyHolderID", "policyNumber", "coverNoteNumber", "nameOfInsured" })
public class PolicyHolder {

    private String policyHolderID;

    private String policyNumber;

    private String coverNoteNumber;

    private String nameOfInsured;

    private String gender;

    private LocalDate dob;

    private String mobileNumber;

    private Address address;

    private String emailID;

    private PolicyHolderBankDetails bankDetails;

    public String getPolicyHolderID() {
        return policyHolderID;
    }

    public void setPolicyHolderID(String policyHolderID) {
        this.policyHolderID = policyHolderID;
    }

    public PolicyHolderBankDetails getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(PolicyHolderBankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getCoverNoteNumber() {
        return coverNoteNumber;
    }

    public void setCoverNoteNumber(String coverNoteNumber) {
        this.coverNoteNumber = coverNoteNumber;
    }

    public String getNameOfInsured() {
        return nameOfInsured;
    }

    public void setNameOfInsured(String nameOfInsured) {
        this.nameOfInsured = nameOfInsured;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
}
