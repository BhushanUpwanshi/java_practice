package com.vehicle;

import java.util.Date;
import java.util.Scanner;
import static com.vehicle.ValidationRules.*;

public class Tester {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of vehicles ");
		Vehicle[] vrr=new Vehicle[sc.nextInt()];
		int counter=0;
		boolean exit=false;
		
		while(!exit) {
		System.out.println("Enter 1 for adding the vehicle"
				+ "\nEnter 2 to Drive the vehicle"
				+ "\nEnter 0 to exit");
		switch(sc.nextInt()) {
		case 1:
//		Vehicle v1= new Vehicle(String chasisNo,Color color,int price,Date manufacturingDate,Date insuranceExpDate,double pollutionLevel);
			if(counter<vrr.length) {
			try {
			System.out.println("Enter Chasis no: \nvehicle color (WHITE , SILVER , BLACK , RED , BLUE): \nEnter Price: \nEnter manufacturingDate :\nEnter insuranceExpDate : \nEnter pollutionLevel");
			Vehicle v = VehicleValidation (sc.next(),sc.next().toUpperCase(),sc.nextDouble(),sc.next(),sc.next()/*,sc.nextDouble()*/);
			System.out.println(v);
			vrr[counter++]=v;
		}catch(Exception e) {
			System.out.println(e);
		}
			}else {
				System.out.println("Garage is full cannot add new vehicle");
			}
		break;
		
		case 2:
			System.out.println("Enter the chasis no.");
			String ch = sc.next();
			for(Vehicle v: vrr) {
				if((v.getChasisNo()).equals(ch)) {
					System.out.println("Enter the no of kilomiters the vehicles has driven (for 100 km 1% pollution level)");
					try {
					v.setPollutionLevel(sc.nextDouble()/100);
					}catch(Exception e) {
						System.out.println(e);
					}
					break;
				}
			}
			
			break;
		case 0:
			exit = true;
			break;
	}
}
		
		
//		String chasisNo;
//		String color;
//		double price;
//		String manufacturingDate;
//		String insuranceExpDate;
//		double pollutionLevel;
//		
//		System.out.println("Enter the Chasis no. of vehicle ");
//		chasisNo=sc.next();
//		System.out.println("Enter the color of vehicle ");
//	try
//	{
//		String validcolor = validateColor(sc.next().toUpperCase());
//	}catch (Exception e) {
//		System.out.println(e);
//	}
//	
//		System.out.println("Enter the price of vehicle ");
//		price=sc.nextInt();
//		System.out.println("Enter mfgDate of the vehicle ");
//		//manufacturingDate=sc.next();
//		
		sc.close();
	}

}
