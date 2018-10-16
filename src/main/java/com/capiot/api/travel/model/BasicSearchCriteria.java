package com.capiot.api.travel.model;

public class BasicSearchCriteria {
	
	private int startIndex;
	
	private int endIndex;
	
	private int resultsCount;
	
	// use "asc" or "desc"
	private String sortOrder;
	
	// use any sorting filters?
	private String sortFilter;
	
	public BasicSearchCriteria() {}
		
	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getSortFilter() {
		return sortFilter;
	}

	public void setSortFilter(String sortFilter) {
		this.sortFilter = sortFilter;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	public int getResultsCount() {
		return resultsCount;
	}

	public void setResultsCount(int resultsCount) {
		this.resultsCount = resultsCount;
	}	
}
