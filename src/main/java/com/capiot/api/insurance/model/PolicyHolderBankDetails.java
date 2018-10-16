package com.capiot.api.insurance.model;

public class PolicyHolderBankDetails {

    private String accountName;

    private String bankName;

    private String accountNumber;

    private String ifscCode;

    private String accountType;

    private String branch;

    private String micrCode;

    private String PAN;

    private boolean supportingDocProvided;

    private String supportingDocType; //Cancelled Cheque or Bank passbook copy

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getMicrCode() {
        return micrCode;
    }

    public void setMicrCode(String micrCode) {
        this.micrCode = micrCode;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    public boolean isSupportingDocProvided() {
        return supportingDocProvided;
    }

    public void setSupportingDocProvided(boolean supportingDocProvided) {
        this.supportingDocProvided = supportingDocProvided;
    }

    public String getSupportingDocType() {
        return supportingDocType;
    }

    public void setSupportingDocType(String supportingDocType) {
        this.supportingDocType = supportingDocType;
    }
}
