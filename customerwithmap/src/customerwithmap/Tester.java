package customerwithmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import customerutils.Authentication;
import static customerwithmap.ValidationRules.*;
//import static customerutils.PutValues.*;

public class Tester {
	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)) {
			Map<String,Customer> custMap=new HashMap<>();
			boolean exit=false;
			
			while(!exit) {
				try{
					System.out.println("Enter 0 to exit:\nEnter 1 to sign up :"
							+ "\nEnter 2 to Sign in :\nEnter 3 to print Customer details :"
							+ "\nEnter 4 to sort as per key :\nEnter 5 to sort as per dob:");
					switch(sc.nextInt()) {
					case 0:
						exit=true;
						System.out.println("---------You are exiting the Customer Management Sysyiem--------");
						break;
					case 1:
//						System.out.println("Enter email,fname, lname, password, dob, regiAmount, plan ");
//						String email = sc.next();
//						custMap.put(email,ValidationRules.validationInp(sc.next(),sc.next(),email,sc.next(),sc.next(),sc.nextDouble(),sc.next(),custMap));
						custMap.put("w",validationInp("w"," k"," k", "Pass@123","2003-02-10", 2000,"gold",custMap));
						custMap.put("i",validationInp("i"," k"," k", "Pass@123","2001-04-10", 2000,"gold",custMap));
						custMap.put("p",validationInp("p"," k"," k", "Pass@123","2003-04-10", 2000,"gold",custMap));
						custMap.put("r",validationInp("r"," k"," k", "Pass@123","2002-04-10", 2000,"gold",custMap));
						custMap.put("j",validationInp("j"," k"," k", "Pass@123","2001-05-10", 2000,"gold",custMap));
						break;
						
					case 2:
						System.out.println("Enter email and password");
						Authentication.Login(sc.next(), sc.next(), custMap);
						break;
						
					case 3:
						for(Customer c: custMap.values())
							System.out.println(c);
						break;
					case 4:
						Map<String,Customer> custTreeMap=new TreeMap<>(custMap);
						for(Customer c:custTreeMap.values())
							System.out.println(c);
						break;
					case 5:
						List<Customer> valList=new ArrayList<>(custMap.values());
						Collections.sort(valList,new Comparator<Customer>() {
							public int compare(Customer c1,Customer c2) {
								return c1.getDob().compareTo(c2.getDob());
							}
						}
						);
						for(Customer c: valList)
							System.out.println(c);
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
