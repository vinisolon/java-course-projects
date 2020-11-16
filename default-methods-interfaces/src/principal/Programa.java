package principal;

import servicos.ServicoJuros;
import servicos.ServicoJurosBrasil;
import servicos.ServicoJurosUSA;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Valor do emprestimo: ");
        Double valorEmprestimo = num.nextDouble();

        System.out.print("Meses de emprestimo: ");
        Integer numeroMeses = num.nextInt();

        ServicoJuros sjusa = new ServicoJurosUSA();
        ServicoJuros sjb = new ServicoJurosBrasil();
        Double emprestimoBrasil = sjb.aplicarJuros(valorEmprestimo, numeroMeses);
        Double emprestimoUSA = sjusa.aplicarJuros(valorEmprestimo, numeroMeses);

        System.out.println("Pagamento após " + numeroMeses + " Meses: BRL " + String.format("%.2f", emprestimoBrasil));
        System.out.println("Pagamento após " + numeroMeses + " Meses: US " + String.format("%.2f", emprestimoUSA));
    }
}
