package com.vehicle;

import java.time.LocalDate;

public class Vehicle {
	 private String chasisNo;
	 private Color color;
	 private double price;
	 private LocalDate manufacturingDate;
	 private LocalDate insuranceExpDate;
	 private double pollutionLevel;
	 
	 public Vehicle( ) {
		 this.chasisNo="chasis number";
		 this.color=null;
		 this.price=0;
		 this.manufacturingDate=manufacturingDate;
		 this.insuranceExpDate=insuranceExpDate;
	 }
	 
		public Vehicle(String chasisNo, Color color, double price, LocalDate manufacturingDate,
				LocalDate insuranceExpDate/* ,double pollutionLevel */) {
		 this.chasisNo=chasisNo;
		 this.color=color;
		 this.price=price;
		 this.manufacturingDate=manufacturingDate;
		 this.insuranceExpDate=insuranceExpDate;
	 }
		
//	validation rule pollution level < 20%
	public void setPollutionLevel(double pollutionLevel)throws InvalidColorException{
		if ( pollutionLevel > 0.2) 
			throw new InvalidColorException ("Pollution level exceeds the limit");
		this.pollutionLevel=pollutionLevel;
	}
	 public String getChasisNo() {
		 return chasisNo;
	 }
	 public double getPollutionLevel() {
		 return this.pollutionLevel;
	 }
	 
	 @Override
	 public String toString() {
		 return "chasisNo : "+chasisNo
				 +" color : "+color
				 +" price : "+price
				 +" manufacturingDate : "+manufacturingDate
				 +" insuranceExpDate : "+insuranceExpDate;
	 }
}
