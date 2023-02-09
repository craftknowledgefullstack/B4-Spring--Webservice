package com.webservice.demo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.webservice.demo.Model.Location;

@Component
public class DaoImp implements LocationDao {

	
	public static List<Location>list=new ArrayList<>();
	
	
	static {
		
		list.add(new Location(1, "222,4,5,55", "23,3,45,", "Addis ababa"));
		list.add(new Location(2, "22342,4,5,55", "233,3,45,", "USA"));
		
	}
	
	
	@Override
	public void savelocation(Location location) {
		// TODO Auto-generated method stub
		
		list.add(location);
	}

	@Override
	public Location findLocationById(int id) {
		// TODO Auto-generated method stub
		
		for (Location location : list) {
		
			if(location.getMapId()==id) {
				
				return location;
				
			}
			
		}
		
		return null;
	}

	@Override
	public List<Location> listofLocation() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public int deleteLocation(int id) {
		// TODO Auto-generated method stub
		
		for (Location location : list) {
			
			if (location.getMapId()==id) {
				
				list.remove(location);
				return id;
			}
		}
		
		return 0;
	}

}
