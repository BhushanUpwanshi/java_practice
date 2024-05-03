package customerservicemanagement;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import static utils.passContainCheck.*;

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
	
	
	// parse and check if user is minor
	public static LocalDate validateDob(String dob) throws CustomerExceptions{
		LocalDate Dob = LocalDate.parse(dob);
		int age = Period.between(Dob ,LocalDate.now()).getYears();
		if(age>20)
			return Dob;
		throw new CustomerExceptions("---------Invalid Date--------");
	}
	
	//validation rules
	public static Customer ValidateDetails(String fname, String lname, String email, String password, String dob, double regiAmount,
			String splan,List<Customer> custList) throws CustomerExceptions {
		validateDupCust(email,custList);
		LocalDate dt =validateDob(dob);
		ServicePlan sp =validatePlan(splan,regiAmount);
		PassCheck(password);
		return new Customer(fname,lname,email, password, dt, regiAmount, sp);
	}
	
}
