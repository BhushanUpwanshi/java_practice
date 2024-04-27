package com.vehicle;

import java.util.Date;

public class Vehicle {
	 private String chasisNo;
	 private Color color;
	 private int price;
	 private Date manufacturingDate;
	 private Date insuranceExpDate;
	 private double pollutionLevel;
	 
	 public double getPollutionLevel() {
		 return this.pollutionLevel;
	 }
}
