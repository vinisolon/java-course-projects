package servicos;

import java.security.InvalidParameterException;

public interface ServicoJuros {

    Double getPocentagemJuros();
    default Double aplicarJuros(Double valorEmprestimo, Integer numeroMeses){

        if(numeroMeses < 1){
            throw new InvalidParameterException("Numero de meses deve ser maior que zero.");
        }
        return valorEmprestimo * Math.pow(1 + getPocentagemJuros() / 100.0, numeroMeses);
    }
}
