package com.techelevator;

public class Campsite {

	private Long site_id;
	private Long campground_id;
	private String site_number;
	private int max_occupancy;
	private boolean isAccessible = false;
	private int max_rv_length;
	private boolean hasUtilities = false;
	
	public Long getSite_id() {
		return site_id;
	}
	public void setSite_id(Long site_id) {
		this.site_id = site_id;
	}
	public Long getCampground_id() {
		return campground_id;
	}
	public void setCampground_id(Long campground_id) {
		this.campground_id = campground_id;
	}
	public String getSite_number() {
		return site_number;
	}
	public void setSite_number(String site_number) {
		this.site_number = site_number;
	}
	public int getMax_occupancy() {
		return max_occupancy;
	}
	public void setMax_occupancy(int max_occupancy) {
		this.max_occupancy = max_occupancy;
	}
	public boolean isAccessible() {
		return isAccessible;
	}
	public void setAccessible(boolean isAccessible) {
		this.isAccessible = isAccessible;
	}
	public int getMax_rv_length() {
		return max_rv_length;
	}
	public void setMax_rv_length(int max_rv_length) {
		this.max_rv_length = max_rv_length;
	}
	public boolean isHasUtilities() {
		return hasUtilities;
	}
	public void setHasUtilities(boolean hasUtilities) {
		this.hasUtilities = hasUtilities;
	}
	
	public String toString() {
		return site_number +"\t" + max_occupancy + "\t" + isAccessible + "\t" + max_rv_length + "\t" + hasUtilities;
	}
}