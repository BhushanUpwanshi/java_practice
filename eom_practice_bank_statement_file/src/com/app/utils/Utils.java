package com.app.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.entity.BankStatement;

public class Utils {
	public static List<BankStatement> populateList(){
		List<BankStatement> list=new ArrayList<BankStatement>();
		list.add(new BankStatement(LocalDate.parse("2023-01-01"),"Salary Credit",0.0,50000.0));
		list.add(new BankStatement(LocalDate.parse("2023-01-01"),"Mobile Recharge",300.0,0.0));
		list.add(new BankStatement(LocalDate.parse("2023-01-02"),"DTH Recharge",1000.0,0.0));
		list.add(new BankStatement(LocalDate.parse("2023-01-02"),"Rent Transfer",11000.0,0));
		list.add(new BankStatement(LocalDate.parse("2023-01-02"),"Cashback Paytm",0.0,1000.0));
		list.add(new BankStatement(LocalDate.parse("2023-01-05"),"Shopping",5000.0,0.0));
		list.add(new BankStatement(LocalDate.parse("2023-01-10"),"Shopping",7000.0,0.0));
		list.add(new BankStatement(LocalDate.parse("2023-01-15"),"Cashback",0.0,3000.0));
		list.add(new BankStatement(LocalDate.parse("2023-01-25"),"Mobile Purchase",10000.0,0.0));
		list.add(new BankStatement(LocalDate.parse("2023-01-31"),"Dining",1200.0,0.0));
		return list;
	}
}
