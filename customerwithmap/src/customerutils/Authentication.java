package customerutils;

import java.util.Map;

import customerwithmap.CustException;
import customerwithmap.Customer;

public class Authentication {
	public static void Login(String email,String password,Map<String,Customer> custmap ) throws CustException{
//		System.out.println(custmap.get(email).getPassword());
		if( (custmap.get(email).getPassword()).equals(password))
			System.out.println("-----------You have logged in Successfully----------");
		else throw new CustException("------------Invalid credentials ------------");
	}
}