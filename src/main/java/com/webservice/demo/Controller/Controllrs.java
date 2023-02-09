package com.webservice.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.demo.Dao.LocationDao;
import com.webservice.demo.Model.Location;

@RestController
public class Controllrs {

	@Autowired
	LocationDao dao;
	
	@PostMapping("/location")
	
	public ResponseEntity<?> saveLoation( @RequestBody Location location) {
		
		
	dao.savelocation(location);
		
		return new ResponseEntity<>(location,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/location")
	
	public List<Location> listoflocation(){
		
		
		
		return dao.listofLocation();
	}
	
	
	@GetMapping("/location/{id}")
	
	public ResponseEntity<Object> findlocationByid(@PathVariable("id") int id  ){
		
		
		
		  Location location= dao.findLocationById(id);
		
		  return new ResponseEntity<>(location,HttpStatus.FOUND);
	}
	
}
