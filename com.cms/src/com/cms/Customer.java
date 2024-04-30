package com.cms;
import java.time.LocalDate;
public class Customer {
	
	private static int customer_id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	
	static {
		customer_id=0;
	}
	
	public Customer(String fname,String lname,String email,
			String password,double registrationAmount,LocalDate dob,ServicePlan plan){
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.password=password;
		this.registrationAmount=registrationAmount;
		this.dob=dob;
		this.plan=plan;
		customer_id++;
	}
	
	public String toString() {
		return "First Name : "+this.fname+"\nLast Name : "+this.lname+"\nEmail : "+this.email
				+"\nPassword "+this.password+"\nRegistration amount "+this.registrationAmount
				+"\nEnter Date of birth : "+this.dob +"\nServicePlan : " 
				+ this.plan;
	}
	
}
