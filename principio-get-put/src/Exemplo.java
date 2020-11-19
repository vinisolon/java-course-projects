import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplo {
    public static void main(String[] args) {

        List<Integer> listaInteger = Arrays.asList(1, 2, 3);
        List<Double> listaDouble = Arrays.asList(4.1, 5.2, 6.3);
        List<Object> listaObject = new ArrayList<>();

        copiarLista(listaInteger, listaObject); //Copiando lista de inteiros
        exibirLista(listaObject);

        copiarLista(listaDouble, listaObject); //Copiando lista de flutuantes
        exibirLista(listaObject);
    }

    //listaOrigem é de qualquer tipo Number e listaDestino é de qualquer tipo Number ou super tipo  de Number
    public static void copiarLista(List<? extends  Number> listaOrigem, List<? super Number> listaDestino){
        for(Number numero : listaOrigem){
            listaDestino.add(numero);
        }
    }

    public static void exibirLista(List<? super Number> lista){
        for (Object obj: lista){
            System.out.print(obj + ", ");
        }
        System.out.println();
    }
}
