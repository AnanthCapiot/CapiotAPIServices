package com.capiot.api.travel.model;

import java.time.ZonedDateTime;
import java.util.List;

public class Booking {
	
	private List<AirOrder> airOrders;
	
	private List<AccoOrder> accoOrders;
	
	private String bookingID;
	
	private String bookingStatus;
	
	private ZonedDateTime createdDateTime; 
	
	public Booking() {}

	public String getBookingID() {
		return bookingID;
	}

	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public ZonedDateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(ZonedDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public List<AirOrder> getAirOrders() {
		return airOrders;
	}

	public void setAirOrders(List<AirOrder> airOrders) {
		this.airOrders = airOrders;
	}

	public List<AccoOrder> getAccoOrders() {
		return accoOrders;
	}

	public void setAccoOrders(List<AccoOrder> accoOrders) {
		this.accoOrders = accoOrders;
	}	
}