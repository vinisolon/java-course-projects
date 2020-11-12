package servicos;

import entidades.Aluguel;
import entidades.Fatura;

public class ServicoAluguel {

    private Double precoHora;
    private Double precoDia;

    private ServicoTaxaBrasil servicoTaxaBrasil;

    public ServicoAluguel() {
    }

    public ServicoAluguel(Double precoHora, Double precoDia, ServicoTaxaBrasil servicoTaxaBrasil) {
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.servicoTaxaBrasil = servicoTaxaBrasil;
    }

    public void processoDeFatura(Aluguel aluguel){
        long diferencaMS = aluguel.getFim().getTime() - aluguel.getInicio().getTime(); // MS
        double duracaoHoras = diferencaMS / 1000 / 60 / 60; // MS / SEG / HORA
        double pagamentoBasico = 0.0;

        if(duracaoHoras <= 12){
            pagamentoBasico = Math.ceil(duracaoHoras) * precoHora;
        }
        else{
            pagamentoBasico = Math.ceil(duracaoHoras / 24) * precoDia;
        }

        double taxa = servicoTaxaBrasil.taxa(pagamentoBasico);

        aluguel.setFatura(new Fatura(pagamentoBasico, taxa));
    }
}
