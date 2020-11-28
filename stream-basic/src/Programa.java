import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Programa {
    public static void main(String[] args) {

        /**
         * Stream é uma sequencia de elementos vindos de uma fonte de dados.
         *
         * Elementos de uma stream sao imutaveis. Sempre será retornado uma nova Stream
         * com as alterações quando as operações na Stream finalizarem.
         *
         * A Stream possui dois tipos de operações: intermediárias e terminais.
         * Pode ter zero ou mais intermediárias e obrigatóriamente uma terminal, que determina o fim
         * do processamento dessa Stream.
         * Operações intermediárias produzem novas streams e são executadas quando a operação
         * terminal é invocada. Operação terminal produz um novo objeto nao Stream.
         */

        List<Integer> list = Arrays.asList(1, 3, 5, 6, 8, 10, 20);

        Stream<Integer> stream1 = list.stream();
        //Transforma a stream num array e depois transforma o array em string para ser exibido
        System.out.println(Arrays.toString(stream1.toArray()));

        //Inicia a stream com alguns elementos
        Stream<String> stream2 = Stream.of("Vinicius", "Nicolas", "Erika");
        System.out.println(Arrays.toString(stream2.toArray()));

        /* Primeiro valor de x será 0 e a cada iteração, adicionará +3 em x.
         * Essa operação é potencialmente infinita! Usaremos a operação
         * limit(num) para brecar o loop infinito.
         * limit(10) -> breca o loop da stream ao chegar no décimo elemento
         */
        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 3);
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));

        /*Exemplo de stream aplicando a sequencia de fibonacci
         *
         * n[0, 1]   -> n[0] = 0 (primeiro valor definido no iterate)
         * n[1, 0+1] -> n[0] = 1 (primeira iteração)
         * n[1, 1+1] -> n[0] = 1
         * n[2, 1+2] -> n[0] = 2
         * n[3, 2+3] -> n[0] = 3
         * n[5, 5+3] -> n[0] = 5
         *
         * O n[0] sempre vai ser o n[1] anterior por isso map(n -> n[0])
         *
         * A iteração está gerando pares/vetores de long e voce quer apenas um long,
         * pois a stream não foi definida com o tipo []Long. O map nesse caso está retornando
         * apenas o valor de n[0] dos pares gerados pela iteração.
         */
        Stream<Long> fibonacci = Stream.iterate(
                new long[]{ 0l, 1l }, n -> new long[]{ n[1], n[0] + n[1] }).map(n -> n[0]
        );
        System.out.println(Arrays.toString(fibonacci.limit(20).toArray()));
    }
}
