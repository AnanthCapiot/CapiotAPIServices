package com.capiot.api.travel.model;

import java.time.ZonedDateTime;

public class FlightSegment {
	
	private String segmentID;
	
	private String originCode;
	
	private String destinationCode;
	
	private String originName;
	
	private String destinationName;
	
	private ZonedDateTime startTime;
	
	private ZonedDateTime endTime;
	
	private String airlinePNR;

	private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSegmentID() {
		return segmentID;
	}

	public void setSegmentID(String segmentID) {
		this.segmentID = segmentID;
	}

	public String getOriginCode() {
		return originCode;
	}

	public void setOriginCode(String originCode) {
		this.originCode = originCode;
	}

	public String getDestinationCode() {
		return destinationCode;
	}

	public void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
	}

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public ZonedDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(ZonedDateTime startTime) {
		this.startTime = startTime;
	}

	public ZonedDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(ZonedDateTime endTime) {
		this.endTime = endTime;
	}

	public String getAirlinePNR() {
		return airlinePNR;
	}

	public void setAirlinePNR(String airlinePNR) {
		this.airlinePNR = airlinePNR;
	}
}