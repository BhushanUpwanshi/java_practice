package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

import com.app.entity.BankStatement;
import static com.app.utils.IOUtils.*;

public class Tester {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
//			List<BankStatement> list= populateList();
			List<BankStatement> list= new ArrayList<BankStatement>();
			boolean exit=false;
			while(!exit) {
				System.out.println("Enter \n1. to show details \n2.to save details in t.txt file\n"
						+ "3. read Details \n4. tasks ");
				try {
					switch(sc.nextInt()) {
					case 0:
						exit=true;
						System.out.println("--------you have exited the program------");
						break;
					case 1:
						System.out.println("Bank Statement Details are");
						list.stream().forEach(i->System.out.println(i));
						break;
					case 2:
						System.out.println("Enter file name");
						writeDetails(list.stream(),sc.next());
						break;
					case 3:
						System.out.println("Enter file name");
						ReadDetails(list, sc.next());
						break;
					case 4:
//						Display following details on the console: 
//							Sum of all deposits
//							Max deposit amount
//							Shopping expenses (sum of withdrawals for shopping)
//							Date on which maximum amount withdrawn
						double sum=list.stream().mapToDouble(l->l.getDepositAmount()).sum() ;
						System.out.println("Sum of all deposits are : "+sum);
						OptionalDouble max=list.stream().mapToDouble(l->l.getDepositAmount()).max();
						System.out.println("Max deposit amount : "+max);
						double shoppingExp=0;
						for(BankStatement b:list) {
							if(b.getNaration().equals("Shopping"))
								shoppingExp+=b.getWithdrawalAmount();
						}
						System.out.println("Shopping expenses (sum of withdrawals for shopping) : "+shoppingExp);
						
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
					sc.nextLine();
					e.printStackTrace();
				}
			}
			
			
			
		}
	}
}
