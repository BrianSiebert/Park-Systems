package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;


public class JDBCCampgroundDAO implements CampgroundDAO {
	
	private JdbcTemplate template;
	
	public JDBCCampgroundDAO(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Campground> getAllCampgrounds(Park park) {
		List<Campground> campgrounds=new ArrayList<>();
		String sqlSelectAllCampGroundsByParkId="SELECT * FROM campGround where park_id=?";
		SqlRowSet rowsReturned= template.queryForRowSet(sqlSelectAllCampGroundsByParkId,park.getId());
		while(rowsReturned.next()){
			Campground camp= new Campground();
			camp.setId(rowsReturned.getLong("campGround_id"));
			camp.setName(rowsReturned.getString("name"));
			camp.setOpen_from_mm(rowsReturned.getInt("open_from_mm"));
			camp.setOpen_to_mm(rowsReturned.getInt("open_to_mm"));
			camp.setDaily_Fee(rowsReturned.getDouble("daily_fee"));
			camp.setId(rowsReturned.getLong("park_id"));
			campgrounds.add(camp);
		}
		return campgrounds;
	}

	

}