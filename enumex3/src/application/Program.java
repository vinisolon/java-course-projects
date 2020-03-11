package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("E-mail: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String clientBirthDate = sc.nextLine();

		Client client = new Client(clientName, clientEmail, sdf.parse(clientBirthDate));

		System.out.println();

		System.out.println("Enter order data");
		System.out.print("Status: ");
		String orderStatus = sc.nextLine();

		Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);

		System.out.print("Number of itens in this order: ");
		int orderNumberOfItens = sc.nextInt();

		for (int i = 0; i < orderNumberOfItens; i++) {
			sc.nextLine();
			System.out.println("Item number #" + (i + 1));
			System.out.print("Product name: ");
			String orderProductName = sc.nextLine();
			System.out.print("Product price: ");
			Double orderProductPrice = sc.nextDouble();

			Product product = new Product(orderProductName, orderProductPrice);

			System.out.print("Quantity: ");
			int orderQuantity = sc.nextInt();

			OrderItem orderItem = new OrderItem(orderQuantity, orderProductPrice, product);
			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println(order);

		sc.close();
	}

}
