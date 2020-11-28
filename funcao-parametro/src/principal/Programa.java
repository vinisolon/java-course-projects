package principal;

import entidades.Produto;
import util.ProdutoService;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        /**
         * Neste exemplo vamos passar um predicado como parametro de uma função que
         * vai somar os valores dos produtos que atendam ao predicado.
         */

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Computador", 2300.00));
        produtos.add(new Produto("Televisão", 3200.00));
        produtos.add(new Produto("Cadeira Gamer", 799.99));
        produtos.add(new Produto("Fone de ouvido", 99.99));
        produtos.add(new Produto("Mousepad", 119.90));

        //Produtos que as descrições comecem com 'C'
        System.out.println(new ProdutoService().somaValoresComPredicate(produtos,
                p -> p.getDescricao().charAt(0) == 'C'));

        //Produtos que tenham 'm' ou 'M' nas descrições
        System.out.println(new ProdutoService().somaValoresComPredicate(produtos,
                p -> p.getDescricao().toUpperCase().contains("M")));
        //Produtos que os preços sejam menores que 1000
        System.out.println(new ProdutoService().somaValoresComPredicate(produtos,
                p -> p.getPreco() < 1000.0));

        //Produtos que os preços sejam menores que 1000 e as descrições contenham 'ou' ou 'OU'
        System.out.println(new ProdutoService().somaValoresComPredicate(produtos,
                p -> p.getPreco() < 1000.0 && p.getDescricao().toUpperCase().contains("OU")));
    }
}
