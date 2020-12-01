package util;

import entidades.Produto;

import java.util.function.Predicate;

public class ProdutoPredicate implements Predicate<Produto> {
    @Override
    public boolean test(Produto produto) {
        return produto.getPreco() > 500.00;
    }
}
