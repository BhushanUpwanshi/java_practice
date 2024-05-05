package customerwithmap;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

public class ValidationRules {
	
	public static void AuthenticateUser(String password)throws CustException {
		String regx = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%!^&]).{5,10})";
		if(!password.matches(regx))
			throw new CustException("----------Password Pattern mismath----------");
	}
	
	public static void validateDups(String email,Map<String,Customer> custMap) throws CustException{
		if(custMap.containsKey(email))
			throw new CustException("---------Email already exists--------");
	}
	
	public static LocalDate validateDob(String dob) throws CustException{
		LocalDate Dob= LocalDate.parse(dob);
		int age = Period.between(Dob, LocalDate.now()).getYears();
		if(age>20) 
			return Dob;
		throw new CustException("--------Date is invalid ----------");
	}
	
	public static ServicePlan validatePlan(double regiAmount,String splan) throws CustException {
		if( ServicePlan.valueOf(splan.toUpperCase()).getRegiamount() == regiAmount)
			return ServicePlan.valueOf(splan.toUpperCase());
		throw new CustException("---------Invalid Service Plan--------");
	}

	
	public static Customer validationInp(String fname, String lname, String email, String password, String dob,
			double regiAmount,String splan,Map<String,Customer> custMap) throws CustException {
		validateDups(email, custMap);
		AuthenticateUser(password);
		return new Customer(fname, lname, email , password, validateDob(dob), regiAmount, validatePlan(regiAmount, splan));
	}
}
