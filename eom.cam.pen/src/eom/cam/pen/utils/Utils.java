package eom.cam.pen.utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import eom.cam.pen.app.Pen;

public class Utils {
//	String brand, String color, String inkColor, String material, int stock, LocalDate stockUpdateDate,
//	LocalDate stockListingDate, double price, float discounts
//	Cello Red blue plastic 30 2023-03-02 2014-03-01 10 20
	public static Map<Integer, Pen> populatePens(){
		Map<Integer,Pen> pens = new HashMap<Integer, Pen>();
		pens.put(1, new Pen("Cello", "Red", "blue" ,"plastic",50, LocalDate.parse("2023-03-02"),LocalDate.parse("2014-03-01"), 10d, 20f));
		System.out.println("In populate method ------- 1 :"+pens);
		pens.put(2, new Pen("Parker", "Yello", "black" ,"plastic",50, LocalDate.parse("2023-03-02"),LocalDate.parse("2014-03-01"), 10d, 20f));
		pens.put(3, new Pen("Reynolds", "Grey", "red" ,"plastic",50, LocalDate.parse("2024-03-02"),LocalDate.parse("2024-03-01"), 10d, 20f));
		pens.put(4, new Pen("Doms", "White", "blue" ,"plastic",50, LocalDate.parse("2023-03-02"),LocalDate.parse("2014-03-01"), 10d, 20f));
		pens.put(5, new Pen("Cello", "Cyan", "black" ,"plastic",50, LocalDate.parse("2023-03-02"),LocalDate.parse("2014-03-01"), 10d, 20f));
		System.out.println("In populate method"+pens);
		return pens;
	}
}
