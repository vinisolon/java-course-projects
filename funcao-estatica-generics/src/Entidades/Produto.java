package Entidades;

public class Produto implements Comparable<Produto> {
    private String descricaoProduto;
    private Double precoProduto;

    public Produto(String descricaoProduto, Double precoProduto) {
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public String toString() {
        return descricaoProduto + ", " + precoProduto;
    }

    /**
     * A implementação da interface 'Comparable' e do método 'compareTo' define que Produto é um tipo Comparable.
     * Nesse caso, a comparação é do preço do produto.
     */
    @Override
    public int compareTo(Produto p) {
        return precoProduto.compareTo(p.getPrecoProduto());
    }
}
