package covariancia;

import java.util.ArrayList;
import java.util.List;

public class Covariancia {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(3);

        List<? extends Number> listaCuringa = lista; //Aceita qualquer tipo que seja subtipo de Number

        Number numero = listaCuringa.get(2); //Consegue pegar qualquer valor da lista

        //Não consegue adicionar valor na lista
        //listaCuringa.add(5); //Erro de compilação!
    }
}
