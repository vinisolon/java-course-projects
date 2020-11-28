package util;

import entidades.Produto;

import java.util.function.Consumer;

public class UpdatePrice implements Consumer<Produto> {
    @Override
    public void accept(Produto produto) {
        produto.setPreco(produto.getPreco() * 1.1);
    }
}
