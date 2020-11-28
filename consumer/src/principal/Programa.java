package principal;

import entidades.Produto;
import util.UpdatePrice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Computador", 2300.00));
        produtos.add(new Produto("Televisão", 3200.00));
        produtos.add(new Produto("Cadeira Gamer", 799.99));
        produtos.add(new Produto("Fone de ouvido", 99.99));
        produtos.add(new Produto("Mousepad", 119.90));

        /**
         * Consumer não retorna nada, apenas executa uma ação!
         * Neste exemplo estamos acrescentando 10% ao preço dos produtos
         */

        //Implementação da interface na classe UpdatePrice
        //produtos.forEach(new UpdatePrice());

        //reference static method
        //produtos.forEach(Produto::staticUpdatePreco);

        //reference non static method
        //produtos.forEach(Produto::nonStaticUpdatePreco);

        //Declaração de Consumer com expressão lambda
        //Double porcentagem = 1.1;
        //Consumer<Produto> consumer = p -> p.setPreco(p.getPreco() * porcentagem);
        //produtos.forEach(consumer);

        //Expressão lambda inline
        Double porcentagem = 1.1;
        produtos.forEach(p -> p.setPreco(p.getPreco() * porcentagem));

        produtos.forEach(System.out::println); //sout por reference method

    }
}
