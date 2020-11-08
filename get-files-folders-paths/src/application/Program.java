package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		System.out.println("getName: " + path.getName());		// Nome do arquivo
		System.out.println("getParent: " + path.getParent());	// Pasta do arquivo
		System.out.println("getPath: " + path.getPath());		// Caminho completo do arquivo
		
		// Teste listando arquivos usando getname para impressão
		File[] files = path.listFiles(File::isFile);
		System.out.println("\nFiles");
		for (File file : files) {
			System.out.println(file.getName());
		}
		
		sc.close();
	}

}
