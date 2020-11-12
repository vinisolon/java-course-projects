package servicos;

public class ServicoTaxaBrasil {

    public Double Taxa(Double valor){
        if(valor <= 100)
            return valor * 0.2;
        else
            return valor * 0.15;
    }
}
