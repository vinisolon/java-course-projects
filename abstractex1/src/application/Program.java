package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.FisicPerson;
import entities.JuridicPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();

		System.out.print("Number of taxpayer: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Data #" + (i + 1) + ": ");

			System.out.print("Juridic or fisic (j/f): ");
			char type = sc.next().charAt(0);
			sc.nextLine();

			if (type == 'j' || type == 'f') {

				System.out.print("Name: ");
				String name = sc.nextLine();

				System.out.print("Annual income: ");
				double annualIncome = sc.nextDouble();

				if (type == 'j') {

					System.out.print("Employees number: ");
					int employeesNumber = sc.nextInt();
					list.add(new JuridicPerson(name, annualIncome, employeesNumber));
				} else {

					System.out.print("Health expenses: ");
					double healthExpenses = sc.nextDouble();
					list.add(new FisicPerson(name, annualIncome, healthExpenses));
				} // end if

			} else {

				System.out.println("Incorret type of person!");
				i--;
			} // end if
		} // end for
		
		double taxSum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for(Person person : list) {
			double tax = person.taxCalculation();
			taxSum += tax;
			System.out.println(person.getName() + " $" + String.format("%.2f", tax));
		}
		
		System.out.println();
		System.out.print("TOTAL TAX: $" + String.format("%.2f", taxSum));
		sc.close();
	}

}
