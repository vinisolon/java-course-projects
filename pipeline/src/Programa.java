import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programa {
    public static void main(String[] args) {

        /**
         * Pipeline é uma sequencia de operações em uma stream.
         * A stream possui operações intermediárias que retornam outra
         * stream como resultado do que foi aplicado e as operações terminais
         * finalizam a pipeline transformando a stream em outro tipo de dado.
         */

        List<Integer> list = Arrays.asList(1,3,6,9,10,15,28);

        //Multiplica cada valor da stream por 3
        Stream<Integer> stream = list.stream().map(n -> n * 3);
        System.out.println(Arrays.toString(stream.toArray())); //toArray -> terminal

        //Soma todos os valores da stream
        Integer soma = list.stream().reduce(0, (subtotal, valor) -> subtotal + valor); //reduce -> terminal
        System.out.println(soma);

        List<Integer> list2 = list.stream()
                .filter(n -> n % 2 == 0)      //Filtra os numeros pares da stream
                .map(n -> n / 2)              //Divide os numeros filtrados por 2
                .collect(Collectors.toList());//Retorna a stream pra lista | collect(Collectors.toList()) -> terminal
        System.out.println(Arrays.toString(list2.toArray()));
    }
}
