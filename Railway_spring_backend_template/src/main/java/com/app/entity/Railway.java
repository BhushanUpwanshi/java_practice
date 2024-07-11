package com.app.entity;



import java.sql.Time;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Railways")
public class Railway {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private Long Id;
	@Column(nullable = false)
	private String Name;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column(nullable = false)
	private Time startTime;
	@Column(nullable = false)
	private Time EndTime;
	@Column(nullable = false)
	private String source;
	@Column(nullable = false)
	private String destination;
	@Column(nullable = false)
	private String stationCode;
	@Column(nullable = false)
	private double distance;
	@Column(nullable = false)
	private int frequency;
	
	public Railway() {
		super();
	}

	

	public Railway(Long id, String name, Category category, Time startTime, Time endTime, String source,
			String destination, String stationCode, double distance, int frequency) {
		super();
		Id = id;
		Name = name;
		this.category = category;
		this.startTime = startTime;
		EndTime = endTime;
		this.source = source;
		this.destination = destination;
		this.stationCode = stationCode;
		this.distance = distance;
		this.frequency = frequency;
	}



	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Time getStart_time() {
		return startTime;
	}

	public void setStart_time(Time start_time) {
		this.startTime = start_time;
	}

	public Time getEnd_time() {
		return EndTime;
	}

	public void setEnd_time(Time end_time) {
		EndTime = end_time;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getStation_code() {
		return stationCode;
	}

	public void setStation_code(String station_code) {
		this.stationCode = station_code;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	
	
}
