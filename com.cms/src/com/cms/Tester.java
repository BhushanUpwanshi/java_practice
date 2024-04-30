package com.cms;
import java.time.LocalDate;
import java.util.Scanner;
import static com.cms.ValidationCms.cmsVal;

public class Tester {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the no of Customers");
			Customer[] csm = new Customer[sc.nextInt()];
			boolean exit=false;
			int counter=0;
			while(!exit) {
				System.out.println("Enter 0 to exit, 1. Sign up, ");
				switch (sc.nextInt()) {
				case 0:
					exit = true;
					break;
					
				case 1:
					System.out.println("Enter Customer details: fname, lname, "
							+ "email, password, registrationAmount, dob, plan");
					
					Customer cmsval= cmsVal(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),
							sc.next(),sc.next());
					csm[counter++]=cmsval;
					System.out.println(csm [counter-1]);
					break;
					
				}
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
