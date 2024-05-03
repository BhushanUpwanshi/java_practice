package customerservicemanagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

import static customerservicemanagement.ValidateRules.*;
import static utils.ValidationCredentials.*;

public class CustTester {
	public static void main (String[] args) {
		
		try(Scanner sc=new Scanner(System.in)){
			
			List<Customer> custList = new ArrayList<>();
			
			boolean exit=false;
			while(!exit) {
				try {
					System.out.println("Enter 0 to exit: \nEnter 1 to sign up:\nEnter 2 to display Customers \nEnter 3 to Sign in:"
							+ "\nEnter 4 to change Password :\nEnter 5 to delete user :\nEnter 6 to sort the customers :"
							+ "\nEnter 7 to Sort using Custom Ordering anonymous class :");
					switch(sc.nextInt()) {
					
					case 0:
						exit=true;
						break;
						
					case 1:
						System.out.println("Enter fname, lname, email, password, dob, regiAmount, splan");
						Customer custTemp = ValidateDetails(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),custList);
						custList.add(custTemp);
						System.out.println("----------Sign up Successful--------");
						break;
							
					case 2:
						System.out.println("--------All User details are--------");
						for(Customer c: custList)
							System.out.println(c);
						break;
						
					case 3:
						System.out.println("Enter email and password to sign in ");
						System.out.println( validateCredentialCust(sc.next(),sc.next(),custList));
						System.out.println("---------You have signed in successfully--------");
						break;
						
					case 4:
						System.out.println("Enter Email , Olad Password and New Password ");
						changePassWord(sc.next(),sc.next(),sc.next(),custList);
						break;
						
					case 5:
						System.out.println("Enter Email and Password to delete that user");
						delUser(sc.next(),sc.next(),custList);
						break;
						
					case 6:
//						Display customer details sorted as per the email (asc)
						Collections.sort(custList);
						System.out.println("----------Customer's are sorted---------");
						break;
						
					case 7:
						Collections.sort(custList, new Comparator<Customer>() {
							public int compare(Customer c1,Customer c2) {
								return c1.compareTo(c2);
							}
						});
						System.out.println("----------Customer's are sorted---------");
						break;
						
					}
				}catch(Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			}
		}
		
		
	}
}

//Dev Anand D Anand@123 1004-03-01 2000 gold
//Vaidehi Anand A Anand@123 1004-03-01 2000 gold
//Shan Anand Z Anand@123 1004-03-01 2000 gold
//Ratan Anand K Anand@123 1004-03-01 2000 gold





