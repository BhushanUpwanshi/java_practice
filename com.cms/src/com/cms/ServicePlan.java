package com.cms;

public enum ServicePlan {
	SILVER(1000),GOLD(2000), DIAMOND(5000),PLATINUM(10000);
	
	private double registrationAmount;
	
	ServicePlan(double registrationAmount){
		this.registrationAmount=registrationAmount;
	}
	
	@Override
	public String toString() {
		return name()+" "+this.registrationAmount;
	}
		
}
