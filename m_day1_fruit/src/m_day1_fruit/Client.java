package m_day1_fruit;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws BasketFullError {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter the no of fruits :");
		int n=in.nextInt();
		Fruit[] fr= new Fruit[n];
		
		FruitUtility.fruitOps(fr);
		
//		System.out.println(fr[0].getTaste());
		
		in.close();
	}
}
