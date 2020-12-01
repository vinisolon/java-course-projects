package principal;

import entidades.Colaborador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        String path = "src\\arquivos\\Colaboradores.txt";
        Scanner num = new Scanner(System.in);
        List<Colaborador> colaboradores = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha;
            while((linha = br.readLine()) != null){
                String[] vetColaborador = linha.split(",");
                String nome = vetColaborador[0];
                String email = vetColaborador[1];
                Double salario = Double.parseDouble(vetColaborador[2]);
                colaboradores.add(new Colaborador(nome, email, salario));
            }

            System.out.println("**COLABORADORES**");
            for (Colaborador c : colaboradores)
                System.out.println(c);
            System.out.println();

            System.out.print("Entre com um valor: ");
            Double valor = num.nextDouble();

            //Exibe o email dos colaboradores em ordem alfabetica cujo o salario é maior que o valor fornecido pelo usuario
            colaboradores.stream()
                    .filter(p -> p.getSalario() > valor)
                    .map(p -> p.getEmail())
                    .sorted()
                    .forEach(System.out::println);

            //Retorna a soma dos salarios dos colaboradores cujo nome tenha 'M'
            Double somaSalarios = colaboradores.stream()
                    .filter(p -> p.getNome().toUpperCase().contains("M"))
                    .mapToDouble(p -> p.getSalario())
                    .reduce(0, (subtotal, salario) -> subtotal + salario);
            System.out.println("\nSoma dos salários: " + String.format("%.2f", somaSalarios));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
