package servicos;

import entidades.Contrato;
import entidades.Parcela;

import java.util.Calendar;
import java.util.Date;

public class ServicoContrato {

    private ServicoPagamentoOnline servicoPagamento;

    public ServicoContrato(ServicoPagamentoOnline servicoPagamento) {
        this.servicoPagamento = servicoPagamento;
    }

    public void processarContrato(Contrato contrato, Integer numeroParcelas){

        for(int i = 1; i <= numeroParcelas; i++){
            Double valorParcela = contrato.getValorTotalContrato() / numeroParcelas;
            valorParcela += servicoPagamento.jurosParcela(valorParcela, i);
            valorParcela += servicoPagamento.taxaPagamento(valorParcela);
            Date dataParcela = addMes(contrato.getDataContrato(), i);
            contrato.getParcelas().add(new Parcela(dataParcela, valorParcela));
        }
    }

    // Método auxiliar para acrescentar mes em uma data
    private Date addMes(Date data, Integer numero){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.MONTH, numero);
        return calendar.getTime(); // Calendar voltar a ser Date
    }
}
