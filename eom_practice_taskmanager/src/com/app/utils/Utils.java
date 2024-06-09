package com.app.utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.app.task.Task;

public class Utils {
	public static Map<Integer, Task> popuateMap() {
		Map<Integer, Task> map=new HashMap<Integer, Task>();
//		taskName, String description, LocalDate taskDate
		map.put(1, new Task("Taask1", "Desc1", LocalDate.parse("2020-01-01")));
		map.put(2, new Task("Taask2", "Desc2", LocalDate.parse("2020-02-02")));
		map.put(3, new Task("Taask3", "Desc3", LocalDate.parse("2020-03-03")));
		map.put(4, new Task("Taask4", "Desc4", LocalDate.parse("2024-06-09")));
		map.put(5, new Task("Taask5", "Desc5", LocalDate.parse("2020-05-05")));
		return map;
	}
}
