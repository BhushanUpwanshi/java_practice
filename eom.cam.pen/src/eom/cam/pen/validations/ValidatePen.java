package eom.cam.pen.validations;

import java.time.LocalDate;
import java.time.Period;

import eom.cam.pen.app.Pen;

public class ValidatePen {
//	3. Set discount of 20% for all the pens which are not at all sold in last 3 months
//	4. Remove Pens which arenever sold once listed in 9 months
	
	public static LocalDate validateStockUpdateDate(String date,double price) {
		LocalDate Date = LocalDate.parse(date);
		int months = Period.between(Date, LocalDate.now()).getMonths();
		if(months>=3)
			price=price*0.8;
		return Date;
			
	}
	
	
	public static Pen validatePen(String brand, String color, String inkColor, String material, 
			int stock, String stockUpdateDate,
			String stockListingDate, double price, float discounts) {
		LocalDate StockListingDate=LocalDate.parse(stockListingDate);
		LocalDate StockUpdateDate = validateStockUpdateDate(stockUpdateDate,price);
		return new Pen(brand, color, inkColor, material, stock, StockListingDate, StockUpdateDate, price, discounts);
	}
}
