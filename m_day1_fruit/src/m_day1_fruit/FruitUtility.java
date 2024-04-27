package m_day1_fruit;
import java.util.Scanner;
public class FruitUtility {
	
	public static void fruitOps(Fruit[] fr){
		System.out.println(fr.length);
		Scanner in=new Scanner(System.in);
		int count=0,ex=0;
		while(ex!=1) {
			try {
				if(count==fr.length) {
					throw new BasketFullError("Basket is full");
				}else {
						System.out.println("\n\nEnter 1 to add Mango:\nEnter 2 to add Orange :"
								+ "\nEnter 3 to add Apple :"
								+ "\nEnter 4 to Display Basket contents:"
								+ "\nEnter 5 to display name,color,weight , taste of all fresh fruits , in the basket."
								+ "\nEnter 6 to Mark a fruit in a basket , as stale"
								+ "\nEnter 7 to Mark all sour fruits stale"
								+ "\nEnter 8 to Invoke fruit specific functionality (pulp / juice / jam)"
								+ "\nEnter 9 to exit");
				}
			}
			catch(BasketFullError b) {
				System.out.println("-----------------------------------------");
				System.out.println(b.getMessage());
				System.out.println("-----------------------------------------");
				System.out.println("\nEnter 4 to Display Basket contents:"
						+ "\nEnter 5 to display name,color,weight , taste of all fresh fruits , in the basket."
						+ "\nEnter 6 to Mark a fruit in a basket , as stale"
						+ "\nEnter 7 to Mark all sour fruits stale"
						+ "\nEnter 8 to Invoke fruit specific functionality (pulp / juice / jam)"
						+ "\nEnter 9 to exit");
			}
			
			int ch=in.nextInt();
			String name;
			String color;
			double weight;
			boolean fresh;
			int idx;
			
			switch(ch) {
			case 1:
				try {
					if(count==fr.length) {
					throw new BasketFullError("Basket is full");
					}
					else {
				System.out.println("--------------Enter Mango details----------");
				System.out.print("Enter fruit name: ");
				name=in.next();
				System.out.print("Enter fruit color: ");
				color=in.next();
				System.out.print("Enter fruit weight: ");
				weight=in.nextInt();
				System.out.print("if fruit is fresh press true or press false for stale: ");
				fresh=in.nextBoolean();
				fr[count++]=new Mango(name,color,weight,fresh);
				System.out.println("--------------------------------------");
					}
				}
				catch(BasketFullError a) {
					System.out.println();
				}
				break;
			case 2:
				try {
					if(count==fr.length) {
					throw new BasketFullError("Basket is full");
					}
					else {
				System.out.println("-------------Enter Orange details----------");
				System.out.print("Enter fruit name: ");
				name=in.next();
				System.out.print("Enter fruit color: ");
				color=in.next();
				System.out.print("Enter fruit weight: ");
				weight=in.nextInt();
				System.out.print("if fruit is fresh press true or press false for stale: ");
				fresh=in.nextBoolean();
				fr[count++]=new Orange(name,color,weight,fresh);	
				System.out.println("--------------------------------------");
					}
				}
				catch(BasketFullError a) {
					System.out.println();
				}
				break;
			case 3:
				try {
					if(count==fr.length) {
					throw new BasketFullError("Basket is full");
					}
					else {
				System.out.println("--------------Enter Apple details----------");
				System.out.print("Enter fruit name: ");
				name=in.next();
				System.out.print("Enter fruit color: ");
				color=in.next();
				System.out.print("Enter fruit weight: ");
				weight=in.nextInt();
				System.out.print("if fruit is fresh press true or press false for stale: ");
				fresh=in.nextBoolean();
				fr[count++]=new Apple(name,color,weight,fresh);
				System.out.println("--------------------------------------");
					}
				}
				catch(BasketFullError a) {
					System.out.println();
				}
				break;
			
			case 4:
				
				//for(int i=0;i<fr.length;i++) {
				for(int i=0;i<fr.length;i++) {
//					System.out.println(fr.length);
					if(fr[i] instanceof Mango) {
						Mango m1= (Mango)fr[i];
						System.out.println("--------------Mango details----------");
//						System.out.println(m1.toString());
						m1.toString();
//						m1.taste();
//						m1.pulp();
						System.out.println("--------------------------------------");
					}
					else if(fr[i] instanceof Orange){
						Orange o1= (Orange)fr[i];
						System.out.println("--------------Orange details----------");
						System.out.println(o1.toString());
//						o1.taste();
//						o1.juice();
						System.out.println("--------------------------------------");
					}
					else if(fr[i] instanceof Apple) {
						Apple a1=(Apple)fr[i];
						System.out.println("--------------Apple details----------");
						System.out.println(a1.toString());
						
//						a1.taste();
//						a1.jam();
						System.out.println("--------------------------------------");
					}
				}
				break;
				
			case 5:
				for (int i=0;i<fr.length;i++) {
					if (fr[i].getFresh()) {
						System.out.println("NAme of the fruit is : "+fr[i].getName());
						System.out.println("Color of the fruit is : "+fr[i].getColor());
						System.out.println("Weight of the fruit is : "+fr[i].getWeight());
						System.out.println("Taste of the fruit is : "+fr[i].getTaste());
						System.out.println("--------------------------------------");
					}
				}
				break;
				
			case 6:
				System.out.println("Enter the index to mark that fruit stale :");
				idx=in.nextInt();
				if(idx>=0 || idx<fr.length) {
					fr[idx].setFresh(false);
					System.out.println("fruit at index position "+idx+" is marked stale");
				}

				System.out.println("--------------------------------------");
				break;
				
			case 7:
				for(int i=0;i<(count-1);i++) {
					if (fr[i].getTaste().equals("Sour")){
						fr[i].setFresh(false);
					}
				}
				System.out.println("All sour fruits marked stale (i.e. fresh = false)");
				System.out.println("--------------------------------------");
				break;
			
			case 8:
				System.out.println("Enter index no to call its specific finctionality : ");
				idx=in.nextInt();
				if(fr[idx] instanceof Mango) {
					((Mango)fr[idx]).pulp();
				}
				else if(fr[idx] instanceof Orange) {
					((Orange)fr[idx]).juice();
				}
				else if(fr[idx] instanceof Apple) {
					((Apple)fr[idx]).jam();
				}
				System.out.println("--------------------------------------");
				break;
				
			case 9:
				System.out.println("--------------------------------------");
				System.out.println("You have entered choice 5 you are exiting the program");
				System.out.println("--------------------------------------");
				ex=1;
				break;
			}
		}
		in.close();
	}
}
