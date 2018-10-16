package com.capiot.api.travel.model;

import java.math.BigDecimal;
import java.util.List;

public class AirOrder {
	
	private String orderID;
	
	private String airlineName;
	
	private String airlineCode;
	
	private String supplierID;
	
	private String supplierName;
	
	private String orderRefNumber;
	
	private BigDecimal ticketCost;
	
	private String currency;
	
	private int segmentsCount;
	
	private String ticketingPNR;
	
	private List<FlightSegment> odoOptions;
	
	public AirOrder() {}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getOrderRefNumber() {
		return orderRefNumber;
	}

	public void setOrderRefNumber(String orderRefNumber) {
		this.orderRefNumber = orderRefNumber;
	}

	public BigDecimal getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(BigDecimal ticketCost) {
		this.ticketCost = ticketCost;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getSegmentsCount() {
		return segmentsCount;
	}

	public void setSegmentsCount(int segmentsCount) {
		this.segmentsCount = segmentsCount;
	}

	public String getTicketingPNR() {
		return ticketingPNR;
	}

	public void setTicketingPNR(String ticketingPNR) {
		this.ticketingPNR = ticketingPNR;
	}

	public List<FlightSegment> getOdoOptions() {
		return odoOptions;
	}

	public void setOdoOptions(List<FlightSegment> odoOptions) {
		this.odoOptions = odoOptions;
	}	
}
