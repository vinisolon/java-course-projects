package entidades;

public class Produto {
    private String descricao;
    private Double preco;

    public Produto(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public static void staticUpdatePreco(Produto p){
        p.setPreco(p.getPreco() * 1.1);
    }

    public void nonStaticUpdatePreco(){
        this.preco *= 1.1;
    }

    @Override
    public String toString() {
        StringBuilder printProduto = new StringBuilder()
                .append("Descrição: ")
                .append(descricao)
                .append(" | Preço: ")
                .append(String.format("%.2f", preco));
        return printProduto.toString();
    }
}
