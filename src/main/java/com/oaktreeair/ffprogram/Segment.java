package com.oaktreeair.ffprogram;

import java.util.Date;


public class Segment {
	
	private Long segmentNumber;
	private Date segmentDate;
	private int flightNumber;
	private String originatingCity;
	private int miles;
	public Long getSegmentNumber() {
		return segmentNumber;
	}
	public void setSegmentNumber(Long segmentNumber) {
		this.segmentNumber = segmentNumber;
	}
	public Date getSegmentDate() {
		return segmentDate;
	}
	public void setSegmentDate(Date segmentDate) {
		this.segmentDate = segmentDate;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOriginatingCity() {
		return originatingCity;
	}
	public void setOriginatingCity(String originatingCity) {
		this.originatingCity = originatingCity;
	}
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;
	}
	@Override
	public String toString() {
		return "Segment [segmentNumber=" + segmentNumber + ", segmentDate=" + segmentDate + ", flightNumber="
				+ flightNumber + ", originatingCity=" + originatingCity + ", miles=" + miles + "]";
	}
	
	
}
