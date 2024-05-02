package customerservicemanagement;

import java.time.LocalDate;
import java.util.List;

public class ValidateRules {
	
//	no dup customers (2 customers can't have the same email id)
	public static String validateDupCust(String email,List<Customer> custList) throws CustomerExceptions {
		Customer custTemp = new Customer(email);
		if (custList.contains(custTemp) )
			throw new CustomerExceptions("----------Email already exists---------");
		return email;
	}
	
//	Validate plan
	public static ServicePlan validatePlan(String plan,double regiAmount) throws CustomerExceptions {
//		ServicePlan sp= ServicePlan.valueOf(plan.toUpperCase());
		if(ServicePlan.valueOf(plan.toUpperCase()).getRegiAmount()==regiAmount)
			return ServicePlan.valueOf(plan.toUpperCase());
		throw new CustomerExceptions("---------invalid Service plan or registration amount ----------");
	}
	
	public static LocalDate validateDob(String dob) throws CustomerExceptions{
		try {
		return LocalDate.parse(dob);
		}catch(Exception e) {
			throw new CustomerExceptions("----------Invalid date-----------");
		}
	}
	
	
	public static Customer ValidateDetails(String fname, String lname, String email, String password, String dob, double regiAmount,
			String splan,List<Customer> custList) throws CustomerExceptions {
		validateDupCust(email,custList);
		LocalDate dt =validateDob(dob);
		ServicePlan sp =validatePlan(splan,regiAmount);
		return new Customer(fname,lname,email, password, dt, regiAmount, sp);
	}
	
}
