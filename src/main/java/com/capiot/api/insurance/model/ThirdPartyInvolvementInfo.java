package com.capiot.api.insurance.model;

public class ThirdPartyInvolvementInfo {

    private String tpType; //Vehicle or Passenger or Injury or Occupant or Property

    private Address inspectionAddress;

    private String contactNumber;

    private String identification;

    private String injuryDamageDesc;

    public String getTpType() {
        return tpType;
    }

    public void setTpType(String tpType) {
        this.tpType = tpType;
    }

    public Address getInspectionAddress() {
        return inspectionAddress;
    }

    public void setInspectionAddress(Address inspectionAddress) {
        this.inspectionAddress = inspectionAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getInjuryDamageDesc() {
        return injuryDamageDesc;
    }

    public void setInjuryDamageDesc(String injuryDamageDesc) {
        this.injuryDamageDesc = injuryDamageDesc;
    }
}
