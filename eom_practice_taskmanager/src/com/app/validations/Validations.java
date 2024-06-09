package com.app.validations;

import java.time.LocalDate;

import com.app.custexception.CustomException;
import com.app.task.Status;
import com.app.task.Task;

public class Validations {
	public static Status validateStatus(String status) throws CustomException{
		return Status.valueOf(status.toUpperCase());
	}
	
	public static Task validateTask(String task,String description,String taskDate) throws CustomException{
		return new Task(task, description, LocalDate.parse(taskDate));
	}
}
