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
        int duracaoHoras = (int) diferencaMS / 3600000; // 3600000 = 60 * 60 * 1000
        int duracaoMinutos = (int) (diferencaMS / 60000) % 60;

        System.out.println(String.format("\nTempo total em horas de aluguel: %03d:%02d", duracaoHoras, duracaoMinutos));

        double pagamentoBasico;

        if(duracaoMinutos > 30) duracaoHoras += 1;

        if(duracaoHoras <= 12){
            pagamentoBasico = duracaoHoras * precoHora;
        }
        else{
            int dias = (int) Math.floor(duracaoHoras / 24); // EX: 77 / 24 = 3,2 <---> floor(77 / 24) = 3
            int difHoras =  duracaoHoras - (dias * 24) ;
            pagamentoBasico = (dias * precoDia) + (difHoras * precoHora);
        }

        double taxa = servicoTaxa.taxa(pagamentoBasico);

        aluguel.setFatura(new Fatura(pagamentoBasico, taxa));
    }
}
