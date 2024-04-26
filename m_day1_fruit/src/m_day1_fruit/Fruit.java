package m_day1_fruit;

public abstract class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean fresh;
	
	public Fruit(String name,String color, double weight,boolean fresh) {
		this.name=name;
		this.color=color;
		this.weight=weight;
		this.fresh=fresh;
	}
	
	public String getName() {
		return this.name;
	}
	public String getColor() {
		return this.color;
	}
	public double getWeight() {
		return this.weight;
	}
	public boolean getFresh() {
		return this.fresh;
	}
	public String getTaste() {
		return this.taste();
	}
	
	public void setFresh(boolean fresh) {
		this.fresh=fresh;
	}
	
	public abstract String taste();
	
	
	@Override
	public String toString() {
		return "Fruit name : "+this.name+
				"\nFruit color : "+ this.color+
				"\nFruit Weight : "+this.weight+
				"\nFruit's freshness: "+this.fresh;
	}
}
