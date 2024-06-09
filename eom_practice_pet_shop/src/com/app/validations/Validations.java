package com.app.validations;

import java.util.Map;
import java.util.Scanner;

import com.app.entity.Category;
import com.app.entity.Order;
import com.app.entity.Pet;
import com.app.entity.Status;
import com.app.entity.UStatus;
import com.app.entity.User;
import com.app.exception.AuthenticationException;

public class Validations {
	public static Pet validatePet(User user) throws AuthenticationException{
		try(Scanner sc=new Scanner(System.in);){
		if(user.getStatus().equals(UStatus.ADMIN)) {
			System.out.println("petId, name,category, unitPrice, stocks : ");
			int petId=sc.nextInt();
			return new Pet(petId, sc.next(), Category.valueOf(sc.next().toUpperCase()), sc.nextDouble(), sc.nextInt());
			
		}else
			throw new AuthenticationException("Customer does not have permission to add a Pet");
		}
	}
	
	public static void validateUpdate(User u,Pet p) throws AuthenticationException {
		try(Scanner sc=new Scanner(System.in)){
			if(u.getStatus()==UStatus.ADMIN) {
//				double unitPrice, int stocks
				System.out.println("Enter Pet name, Pet category, Pet unitPrice, Pet stocks");
				p.setName(sc.next());
				p.setCategory(Category.valueOf(sc.next().toUpperCase()));
				p.setUnitPrice(sc.nextDouble());
				p.setStocks(sc.nextInt());
			}else 
				throw new AuthenticationException("Customer does not have permission to upate pet details");
		}
	}
	
	public static void validateOrderUpdate(User u,Map<Integer, Order> ordMap) {
		try(Scanner sc=new Scanner(System.in) ){
			if(u.getStatus()==UStatus.ADMIN) {
				ordMap.get(sc.nextInt()).setStatus(Status.valueOf(sc.next().toUpperCase()));
			}else
				new AuthenticationException("Customer does not have permission to upate Order Status");
		}
	}
}
