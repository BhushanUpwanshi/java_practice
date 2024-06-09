package com.app.tester;

import static com.app.utils.Utils.popuateMap;
import static com.app.validations.Validations.validateStatus;
import static com.app.validations.Validations.validateTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.task.Status;
import com.app.task.Task;

public class Tester {
	public static void main(String[] arr) {
		
//		Following functionalities are expected -
//
//		a. Add New Task                       
//		b. Delete a task                         
//		c. Update task status               
//		d. Display all pending tasks     
//		e. Display all pending tasks for today           
//		f.  Display all tasks sorted by taskDate        
		
		try(Scanner sc=new Scanner(System.in)){
			Map<Integer, Task> taskMap= popuateMap();
			Task tsk;
			boolean exit=false;
			while(!exit) {
				System.out.println("Enter :\n"
						+ "a. to Add New Task :\n"
						+ "b. to Delete a task :\n "
						+ "c. to Update task status :\n"
						+ "d. to Display all pending tasks :\n"
						+ "e. to Display all pending tasks for today :\n"
						+ "f. to Display all tasks sorted by taskDate :\n"
						+ "ex. to exit :\n");
				try {
					switch(sc.next()) {
					case "a":
						Task task=validateTask(sc.next(), sc.next(), sc.next());
						taskMap.put(task.getTaskId(),task);
						System.out.println("-------New Task Added-------");
						break;
					case "b":
						System.out.println("Enter Task Id :");
						//taskMap.remove(sc.nextInt());
						Task tk=taskMap.get(sc.nextInt());
						tk.setActive(false);
						System.out.println("Task deletes (Active Status Changed to False)");
						break;
					case "c":
						System.out.println("Enter Task Id and task status to update ");
						Task t=taskMap.get(sc.nextInt());
						t.setStatus(validateStatus(sc.next().toUpperCase()));
						break;
					case "d":
						System.out.println("-------pending tasks are--------\n");
						Iterator<Task> itr = taskMap.values().iterator();
						while(itr.hasNext()) {
							tsk =itr.next();
							if(tsk.getStatus()==Status.PENDING) {
								System.out.println(tsk);
							}
						}
						break;
					case "e":
						System.out.println("-------pending tasks for today are------");
						System.out.println(LocalDate.now());
//						to Display all pending tasks for today
						Iterator<Task> iterator = taskMap.values().iterator();
						while(iterator.hasNext()) {
							tsk=iterator.next(); 
							if(tsk.getStatus()==Status.PENDING && tsk.getTaskDate().equals(LocalDate.parse("2024-06-09"))) {
								System.out.println("in if--------");
								System.out.println(tsk);
							}
						}
						break;
					case "f":
//						Display all tasks sorted by taskDate 
						
//						Collections.sort(accounts, new Comparator<BankAccount>() {
							//
//						@Override
//						public int compare(BankAccount o1, BankAccount o2) {
//						// TODO Auto-generated method stub
//						return o2.getDob().compareTo(o1.getDob());
//						}
						List<Task> tList = new ArrayList<Task>(taskMap.values());
						Collections.sort(tList, new Comparator<Task>() {
							@Override
							public int compare(Task t1, Task t2) {
								return (t1.getTaskDate()).compareTo(t2.getTaskDate());
							}
						});
						tList.stream()
						.forEach(i->System.out.println(i));
						break;
					case "ex":
						System.out.println("-------exited the program-------");
						exit=true;
						break;
					}
				}catch(Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
			}
		}

	}
}
