package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(1, "Vinicius Solon", "vini@email.com");
		Pessoa pessoa2 = new Pessoa(2, "Ronaldo Santos", "ronaldo@email.com");
		Pessoa pessoa3 = new Pessoa(3, "Juliano Longo", "juliano@email.com");
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
	}
}
