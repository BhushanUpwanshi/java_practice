package com.app.entity;

import java.time.LocalDate;

public class BankStatement {
//	TransactionDate,Narration,WithdrawalAmount,DepositAmount
//	01-01-2023,Salary Credit,0.0,50000.0
	
	private LocalDate transactionDate;
	private String Naration;
	private double withdrawalAmount;
	private double depositAmount;
	
	public BankStatement(LocalDate transactionDate, String naration, double withdrawalAmount, double depositAmount) {
		super();
		this.transactionDate = transactionDate;
		Naration = naration;
		this.withdrawalAmount = withdrawalAmount;
		this.depositAmount = depositAmount;
	}
	
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getNaration() {
		return Naration;
	}
	public void setNaration(String naration) {
		Naration = naration;
	}
	public double getWithdrawalAmount() {
		return withdrawalAmount;
	}
	public void setWithdrawalAmount(double withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	@Override
	public String toString() {
		return "BankStatement [transactionDate=" + transactionDate + ", Naration=" + Naration + ", withdrawalAmount="
				+ withdrawalAmount + ", depositAmount=" + depositAmount + "]";
	}
}
