package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.app.entity.Railway;
import com.app.repository.RailwayRepository;
@Service
@Transactional
public class RailwayServiceImpl implements RailwayService {
	@Autowired
	private RailwayRepository repo;
	
	@Override
	public List<Railway> getAllRailway() {
		return repo.findAll();
	}

	@Override
	public String addRailway(Railway r) {
		return "Railway Added : "+repo.save(r);
	}

	@Override
	public String updateRailway(Railway r) {
		return "Railway Updated : "+repo.save(r);
	}

	@Override
	public String deleteRailwayById(Long Id) {
		if(repo.existsById(Id)) {
			repo.deleteById(Id);
			return "Railway with Id : "+Id+" deleted.";
		}
		return "Could not find Railway with id "+Id ;
	}

	@Override
	public Railway findById(Long Id) {
		return repo.findById(Id).get();
	}

	@Override
	public List<Railway> sortByStart_time() {
		return repo.findAll(Sort.by(Sort.Order.asc("startTime")));
	}

}
