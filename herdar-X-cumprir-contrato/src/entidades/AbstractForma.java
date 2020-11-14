package entidades;

import enums.Cores;

public abstract class AbstractForma implements  InterfaceForma{
    private Cores cor;

    public AbstractForma(Cores cor) {
        this.cor = cor;
    }

    public Cores getCor() {
        return cor;
    }

    public void setCor(Cores cor) {
        this.cor = cor;
    }
}
