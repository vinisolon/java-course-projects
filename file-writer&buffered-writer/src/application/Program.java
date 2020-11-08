package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\Vini\\Desktop\\Dev\\Java\\file-writer&buffered-writer\\text.txt";
		Scanner str = new Scanner(System.in);
		String text = "";

		// try(BufferedWriter bw = new BufferedWriter(new FileWriter(path)))
		// Sem o "true" após indicar o path, ele cria/recria o arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			while (!text.equals("fim")) {
				text = str.next();
				if (!text.equals("fim")) {
					bw.write(text);
					bw.newLine();
				}
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			str.close();
		}
	}

}
