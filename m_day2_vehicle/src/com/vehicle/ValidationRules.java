package com.vehicle;

//import exp.*;
import java.time.LocalDate;


public class ValidationRules {
	
//	validation rule pollution level < 20%
//	public static double validatePollution(double pollutionLevel) throws InvalidColorException {
//		if ( pollutionLevel > 0.2) 
//			throw new InvalidColorException ("Pollution level exceeds the limit");
//			return pollutionLevel;
//	}
	
//	validation rule color within supported colors i.e. enum
	public static Color valColor(String color) throws InvalidColorException{
		try {
		return Color.valueOf(color);
		}
		catch(Exception e) {
			throw new InvalidColorException("Invalic color !!! please choose suitable color ");
		}
	}
	//date validation
	public static LocalDate dateValidation(String date) throws InvalidColorException {
		try {
		return LocalDate.parse(date);
		}
		catch(Exception e) {
			throw new InvalidColorException("Date format does not match");
		}
	}
	
//	validation method 
	public static Vehicle VehicleValidation(String chasisNo,String color,
			double price,String manufacturingDate,String insuranceExpDate
			/*,double pollutionLevel*/)throws InvalidColorException 
	{
		Color clr= valColor(color);
		LocalDate mfg = dateValidation(manufacturingDate);
		LocalDate insexp = dateValidation(insuranceExpDate);
		/* double pollulevel = validatePollution(pollutionLevel/100); */
		
		return new Vehicle(chasisNo, clr, price, mfg, insexp/* ,pollulevel */);
	}
	
//	  public static String validateColor(String cl)throws IllegalArgumentException
//	  { 
//		  return Color.valueOf(cl).toString(); 
//		  
//	  }
//	  
}
	 

	/*
	 * public String validateColor(String cl)throws IllegalArgumentException { try {
	 * return Color.valueOf(cl).toString(); } catch (Exception e) { throw new
	 * IllegalArgumentException ("Color is invalid please select valid choice "); }
	 * } }
	 */
  
 

/*
 * public static String validateColor(String cl) throws ColourNotFound {
 * 
 * //// Color c1 = Color.valueOf(cl); //// throw new
 * InvalidColorException("aG	W"); ////// return c1; //// ////// return cl; //
 * try { // Color cnew = Color.valueOf(cl); // System.out.println(cnew); // for
 * (Color c : Color.values()) { // if (c.equals(cnew)) { // return cl; // } //
 * // } // throw new ColourNotFound("not exist"); // // } catch (Exception e) {
 * // System.out.println(e); // return e.toString(); // } try { Color
 * c=Color.valueOf(cl); return c.toString(); //return
 * Color.valueOf(cl).toString(); } catch (Exception e) { // TODO: handle
 * exception throw new ColourNotFound("Not found");
 * 
 * } } }
 */