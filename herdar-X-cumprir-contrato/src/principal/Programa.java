package principal;

import entidades.AbstractForma;
import entidades.Circulo;
import entidades.InterfaceForma;
import entidades.Retangulo;
import enums.Cores;

public class Programa {
    public static void main(String[] args) {

        // O retangulo pode ser instanciado tanto por uma variavel abstrata quanto por uma interface.

        AbstractForma retanguloA = new Retangulo(Cores.VERMELHO, 4.5, 6.3);
        InterfaceForma retanguloB = new Retangulo(Cores.AZUL, 1., 3.);

        /* O circulo apenas cumpre o contrato da interface e nao herda a classe abstrata, por tanto,
        apenas é instanciado pela propria classe ou por uma variavel interface. */

        InterfaceForma CirculoC = new Circulo(5.8);

        System.out.println("Area Retangulo  A: " + String.format("%.2f", retanguloA.area()));
        System.out.println("Area Retangulo  B: " + String.format("%.2f", retanguloB.area()));
        System.out.println("Area Circulo    C: " + String.format("%.2f", CirculoC.area()));
    }
}
