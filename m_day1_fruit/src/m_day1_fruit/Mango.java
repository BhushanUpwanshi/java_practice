package m_day1_fruit;

public class Mango extends Fruit{
	public Mango(String name,String color, double weight, boolean fresh) {
		super(name,color,weight, fresh);
	}
	@Override
	public String taste() {
//		System.out.println("Mango tastes Sweet.");
		return "Sweet";
	}
	
	public void pulp() {
		System.out.println("Mango pulp is extracted.");
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nFruit's Taste is : "+super.getTaste();
	}
}
