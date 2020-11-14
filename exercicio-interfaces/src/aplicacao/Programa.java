package aplicacao;

import entidades.Contrato;
import entidades.Parcela;
import servicos.ServicoContrato;
import servicos.ServicoPagamento;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.println("DADOS DO CONTRATO");

        System.out.print("Codigo do contrato: ");
        String codigoContrato = str.nextLine();

        System.out.print("Valor do contrato: ");
        Double valorContrato = num.nextDouble();

        System.out.print("Numero de parcelas: ");
        Integer numeroParcelas = num.nextInt();

        Contrato contrato = new Contrato(codigoContrato, valorContrato);
        ServicoContrato servicoContrato = new ServicoContrato(new ServicoPagamento());
        servicoContrato.processarContrato(contrato, numeroParcelas);

        System.out.println("\nPARCELAS");
        for (Parcela parcela : contrato.getParcelas()){
            System.out.println(parcela);
        }
    }
}
