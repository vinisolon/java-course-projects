package principal;

import entidades.Produto;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {
        /**
         * Function<A, B> recebe um objeto e retorna outro objeto!
         *
         * Neste exemplo vamos passar um Produto e retornar uma String
         * com o nome do produto em upper case.
         *
         * Neste exemplo começamos a utilizar stream() e abordamos a função
         * map() (não é a estrutura de dados Map), é uma função que aplica uma outra
         * função a cada elemento de uma stream(). A função map() não funciona em listas,
         * por isso transformamos a lista em uma stream de dados.
         */

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Computador", 2300.00));
        produtos.add(new Produto("Televisão", 3200.00));
        produtos.add(new Produto("Cadeira Gamer", 799.99));
        produtos.add(new Produto("Fone de ouvido", 99.99));
        produtos.add(new Produto("Mousepad", 119.90));

        /*
        Implementação da interface Function na classe UpperCaseName.

        Transformamos a lista numa stream() e depois utilizamos map() passando
        uma instancia da classe UpperCaseName como parametro.
        map() irá retornar uma nova stream com as aplicações efetuadas. Em seguida
        transformamos a stream().map() de volta numa lista.


        List<String> nomes = produtos.stream().map(new UpperCaseName()).collect(Collectors.toList());
        produtos.forEach(System.out::println); //Lista de produtos nao foi modificada!
        nomes.forEach(System.out::println); //Lista com os nomes em upperCase
         */

        //reference Produto static method
        //List<String> nomes = produtos.stream().map(Produto::staticUpperCaseName).collect(Collectors.toList());
        //nomes.forEach(System.out::println);

        //reference Produto non static method
        //List<String> nomes = produtos.stream().map(Produto::nonStaticUpperCaseName).collect(Collectors.toList());
        //nomes.forEach(System.out::println);

        //Declaração de function<A,B>
        //Function<Produto, String> function = p -> p.getDescricao().toUpperCase();
        //List<String> nomes = produtos.stream().map(function).collect(Collectors.toList());
        //nomes.forEach(System.out::println);

        //lambda inline
        List<String> nomes = produtos.stream().map(p -> p.getDescricao().toUpperCase()).collect(Collectors.toList());
        nomes.forEach(System.out::println);
    }
}
