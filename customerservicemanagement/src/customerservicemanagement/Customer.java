package customerservicemanagement;

import java.time.LocalDate;

public class Customer implements Comparable<Customer>{
//	customer id : int
//	Store - first name, last name email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
//	Unique ID - email
	private int customer_id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private LocalDate dob;
	private double regiAmount;
	private ServicePlan splan;
	public static int idGenerator;
	
	public Customer( String fname, String lname, String email, String password, LocalDate dob,
			double regiAmount,ServicePlan splan) {
		super();
		this.customer_id = ++idGenerator;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.regiAmount = regiAmount;
		this.splan = splan;
	}
	
	public Customer(String email) {
		this.email=email;
	}
	
	
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", password=" + password + ", dob=" + dob + ", regiAmount=" + regiAmount +"Service Plan = "+splan+"]";
	}
	
	@Override 
	public boolean equals(Object o) {
		//RTTI
		if(o instanceof Customer) {
			//Downcast
			Customer c = (Customer)o;
			//equal checking
			return this.email.equals(c.email);
		}
		return false;
	}
	
	@Override 
	public int compareTo(Customer custTemp)
	{
		return (this.email).compareTo(custTemp.email);
	}
	
	
	
}
