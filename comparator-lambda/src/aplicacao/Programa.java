package aplicacao;

import entidades.Produto;
import util.MyComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Computador", 2300.00));
        produtos.add(new Produto("Televisão", 3200.00));
        produtos.add(new Produto("Cadeira Gamer", 799.99));

        System.out.println("\n**ANTES DA ORDENAÇÃO PELO NOME**");
        for (Produto produto : produtos){
            System.out.println(produto);
        }

        /* Implementação com classe separada
        produtos.sort(new MyComparator()); */

        /* Implementação objeto com classe anônima
        Comparator<Produto> comparator = new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                return p1.getDescricao().toUpperCase().compareTo(p2.getDescricao().toUpperCase());
            }
        };
        produtos.sort(comparator); */

        /* Implementação objeto com função anônima / arrow function
        Comparator<Produto> comparator = (p1, p2) -> {
            return p1.getDescricao().toUpperCase().compareTo(p2.getDescricao().toUpperCase());
        };
        produtos.sort(comparator); */

        /* Implementação objeto com expressão lambda sem chaves
        Comparator<Produto> comparator = (p1, p2) -> p1.getDescricao().toUpperCase().compareTo(p2.getDescricao().toUpperCase());
        produtos.sort(comparator); */

        /* Implementação objeto com expressão lambda sem chaves recomendada pelo IntelliJ
        Comparator<Produto> comparator = Comparator.comparing(p -> p.getDescricao().toUpperCase());
        produtos.sort(comparator); */

        produtos.sort(Comparator.comparing(p -> p.getDescricao().toUpperCase()));

        /* Implementação da expressão lambda como argumento, que também é uma função anônima reduzida
        produtos.sort((p1, p2) -> p1.getDescricao().toUpperCase().compareTo(p2.getDescricao().toUpperCase()));*/

        System.out.println("\n**APÓS ORDENAÇÃO PELO NOME**");
        for (Produto produto : produtos){
            System.out.println(produto);
        }

        List<Integer> numeros = new ArrayList<>();
        Integer[] vetorNumeros = {10,5,9,4,7,3,2};
        numeros.addAll(Arrays.asList(vetorNumeros));
        numeros.sort(Comparator.comparing(n -> n));
        System.out.println("\n**TESTE COM NUMEROS**");
        for (Integer numero : numeros){
            System.out.print(numero + ", ");
        }
    }
}
