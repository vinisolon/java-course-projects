package servicos;

public class ServicoJurosBrasil implements  ServicoJuros{

    private final Double PORCENTAGEM_JUROS = 2.0;

    @Override
    public Double getPocentagemJuros() {
        return this.PORCENTAGEM_JUROS;
    }
}
