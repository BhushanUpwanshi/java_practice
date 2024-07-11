package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Railway;
import com.app.exception.CustomException;
import com.app.service.RailwayService;

@RestController
@RequestMapping("/Railway")
public class RailwayController {
	@Autowired
	private RailwayService rservice;
	
	@GetMapping("/getAllRailway")
	public List<Railway> getAllRailway(){
		return rservice.getAllRailway();
	}
	@PostMapping("/addRailway")
	public String addRailway(@RequestBody Railway r) {
		try {
			if((r.getStart_time().compareTo(r.getEnd_time()))==1) {
				throw new CustomException("End time cannot be before end time");
			}
		}catch(Exception e) {
			return e.getMessage();
		}
		return rservice.addRailway(r);
	}
	@PutMapping("/updateRailway")
	public String updateRailway(@RequestBody Railway r) {
		return rservice.updateRailway(r);
	}
	@DeleteMapping("/deleteRailway/{Id}")
	public String deleteRailway(@PathVariable Long Id) {
		return rservice.deleteRailwayById(Id);
	}
	@GetMapping("/sortByStart_time")
	public List<Railway> sortByStart_time(){
		return rservice.sortByStart_time();
	}
}
