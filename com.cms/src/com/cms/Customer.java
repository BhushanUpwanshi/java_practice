package com.cms;
import java.time.LocalDate;
public class Customer {
	
	private int customer_id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int idGenerator;
	
	public Customer(String fname,String lname,String email,
			String password,double registrationAmount,LocalDate dob,ServicePlan plan){
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.password=password;
		this.registrationAmount=registrationAmount;
		this.dob=dob;
		this.plan=plan;
		this.customer_id = ++idGenerator;
	}
	public Customer(String email,String password) {
		this.email=email;
		this.password=password;
	}
	public Customer(String email) {
		this.email=email;
	}
	
	
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//	@Override
//	public boolean equals(Object o) {
//		if(o instanceof Customer)
//			return (this.email).equals(((Customer)o).email);
//		return false;
//	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Customer)
			return (this.email).equals(((Customer)o).email) && (this.password).equals(((Customer)o).password);
		return false;
	}
	
	
	@Override
	public String toString() {
		return "First Name : "+this.fname+"\nLast Name : "+this.lname+"\nEmail : "+this.email
				+"\nPassword "+this.password+"\nRegistration amount "+this.registrationAmount
				+"\nEnter Date of birth : "+this.dob +"\nServicePlan : " 
				+ this.plan;
	}
	
}
