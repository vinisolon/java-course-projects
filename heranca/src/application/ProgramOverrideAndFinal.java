package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramOverrideAndFinal {

	public static void main(String[] args) {

		Account acc = new Account(001, "Vinicius", 1000.0);
		acc.withdraw(100);
		System.out.println(acc.getBalance()); // Taxa de saque 5.0

		Account sacc = new SavingsAccount(002, "Camilla", 1000.0, 0.02);
		sacc.withdraw(100);
		System.out.println(sacc.getBalance()); // Taxa de saque 0.0
		
		Account bacc = new BusinessAccount(003, "Erika", 1000.0, 300.0);
		bacc.withdraw(100);
		System.out.println(bacc.getBalance()); // Taxa de saque 7.0
		
		// final no método deposit (classe Account) e na classe BusinessAccount
	}

}
