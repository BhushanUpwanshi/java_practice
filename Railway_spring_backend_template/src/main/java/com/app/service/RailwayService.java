package com.app.service;

import java.util.List;

import com.app.entity.Railway;

public interface RailwayService {
	List<Railway> getAllRailway();
	String addRailway(Railway r);
	String updateRailway(Railway r);
	String deleteRailwayById(Long Id);
	Railway findById(Long Id);
	List<Railway> sortByStart_time();
}
