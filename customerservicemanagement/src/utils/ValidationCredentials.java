package utils;

import java.util.List;

import customerservicemanagement.Customer;
import customerservicemanagement.CustomerExceptions;

public class ValidationCredentials {
	public static String validateCredentialCust(String email,String password, List<Customer> custList) throws CustomerExceptions {
		Customer custTemp =  new Customer(email);
		
		if(custList.contains(custTemp)) {
			int index=custList.indexOf(custTemp);
			if(((custList.get(index)).getPassword()).equals(password) )
				return "----------Usetr Successfully Logged In ----------";
			throw new CustomerExceptions("=-----------Inavlid  Password-----------=");
		}
		throw new CustomerExceptions("=-----------Inavlid User ID ------------=");
	}
	
	public static void changePassWord(String email,String oldPass,String newPass,List<Customer> custList) throws CustomerExceptions{
		validateCredentialCust(email,oldPass,custList);
		Customer ctemp=new Customer(email);
		custList.get(custList.indexOf(ctemp)).setPassword(newPass);
		System.out.println("-------------Password Changed Successfully-----------");
	}
	
	public static void delUser(String email,String password,List<Customer> custList) throws CustomerExceptions{
		validateCredentialCust(email,password,custList);
		Customer ctemp=new Customer(email);
		custList.remove(custList.indexOf(ctemp));
		System.out.println("---------user deleted Successfully----------");
	}
}
