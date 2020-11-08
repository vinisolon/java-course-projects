package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {

		//M�todo otimizado de utiliza��o dos readers (Java 7+)
		
		String path = "C:\\Users\\Vini\\Desktop\\Dev\\Java\\file-reader&buffered-reader\\text.txt";
		
		//M�todo *** try with resources ***
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
