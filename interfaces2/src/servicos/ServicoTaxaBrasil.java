package servicos;

public class ServicoTaxaBrasil implements ServicoTaxa{

    @Override
    public double taxa(double valor){
        if(valor <= 100)
            return valor * 0.2;
        else
            return valor * 0.15;
    }

}
