package com.capiot.api.insurance.model;

import java.time.LocalDateTime;

public class VehicleIncident {

    private String incidentType; //Accident or Theft

    private String registrationNumber;

    private String chasisNumber;

    private LocalDateTime incidentDateTime;

    private int numberOfOccupants;

    private boolean policeReport;

    private String gdFIRNumber;

    private String nameOfPoliceStation;

    private String placeOfIncident;

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getChasisNumber() {
        return chasisNumber;
    }

    public void setChasisNumber(String chasisNumber) {
        this.chasisNumber = chasisNumber;
    }

    public LocalDateTime getIncidentDateTime() {
        return incidentDateTime;
    }

    public void setIncidentDateTime(LocalDateTime incidentDateTime) {
        this.incidentDateTime = incidentDateTime;
    }

    public int getNumberOfOccupants() {
        return numberOfOccupants;
    }

    public void setNumberOfOccupants(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }

    public boolean isPoliceReport() {
        return policeReport;
    }

    public void setPoliceReport(boolean policeReport) {
        this.policeReport = policeReport;
    }

    public String getGdFIRNumber() {
        return gdFIRNumber;
    }

    public void setGdFIRNumber(String gdFIRNumber) {
        this.gdFIRNumber = gdFIRNumber;
    }

    public String getNameOfPoliceStation() {
        return nameOfPoliceStation;
    }

    public void setNameOfPoliceStation(String nameOfPoliceStation) {
        this.nameOfPoliceStation = nameOfPoliceStation;
    }

    public String getPlaceOfIncident() {
        return placeOfIncident;
    }

    public void setPlaceOfIncident(String placeOfIncident) {
        this.placeOfIncident = placeOfIncident;
    }
}
