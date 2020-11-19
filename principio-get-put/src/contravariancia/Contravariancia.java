package contravariancia;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia {
    public static void main(String[] args) {

        List<Object> lista = new ArrayList<>();

        lista.add("covariancia");
        lista.add(3);

        List<? super Number> listaCuringa = lista; //Aceita qualquer tipo Number ou super tipo de Number (Object)

        listaCuringa.add(5.3); //Consegue adicionar qualquer valor na lista

        //Não consegue pegar valor na lista
        //Number numero = listaCuringa.get(2); //Erro de compilação!
    }
}
