package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Caminho da pasta: ");
		String strPath = sc.next();

		File path = new File(strPath);

		// Vetor recebendo todos os diretórios dentro do path
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("\nFolders");
		for (File folder : folders) {
			System.out.println(folder);
		}

		// vetor recebendo todos os arquivos dentro do path
		File[] files = path.listFiles(File::isFile);
		System.out.println("\nFiles");
		for (File file : files) {
			System.out.println(file);
		}

		// cria um diretório dentro do path
		boolean sucesso = new File(strPath + "\\teste").mkdir();
		System.out.println("\nPasta teste criada: " + sucesso);

		sc.close();
	}

}
