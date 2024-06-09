package com.app.utils;

import java.util.HashMap;
import java.util.Map;

import com.app.entity.Cricketer;

public class Utils {
	
	public static Map<String, Cricketer> populateMap(){
//		String name,int age,String email_id,String Phone,int rating
		Map<String, Cricketer> map=new HashMap<String, Cricketer>();
		map.put("name1", new Cricketer("name1", 10, "e1@gmail.com", "9999999999", 5));
		map.put("name2", new Cricketer("name2", 12, "e2@gmail.com", "9999999999", 4));
		map.put("name3", new Cricketer("name3", 14, "e3@gmail.com", "9999999999", 2));
		map.put("name4", new Cricketer("name4", 15, "e4@gmail.com", "9999999999", 4));
		map.put("name5", new Cricketer("name5", 16, "e5@gmail.com", "9999999999", 1));
		return map;
	}
}
