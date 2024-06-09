package com.app.tester;

import static com.app.validations.Validations.validateOrderUpdate;
import static com.app.validations.Validations.validatePet;
import static com.app.validations.Validations.validateUpdate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.entity.Order;
import com.app.entity.Pet;
import com.app.entity.Status;
import com.app.entity.UStatus;
import com.app.entity.User;

public class Tester {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter : String email, String password, Ststus status ");
			User user=new User(sc.next(), sc.next(), UStatus.valueOf(sc.next().toUpperCase()));
			Map<Integer, Pet> petMap = new HashMap<Integer, Pet>();
			Map<Integer, Order> ordMap= new HashMap<Integer, Order>();
			boolean exit=false;
			while(!exit) {
//				Add new Pet (Admin only functionality)
//				Update Pet details (Admin only functionality)
//				Display all available pets
//				Order a Pet
//				Check order status by Order Id
//				Update order status (Admin only functionality)
				System.out.println("Enter :\n0. to exit :\n1. Add new Pet :\n2. Update Pet details :"
						+ "\n3. Display all available pets :\n4.Order a Pet :\n5. Check order status by Order Id :"
						+ "\n6. Update order status");
				try {
					switch(sc.nextInt()) {
					case 0:
						exit=true;
						System.out.println("--------you have exited the program-------");
						break;
					case 1:
//						Add new Pet (Admin only functionality)
//						int petId, String name, Category category, double unitPrice, int stocks
						Pet p=validatePet(user);
						petMap.put(p.getPetId(),p);
						System.out.println("---------Pet added successfully--------");
						break;
					case 2:
//						Update Pet details (Admin only functionality)
						p=petMap.get(sc.nextInt());
						validateUpdate(user, p);
						System.out.println("---------pet details updated successfully--------");
						break;
					case 3:
//						Display all available pets
						petMap.values().stream().forEach(l->System.out.println(l));
						break;
					case 4:
//						Order a Pet
						System.out.println("int orderId, int petId, int quantity, Status status");
						Order o=new Order(sc.nextInt(), sc.nextInt(), sc.nextInt(), Status.valueOf(sc.next().toUpperCase()));
						ordMap.put(o.getOrderId(), o);
						System.out.println("----------Pet Order Added-------");
						break;
					case 5:
//						Check order status by Order Id
						System.out.println("Enter order id :");
						System.out.println(ordMap.get(sc.nextInt()));
						break;
					case 6:
//						Update order status (Admin only functionality)
						validateOrderUpdate(user,ordMap);
						System.out.println("-------- Order Status updated successfully -------");
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
