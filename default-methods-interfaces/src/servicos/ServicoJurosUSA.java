package servicos;

public class ServicoJurosUSA implements ServicoJuros{

    private final Double PORCENTAGEM_JUROS = 1.0;

    @Override
    public Double getPocentagemJuros() {
        return this.PORCENTAGEM_JUROS;
    }
}
