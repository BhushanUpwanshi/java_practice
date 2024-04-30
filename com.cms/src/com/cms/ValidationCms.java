package com.cms;

import java.time.LocalDate;

public class ValidationCms {
	
	public static ServicePlan validateServicePlan(String plan) throws CmsExceptions  {
		try {
		return ServicePlan.valueOf(plan);
		}catch (Exception e) {
		throw new CmsExceptions("Invalid service plan : Enter valid Service plan");
		}
	}
	
	public static LocalDate validateDate(String dat) throws CmsExceptions {
		try {
			return LocalDate.parse(dat);
		}catch (Exception e) {
			throw new CmsExceptions("Invalid Date : Enter valid Date");
			}
	}
	
	public static Customer cmsVal(String fname,String lname,String email,
			String password,double registrationAmount,String dob,String plan)throws CmsExceptions {
		LocalDate d1=validateDate(dob);
		ServicePlan sp =validateServicePlan(plan.toUpperCase());
		
		return new Customer(fname,lname,email,password,registrationAmount,d1,sp);
	}
}
