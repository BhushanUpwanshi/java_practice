package utils;

import customerservicemanagement.CustomerExceptions;

public class passContainCheck {
	public static void PassCheck(String pass) throws CustomerExceptions {
		String regEx = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[*@$%&#]).{5,10})";
		if (!pass.matches(regEx)) {
				throw new CustomerExceptions("-------Password does not matches pattern---------");
		}else System.out.println("---------valid password pattern--------");
	}
}
