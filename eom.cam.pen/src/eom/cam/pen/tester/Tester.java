package eom.cam.pen.tester;

import static eom.cam.pen.validations.ValidatePen.validatePen;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import eom.cam.pen.app.Pen;
import eom.cam.pen.utils.Utils;

public class Tester {

	public static void main(String[] args) {
//		1. Add new Pen
//		2. Update stock of aPen
//		3. Set discount of 20% for all the pens which are not at all sold in last 3 months
//		4. Remove Pens which arenever sold once listed in 9 months
		
//		Map<Integer, Pen> pens= new HashMap<Integer, Pen>();
		Map<Integer, Pen> pens= Utils.populatePens();
		
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			while(!exit){
				System.out.println("Enter 0 to Exit:\n"
						+ "Enter 1 to Add a new Pen :\n"
						+ "Enter 2 to Update stock of Pen :\n"
						+ "Enter 3 to display Pens :\n"
						+ "Enter 4 to remove unsold pen in last 9 months :\n"
						);
				try {
					switch (sc.nextInt()) {
					case 0:
						exit=true;
						System.out.println("----------You have exited the program----------");
						break;
					case 1:
//						String brand, String color, String inkColor, String material, 
//						int stock, LocalDate stockUpdateDate,
//						LocalDate stockListingDate, double price, float discounts
						System.out.println("Enter : brand, color, inkColor, material,"
								+ " stock, stockUpdateDate,"
								+ "stockListingDate, price, discounts");
//						Pen pen = new Pen(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), LocalDate.parse(sc.next()), LocalDate.parse(sc.next()), sc.nextDouble(),sc.nextFloat());
//						pens.put(pen.getId(), pen);
						Pen pen= validatePen(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(),sc.next(),sc.next(), sc.nextDouble(),sc.nextFloat());
						pens.put(pen.getId(), pen);
						break;
					case 2:
//						Stock Update Date (it changed every time when admin update stock or user 
//						order executed)
						System.out.println("Enter Pen Id, and New Stock Quantity");
						//System.out.println(pens.get(2));
						int id=sc.nextInt();
						pens.get(id).setStock(sc.nextInt());
						pens.get(id).setStockUpdateDate(LocalDate.now());
						System.out.println("--------Stock Updated successfully-------");
						break;
					case 3:
						for(Pen p:pens.values())
							System.out.println(p);
						break;
					case 4:
						//Successfully generated ConcurrentModificationException
//						4. Remove Pens which are never sold once listed in 9 months
//						for(Pen p : pens.values()) {
//							int months ;
//							Period diff =Period.between(p.getStockUpdateDate(),LocalDate.now());
//							if(diff.getYears()>=1) {
//							months = diff.getYears()*12 + diff.getMonths();
//							System.out.println("Months "+months);
//							}else
//								months = diff.getMonths();
//							System.out.println("Months "+months);
//							if(months>9) {
//								System.out.println("in if statement");
//								pens.remove(p.getId());
//							}
//						}
						//lets do it with iterator
//						List<Pen> plist= new ArrayList<Pen>(pens.values());
						Iterator<Pen> itr = pens.values().iterator();
						int months;
						while(itr.hasNext()) {
							Pen p= itr.next();
							Period period= Period.between(p.getStockUpdateDate(),LocalDate.now());
							if(period.getYears()>=1) {
								months = period.getYears()*12 + period.getMonths();
							}else
								months=period.getYears();
							if(months>9) {
								System.out.println("p.getId : "+p.getId());
								itr.remove();
//								pens.remove(p.getId());
							}
						}
						
						System.out.println("-----------Unsold Pens removes Successfully---------");	
						break;
					default:
						exit=true;
						System.out.println("----------Wrong choice----------");
						System.out.println("----------You have exited the program----------");
						break;
					}
				}catch(Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
			}
		}
	}

}
