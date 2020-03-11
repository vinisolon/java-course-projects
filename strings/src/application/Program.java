package application;


public class Program {

	public static void main(String[] args) {
		
		/* Strings s�o imutaveis, n�o s�o alteradas atrav�s dos met�dos, os met�dos 
		 * retornam uma nova string com a formata��o realizada */
		
		String original = "  abc dEF GhIJ KLMno hh dEF    ";
		
		// FORMATA��O
		
		// Retorna a string em minusculo
		System.out.println(original.toLowerCase());
		// Retorna a string em maiusculo
		System.out.println(original.toUpperCase());
		// Retorna a string sem espa�os em branco incomuns (inicio e fim da string)
		System.out.println(original.trim());
		
		// RECORTE
		
		// Retorna a string recortada a partir do index 3 ao str.length()
		System.out.println(original.substring(3));
		// Retorna a string recortada a partir do index 6 ao 12-1
		System.out.println(original.substring(6, 12));
		
		// SUBSTITUI��O
		
		// Retorna a string substituindo todas as ocorrencias de 'h' por '*'
		System.out.println(original.replace("h", "*"));
		// Retorna a string substituindo todas as ocorrencias de 'dEF' por '123'
		System.out.println(original.replace("dEF", "123"));
		
		// BUSCA
		
		// Retorna o valor do primeiro index da primeira ocorrencia da string dEF na string original
		System.out.println(original.indexOf("dEF"));
		// Retorna o valor do primeiro index da ultima ocorrencia da string dEF na string original
		System.out.println(original.lastIndexOf("dEF"));
		
		// DIVIS�O
		
		String str = "Vinicius, Camilla, Erika, Nicolas, Mauricio, Lucas";
		String[] vec = str.split(", "); // Separa cada nome que estiver entre ', ' e guarda em um index
		String newStr = "";
		
		for (String name : vec) {
			System.out.print(name);
			newStr += name + " ";
		}
		
		System.out.println();
		System.out.println(newStr);
	}

}
