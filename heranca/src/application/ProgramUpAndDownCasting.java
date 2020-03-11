package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramUpAndDownCasting {

	public static void main(String[] args) {
		
		Account acc = new Account(101, "Vinicius Solon", 0.0);
		BusinessAccount bacc = new BusinessAccount(102, "Camilla Dias", 0.0, 1000.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(103, "Ronaldo", 0.0, 300.0);
		Account acc3 = new SavingsAccount(104, "Henrique", 0.0, 0.03);
		
		// DOWNCASTING
		
		/*
		 * BusinessAccount acc4 = (BusinessAccount) acc3;
		 * Erro em tempo de execução porque a acc3 é uma SavingsAccount e não uma BusinessAccount
		*/
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		// Verifica se acc3 é uma instancia de BusinessAccount
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(50.0);
			System.out.println("Loan!");
		}
		
		// Verifica se acc3 é uma instancia de SavingsAccount
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			System.out.println(acc5.getHolder());
		}
	}
}
