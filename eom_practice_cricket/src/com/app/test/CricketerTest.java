package com.app.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.entity.Cricketer;
import static com.app.utils.Utils.*;

public class CricketerTest {
	public static void main(String[] args) {
//		Use any collection you like to store the data.		
		try(Scanner sc=new Scanner(System.in)){
			Map<String, Cricketer> crMap=new HashMap<String, Cricketer>(); /*populatedMap();*/
			
			boolean exit=false;
			while(!exit) {
				System.out.println("Enter 0. to exit \n1. to add cricketer :"
						+ "\n2. change rating : \n3. to search cricketer by name :"
						+ "\n4. to display all cricketers :"
						+ "\n5. to display all cricketers in sorted order by rating");
				try {
					switch (sc.nextInt()) {
					case 0:
						exit=true;
						System.out.println("----------you have exited the program----------");
						break;
					case 1:
//						1.Accept minimum 5 Cricketers in the collection.
						crMap= populateMap();
//						System.out.println("Enter name, age, email_id, Phone, rating :");
//						String name=sc.next();
//						crMap.put(name, new Cricketer(name, sc.nextInt(), sc.next(), sc.next(), sc.nextInt()));
						System.out.println("--------cricketer added successfully--------");
						break;
					case 2:
//						2.Modify Cricketer's rating
						System.out.println("Enter cricketer's name and new rating");
						crMap.get(sc.next()).setRating(sc.nextInt());
						System.out.println("----------Cricketer's rating updated ---------");
						break;
					case 3:
//						3.Search Cricketer by name
						System.out.println("Enter Cricketers name");
						System.out.println("Cricketers details are : "+crMap.get(sc.next()));
						break;
					case 4:
//						4. Display all Cricketers added in collection.s
						List<Cricketer> list=new ArrayList<Cricketer>(crMap.values());
						System.out.println("all Cricketers added in collection's are : ");
						list.stream().forEach(c->System.out.println(c));
						break;
					case 5:
//						5.Display All Cricketers in sorted form by rating.
						List<Cricketer> list1=new ArrayList<Cricketer>(crMap.values());
						Collections.sort(list1,new Comparator<Cricketer>(){
							@Override
							public int compare(Cricketer c1, Cricketer c2) {
								if(c1.getRating()< c2.getRating())
									return -1;
								else if(c1.getRating()==c1.getRating())
									return 0;
								else return 1;
							}
						});
						list1.stream().forEach(l->System.out.println(l));
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
