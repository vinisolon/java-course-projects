package principal;

import entidades.Produto;
import util.ProdutoPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Programa {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Computador", 2300.00));
        produtos.add(new Produto("Televisão", 3200.00));
        produtos.add(new Produto("Cadeira Gamer", 799.99));
        produtos.add(new Produto("Fone de ouvido", 99.99));
        produtos.add(new Produto("Mousepad", 119.90));

        //Implementação da interface em uma classe
        //produtos.removeIf(new ProdutoPredicate());

        //Método estatico da classe Produto -> reference method
        //produtos.removeIf(Produto::staticProdutoPredicate);

        //Método não estatico da classe Produto -> reference method
        //produtos.removeIf(Produto::nonStaticProdutoPredicate);

        //Predicate declarado com expressão lambda
        //Double valor = 300.0;
        //Predicate<Produto> predicate = p -> p.getPreco() > valor;
        //produtos.removeIf(predicate);

        //Predicate inline -> lambda
        produtos.removeIf(p -> p.getPreco() < 500.0);

        produtos.forEach(p -> System.out.println(p)); //Foreach com lambda
    }
}
