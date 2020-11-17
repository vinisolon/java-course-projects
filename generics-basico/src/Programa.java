import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        //Definindo o <tipo> a ser instanciado da minha classe
        ServicoPrint<String>    spStr = new ServicoPrint<>();
        ServicoPrint<Integer>   spNum = new ServicoPrint<>();

        System.out.print("Numero de entradas no sistema: ");
        Integer numEntradas = num.nextInt();

        for(int i = 0; i < numEntradas; i++){
            System.out.print("Entrada [" + (i+1) + "]: ");
            //spStr.addValor(str.nextLine());
            spNum.addValor(num.nextInt());
        }

        /*System.out.println("Primeira entrada: " + spStr.primeiroValor());
        spStr.exibeLista();*/
        System.out.println("Primeira entrada: " + spNum.primeiroValor());
        spNum.exibeLista();
    }
}
