package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();

		System.out.print("Number of shapes: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Shape #" + (i + 1 + ": "));

			System.out.print("Rectangle or circle? (r/c): ");
			char type = sc.next().charAt(0);
			sc.nextLine();

			if (type == 'r' || type == 'c') {

				System.out.print("Color BLACK, BLUE or RED: ");
				Color color = Color.valueOf(sc.nextLine().toUpperCase());

				if (type == 'r') {

					System.out.print("Width: ");
					double width = sc.nextDouble();

					System.out.print("Heidth: ");
					double height = sc.nextDouble();

					list.add(new Rectangle(color, width, height));
				} 
				else {

					System.out.print("Radius: ");
					double radius = sc.nextDouble();

					list.add(new Circle(color, radius));
				}
			} 
			else {
				System.out.println("Incorrect shape!");
				i--;
			}
		}
		
		System.out.println("SHAPE AREAS");
		for(Shape shape : list) {
			System.out.println(shape.area());
		}
		
		sc.close();
	}

}
