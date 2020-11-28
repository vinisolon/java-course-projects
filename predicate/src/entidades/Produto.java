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

    public static boolean staticProdutoPredicate(Produto p){
        return p.getPreco() < 500.00;
    }

    public boolean nonStaticProdutoPredicate(){
        return preco < 500.00;
    }

    @Override
    public String toString() {
        StringBuilder printProduto = new StringBuilder()
                .append("Descrição: ")
                .append(descricao)
                .append(" | Preço: ")
                .append(preco);
        return printProduto.toString();
    }
}
