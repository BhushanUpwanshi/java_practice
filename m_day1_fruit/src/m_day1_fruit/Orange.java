package m_day1_fruit;

public class Orange extends Fruit {
	
	public Orange(String name,String color,double weight,boolean fresh) {
		super(name,color,weight,fresh);
	}
	@Override
	public String taste() {
//		System.out.println("Orange tastes sour.");
		return "Sour";
	}
	
	public void juice() {
		System.out.println("Orange Juice is extracted.");
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nFruit's Taste is : "+super.getTaste();
	}
}
