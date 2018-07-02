package com.techelevator;


import java.time.LocalDate;

import java.util.List;


public interface CampsiteDAO {
	

	public List<Campsite> getAllCampsitesForCampground(Long campground_id);
	public List<Campsite> getAvailableCampsitesByDate(LocalDate start, LocalDate end);
	
}