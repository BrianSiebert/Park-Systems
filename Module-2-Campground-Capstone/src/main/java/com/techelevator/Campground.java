package com.techelevator;



import java.text.DateFormatSymbols;



public class Campground {

	private Long id;
	private Long park_id;
	private String name;
	private int open_from_mm;
	private int open_to_mm;
	private double daily_fee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOpen_from_mm() {
		return open_from_mm;
	}
	
	public String getOpeningMonth() {
		return new DateFormatSymbols().getMonths()[getOpen_from_mm()-1];
	}

	public void setOpen_from_mm(int openingTime) {
		this.open_from_mm = openingTime;
	}

	public int getOpen_to_mm() {
		return open_to_mm;
	}
	
	public String getClosingMonth() {
		return new DateFormatSymbols().getMonths()[getOpen_to_mm()-1];
	}

	public void setOpen_to_mm(int open_to_mm) {
		this.open_to_mm = open_to_mm;
	}

	public double getDaily_Fee() {
		return daily_fee;
	}

	public void setDaily_Fee(double daily_Fee) {
		this.daily_fee = daily_Fee;
	}

	public Long getPark_id() {
		return park_id;
	}

	public void setPark_id(Long park_id) {
		this.park_id = park_id;
	}
	public String toString() {
		return name;
	}
}
