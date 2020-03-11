package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {
		
		System.out.println("init program");
		
		method1();
		
		System.out.println("end program");
	}

	public static void method1() {
		System.out.println("*** method1 init ***");
		method2();
		System.out.println("*** method1 end ***");
	}

	public static void method2() {
		System.out.println("*** method2 init ***");

		Scanner sc = new Scanner(System.in);

		try {
			
			// Bloco de execu��o da l�gica
			System.out.print("Words: ");
			String[] vector = sc.nextLine().split(" ");
			
			System.out.print("Position: ");
			int position = sc.nextInt();
			
			System.out.println(vector[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			// Tratamento do ArrayIndexOutOfBoundsException caso ocorra
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace(); // Exibe o Stack de eventos at� a exce��o
			sc.next();
			
		} catch (InputMismatchException e) {
			
			// Tratamento do InputMismatchException caso ocorra
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace(); // Exibe o Stack de eventos at� a exce��o
			sc.next();

		} finally {
			
			// Ser� executado independente do try-catch
			System.out.println("Finally executaded!");
			
		}
		
		sc.close();
		System.out.println("*** method2 end ***");
	}
}
