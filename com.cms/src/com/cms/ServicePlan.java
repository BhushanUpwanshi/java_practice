package com.cms;

public enum ServicePlan {
	SILVER(1000),GOLD(2000), DIAMOND(5000),PLATINUM(10000); 
	
	private double registrationAmount;

	private ServicePlan(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}
}
