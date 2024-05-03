package com.cms;
import java.time.LocalDate;
import java.util.Scanner;
import static com.cms.ValidationCms.*;

public class Tester {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the no of Customers");
			Customer[] csm = new Customer[sc.nextInt()];
			boolean exit=false;
			int counter=0;
			while(!exit) {
				try {
				System.out.println("Enter 0 to exit :\n1. Sign up :\n2. Sign in :\n3. Change Password");
				switch (sc.nextInt()) {
				case 0:
					exit = true;
					break;
					
				case 1:
					System.out.println("Enter Customer details: fname, lname, "
							+ "email, password, registrationAmount, dob, plan");
					
					Customer cmsval= cmsVal(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),
							sc.next(),sc.next(),csm);
					csm[counter++]=cmsval;
					System.out.println("Sign up complete !!!\nCustomer details are :");
					System.out.println(csm [counter-1]);
					break;
					
				case 2:
					System.out.println("Enter Email and Password : ");
					Customer cEPMatch = checkMailPass(sc.next(),sc.next(),csm);
					System.out.println("-------------- You have successfully signed in --------------");
					break;
					
				case 3:
					System.out.println("Enter user id, Old password and new password");
					System.out.println(changePass(sc.next(),sc.next(),sc.next(),csm));
					break;
					
				case 4:
					
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

// ram raghu ram@gmail.com Pass@123 50000 2024-04-30 gold
