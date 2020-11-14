package servicos;

public class ServicoPagamento implements ServicoPagamentoOnline {

    private static final double TAXA_PAGAMENTO = 0.02;
    private static final double JUROS_PARCELA = 0.01;

    @Override
    public Double taxaPagamento(Double valorParcela) {
        return valorParcela * TAXA_PAGAMENTO;
    }

    @Override
    public Double jurosParcela(Double valorParcela, Integer numeroParcela) {
        return valorParcela * numeroParcela * JUROS_PARCELA;
    }
}
