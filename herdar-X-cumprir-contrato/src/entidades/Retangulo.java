package entidades;

import enums.Cores;

/*Essa classe deve cumprir o contrato da interface que é implementado pela classe abstrata.
Ou seja, ela possui o atributo COR herdado da abstrata e deve implementar o método AREA da interface.*/

public class Retangulo extends AbstractForma {

    private Double altura;
    private Double largura;

    public Retangulo(Cores cor, Double altura, Double largura) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    @Override
    public Double area() {
        return altura * largura;
    }
}
