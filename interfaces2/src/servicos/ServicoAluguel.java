package servicos;

import entidades.Aluguel;
import entidades.Fatura;

public class ServicoAluguel {

    private Double precoHora;
    private Double precoDia;

    private ServicoTaxa servicoTaxa;

    public ServicoAluguel() {
    }

    public ServicoAluguel(Double precoHora, Double precoDia, ServicoTaxa servicoTaxa) {
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.servicoTaxa = servicoTaxa;
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

        double taxa = servicoTaxa.taxa(pagamentoBasico);

        aluguel.setFatura(new Fatura(pagamentoBasico, taxa));
    }
}
