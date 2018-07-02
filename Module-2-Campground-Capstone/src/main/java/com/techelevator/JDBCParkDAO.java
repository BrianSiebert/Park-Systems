package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCParkDAO implements ParkDAO {
    
    private JdbcTemplate template;
    
    public JDBCParkDAO(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Park> getAllParks() {
        List<Park> parks = new ArrayList<>();
        String sqlSelectAllParks = "SELECT * FROM park ORDER BY name";
        SqlRowSet rows = template.queryForRowSet(sqlSelectAllParks);
        while (rows.next()) {
            parks.add(createPark(rows));
        }
        return parks;
    }
    
    private Park createPark(SqlRowSet rows) {
        Park park = new Park();
        park.setId(rows.getLong("park_id"));
        park.setName(rows.getString("name"));
        park.setLocation(rows.getString("location"));
        park.setEstablish_date(rows.getDate("establish_date").toLocalDate());
        park.setArea(rows.getInt("area"));
        park.setVisitors(rows.getInt("visitors"));
        park.setDescription(rows.getString("description"));
        return park;
    }
    
}