package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("CSV Path: ");
		String caminhoArquivoA = sc.nextLine();

		// Abre arquivo csv com os produtos
		File arquivoA = new File(caminhoArquivoA);

		// pegando pasta onde esta o arquivo A
		String pastaArquivoA = arquivoA.getParent();

		// criando nova pasta
		boolean sucesso = new File(pastaArquivoA + "\\pasta-arq-b").mkdir();

		String caminhoArquivoB = pastaArquivoA + "\\pasta-arq-b\\b.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivoA))) {

			String itemCsv = br.readLine();

			while (itemCsv != null) {

				String[] campos = itemCsv.split(",");
				String name = campos[0];
				Double price = Double.parseDouble(campos[1]);
				int quantity = Integer.parseInt(campos[2]);

				list.add(new Product(name, price, quantity));

				itemCsv = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivoB))) {
				
				for(Product product : list) {
					bw.write(product.getName() + "," + String.format("%.2f", product.total()));
					bw.newLine();
				}
				System.out.println(caminhoArquivoB + " Criado!");
			} 
			catch (IOException e) {
				System.out.println("Erro escrevendo arquivo: " + e.getMessage());
			}
		} 
		catch (IOException e) {
			System.out.println("Erro lendo arquivo: " + e.getMessage());
		}
		sc.close();
	}

}
