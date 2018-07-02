package com.techelevator;

import java.time.LocalDate;

public class Reservation {
	
	private Long reservation_id;
	private Long site_id;
	private String name;
	private LocalDate from_date;
	private LocalDate to_date;
	
	public Long getReservation_id() {
		return reservation_id;
	}
	public void setReservationid(Long reservation_id) {
		this.reservation_id = reservation_id;
	}
	public Long getSite_id() {
		return site_id;
	}
	public void setSite_id(Long site_id) {
		this.site_id = site_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getFrom_date() {
		return from_date;
	}
	public void setFrom_date(LocalDate from_date) {
		this.from_date = from_date;
	}
	public LocalDate getTo_date() {
		return to_date;
	}
	public void setTo_date(LocalDate to_date) {
		this.to_date = to_date;
	}
	
}