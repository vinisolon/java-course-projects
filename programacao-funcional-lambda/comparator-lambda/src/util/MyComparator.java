package util;

import entidades.Produto;

import java.util.Comparator;

public class MyComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getDescricao().toUpperCase().compareTo(p2.getDescricao().toUpperCase());
    }
}
