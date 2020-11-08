package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("ACCOUNT DATA");

			System.out.print("Number: ");
			int number = sc.nextInt();

			sc.nextLine();
			System.out.print("Holder: ");
			String name = sc.nextLine();

			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();

			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account account = new Account(number, name, balance, withdrawLimit);

			System.out.println();
			System.out.println(account);
			System.out.println();

			System.out.print("Amount for withdraw: ");
			account.withdraw(sc.nextDouble());
		} catch (WithdrawException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Runtime Error");
		}

		sc.close();
	}
}