package principal;

import entidades.Pessoa;
import entidades.Produto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Programa {
    public static void main(String[] args) {

        //Set<String> set = new HashSet<>(); //O mais rapido de todos os sets. Não ordena objetos
        //Set<String> set = new LinkedHashSet<>(); //Velocidade média. Segue a ordem de adição
        Set<String> set = new TreeSet<>(); //Mais lento dos sets. Ordena os objetos

        set.add("Computador");
        set.add("Televisão");
        set.add("Celular");
        set.add("Monitor");
        set.add("Geladeira");

        set.remove("Celular");
        set.removeIf(obj -> obj.startsWith("T"));


        for(Object obj: set){
            System.out.println(obj);
        }

        // OPERAÇÕES DE CONJUNTO
        System.out.println();

        Set<Integer> a = new HashSet<>(Arrays.asList(7,15,2,5,8));
        Set<Integer> b = new HashSet<>(Arrays.asList(2,3,5,9,7));

        //União
        Set<Integer> c = new HashSet<>(a); //Copia de a
        c.addAll(b); //Adiciona todos os valores de b que sao diferentes de c
        System.out.println(c);

        //Intersecção
        Set<Integer> d = new HashSet<>(a); //Copia de a
        d.retainAll(b); //Remove todos os valores que não são comuns entre as listas d e b
        System.out.println(d);

        //Diferença
        Set<Integer> e = new HashSet<>(a); //Copia de a
        e.removeAll(b); //Remove os valores de e que sao comuns em b
        System.out.println(e);

        /**
         * Como o set testa igualdade:
         * Caso a classe utilizada no set não tenha hashCode e equals, será comparado o endereço de memória.
         * Após a implementação dos metódos, poderá comparar todos ou qualquer atributo especifico para validar
         * a igualdade.
         */

        Set<Produto> produtoSet = new HashSet<>();

        produtoSet.add(new Produto("Televisão", 1200.00));
        produtoSet.add(new Produto("Computador", 3200.00)); //PC1
        produtoSet.add(new Produto("Celular", 1700.00));

        Produto produto = new Produto("Computador", 3200.00); //PC2

        System.out.print("\nprodutoSet contains produto: ");
        System.out.println(produtoSet.contains(produto)); //Set tem PC2?

        /**
         * Como o treeSet testa igualdade:
         * O treeSet utiliza o Comparable para testar igualdade entre objetos. Portanto, devemos implementar
         * a interface Comparable na classe que desejamos utilizar o treeSet.
         * No exemplo a seguir, nao conseguiremos nem listar os objetos adicionados ao treeSet com o foreach,
         * porque ele não vai conseguir comparar os objetos que ele contem para ordenar antes de exibir.
         * *treeSet ordena os objetos adicionados a ele*
         */

        Set<Pessoa> pessoaTreeSet = new TreeSet<>();

        pessoaTreeSet.add(new Pessoa("Vinicius Solon", "123456789", 23));
        pessoaTreeSet.add(new Pessoa("Nicolas Solon", "987654321", 10));
        pessoaTreeSet.add(new Pessoa("Erika Sartorato", "654987321", 43));

        for (Pessoa p : pessoaTreeSet){
            System.out.println(p);
        }
    }
}
