package customerwithmap;

import java.time.LocalDate;

public class Customer {
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
	public String getPassword() {
		return this.password;
	}
	
	public LocalDate getDob() {
		return this.dob;
	}
	
	@Override 
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", password=" + password + ", dob=" + dob + ", regiAmount=" + regiAmount +"Service Plan = "+splan+"]";
	}
	
}
