package m_day1_fruit;

public class Apple extends Fruit{
	
	public Apple(String name,String color, double weight,boolean fresh) {
		super(name,color,weight,fresh);
	}
	
	@Override
	public String taste() {
//		System.out.println("Apple tastes soury Sweet.");
		return "Sweet n Sour";
	}
	
	public void jam() {
		System.out.println("Apple jam is extracted.");
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nFruit's Taste is : "+super.getTaste();
	}
	
}
