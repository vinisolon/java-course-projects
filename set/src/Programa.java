import java.util.*;

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

    }
}
