package model.entities;

import model.exceptions.WithdrawException;

public class Account {

	private Integer number;
	private String name;
	private Double balance;
	private Double withdrawLimit;

	public Account() {

	}

	public Account(Integer number, String name, Double balance, Double withdrawLimit) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws WithdrawException {
		
		if(balance < amount) {
			throw new WithdrawException("Not enough balance");
		}
		
		if(amount > withdrawLimit) {
			throw new WithdrawException("Amount exceeds withdraw limit");
		}
		
		balance -= amount;
		System.out.println("New balance: " + getBalance());
	}
	
	public String toString() {
		return "Number: " + getNumber()
				+ ", Holder: " + getName()
				+ ", Balance: " + getBalance()
				+ ", Withdraw Limit: " + getWithdrawLimit();
	}
}
