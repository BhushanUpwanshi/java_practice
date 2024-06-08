package eom.cam.pen.app;

import java.time.LocalDate;


public class Pen {
//	You can define a class Pen with the following fields – 
//	a.	ID (unique identifier for each Pen, should be generated automatically)
//	b.	Brand (Example:  Cello, Parker, Reynolds etc.)
//	c.	Color
//	d.	InkColor
//	e.	Material (Example: Plastic, Alloy Steel, Metal etc.)
//	f.	Stock (Available quantity)
//	g.	Stock Update Date (it changed every time when admin update stock or user order executed)
//	h.	Stock Listing Date (date on which product is added to site for sale)
//	i.	Price (in INR) 
//	j.	Discounts (in percentage)
	private int id;
	private String brand;
	private String color;
	private String inkColor;
	private String material;
	private int stock;
	private LocalDate stockUpdateDate;
	private LocalDate stockListingDate;
	private double price;
	private float discounts;
	
	private  static int idGenerator;

	public Pen(String brand, String color, String inkColor, String material, int stock, LocalDate stockUpdateDate,
			LocalDate stockListingDate, double price, float discounts) {
		super();
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.stockUpdateDate = stockUpdateDate;
		this.stockListingDate = stockListingDate;
		this.price = price;
		this.discounts = discounts;
		this.id=++idGenerator;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}

	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getDiscounts() {
		return discounts;
	}

	public void setDiscounts(float discounts) {
		this.discounts = discounts;
	}

//	@Override
//	public boolean equals(Object o)
//	{
//		System.out.println("in customer's equals");
//		if(o instanceof Customer)
//		{
//			Customer c=(Customer)o;
//			return this.email.equals(c.email);
//		}
//		//if the passed arg is not a Customer : ret false
//		return false;
//		
//	}
	
	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material="
				+ material + ", stock=" + stock + ", stockUpdateDate=" + stockUpdateDate + ", stockListingDate="
				+ stockListingDate + ", price=" + price + ", discounts=" + discounts + "]";
	}
	
	

}
