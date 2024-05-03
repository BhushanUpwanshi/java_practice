package com.cms;

import java.time.LocalDate;

public class ValidationCms {
	
	public static ServicePlan validateServicePlan(String plan,double registrationAmount) throws CmsExceptions  {
//		try {
		ServicePlan pla=ServicePlan.valueOf(plan.toUpperCase());
			if (pla.getRegistrationAmount() ==registrationAmount)
				return ServicePlan.valueOf(plan) ;
//		}catch (Exception e) {
		throw new CmsExceptions("----------Invalid service plan : Enter valid Service plan-------------");
//		}
	}
	
	public static LocalDate validateDate(String dat) throws CmsExceptions {
		try {
			return LocalDate.parse(dat);
		}catch (Exception e) {
			throw new CmsExceptions("------------Invalid Date : Enter valid Date-----------");
			}
	}
	
//	public static String existingUser(String email,Customer[] cust)throws CmsExceptions {
//		Customer c1 = new Customer (email);
//		for (Customer cu:cust)
//			if(cu !=null && cu.equals(c1))
//				throw new CmsExceptions("-----------Email already Exists---------");
//		return email;
//	}
	
	public static Customer cmsVal(String fname,String lname,String email,
			String password,double registrationAmount,String dob,String plan,Customer[] cust)throws CmsExceptions {
		LocalDate date=validateDate(dob);
		ServicePlan sp =validateServicePlan(plan.toUpperCase(),registrationAmount);
		Customer custm = checkMailPass(email,password,cust);
		return new Customer(fname,lname,email,password,registrationAmount,date,sp);
	}
	
	
	public static Customer checkMailPass(String email, String Password, Customer[] crr) throws CmsExceptions {
		Customer ctemp = new Customer(email,Password);
		for(Customer c: crr) {
			if(c != null && c.equals(ctemp))
				return c;
		}throw new CmsExceptions("----------Inavlid Email or Password.---------");
	}
	
	public static String changePass(String uname,String oldPass,String newPass,Customer[] cust) throws CmsExceptions {
		checkMailPass(uname,oldPass,cust).setPassword(newPass);
		return "---------- Password changed Successfully ----------";
	}
	
}
