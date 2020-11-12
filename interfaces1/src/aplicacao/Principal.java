package aplicacao;

import entidades.Aluguel;
import entidades.Veiculo;
import servicos.ServicoAluguel;
import servicos.ServicoTaxaBrasil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Scanner str = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("Entrada do Aluguel");

        System.out.print("Modelo do carro: ");
        String modelo = str.nextLine();

        System.out.print("Data de inicio do aluguel (dd/mm/aaaa hh:mm): ");
        Date inicioAluguel = sdf.parse(str.nextLine());

        System.out.print("Data do fim do aluguel (dd/mm/aaaa hh:mm): ");
        Date fimAluguel = sdf.parse(str.nextLine());

        Aluguel aluguelCarro = new Aluguel(inicioAluguel, fimAluguel, new Veiculo(modelo));

        System.out.print("Preco por hora: ");
        double precoHora = num.nextDouble();

        System.out.print("Preco por dia: ");
        double precoDia = num.nextDouble();

        ServicoAluguel servicoAluguel = new ServicoAluguel(precoHora, precoDia, new ServicoTaxaBrasil());

        servicoAluguel.processoDeFatura(aluguelCarro);

        System.out.println("\nALUGUEL");
        System.out.println("Pagamento baisco: " + String.format("%.2f", aluguelCarro.getFatura().getPagamentoBasico()));
        System.out.println("Taxa: " + String.format("%.2f", aluguelCarro.getFatura().getTaxa()));
        System.out.println("Pagamento total: " + String.format("%.2f", aluguelCarro.getFatura().pagamentoTotal()));
    }
}
