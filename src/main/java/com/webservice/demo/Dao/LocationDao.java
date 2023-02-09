package com.webservice.demo.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.webservice.demo.Model.Location;

@Component
public interface LocationDao {

	public void savelocation( Location location );
	public  Location   findLocationById(int id); 
	public List<Location> listofLocation();
	public  int  deleteLocation(int id);
	
	
}
