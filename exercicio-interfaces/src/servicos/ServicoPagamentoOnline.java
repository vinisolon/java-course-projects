package servicos;

public interface ServicoPagamentoOnline {

    Double taxaPagamento(Double valorParcela);
    Double jurosParcela(Double valorParcela, Integer numeroParcela);
}
