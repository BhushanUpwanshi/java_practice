package com.vehicle;

import java.util.Date;
import java.util.Scanner;

import exp.ColourNotFound;

import static com.vehicle.ValidationRules.*;
public class Tester {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String chasisNo;
		String color;
		int price;
//		Date manufacturingDate;
//		Date insuranceExpDate;
		double pollutionLevel;
		
		System.out.println("Enter the Chasis no. of vehicle ");
		chasisNo=sc.next();
		System.out.println("Enter the color of vehicle ");
	try
	{
		String validcolor=validateColor(sc.next().toUpperCase());
	}catch (Exception e) {
		System.out.println(e);
	}
	
		System.out.println("Enter the price of vehicle ");
		price=sc.nextInt();
		System.out.println("Enter mfgDate of the vehicle ");
		//manufacturingDate=sc.next();
		
	}

}
