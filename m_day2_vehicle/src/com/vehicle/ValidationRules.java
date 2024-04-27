package com.vehicle;

import exp.*;

public class ValidationRules extends Vehicle {
	public String validatePollution() {
		if (super.getPollutionLevel() > 20) {
			return "Pollution level is beyond tolerance";

		} else
			return "Pollution is under control";
	}

	/*
	 * public void validateColor(String cl)throws IllegalArgumentException {
	 * Color.valueOf(cl);
	 * 
	 * // return "color is exist"; }
	 */

	public static String validateColor(String cl) throws ColourNotFound {

////    	  Color c1 = Color.valueOf(cl);
////    	  throw new InvalidColorException("aG	W");
//////    	  return c1;
////    	  
//////    	  return cl;
//		try {
//			Color cnew = Color.valueOf(cl);
//			System.out.println(cnew);
//			for (Color c : Color.values()) {
//				if (c.equals(cnew)) {
//					return cl;
//				}
//
//			}
//			throw new ColourNotFound("not exist");
//
//		} catch (Exception e) {
//			System.out.println(e);
//			return e.toString();
//		}
			try {
				Color c=Color.valueOf(cl);
				return c.toString();
				//return Color.valueOf(cl).toString();
			} catch (Exception e) {
				// TODO: handle exception
				throw new ColourNotFound("Not found");
				
			}
	}
}
