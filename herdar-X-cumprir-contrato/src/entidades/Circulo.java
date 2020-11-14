package entidades;

//Essa classe somente cumpre o contrato da interface, que é a implementação do método AREA. Ela nao possui cor

public class Circulo implements InterfaceForma {

    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(raio, 2);
    }
}
