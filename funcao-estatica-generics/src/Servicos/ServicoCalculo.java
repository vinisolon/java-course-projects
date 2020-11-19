package Servicos;

import java.util.List;

public class ServicoCalculo {

    /**
    * Define um tipo T de retorno para o metodo.
    * '<T extends Comparable<T>>' especifica que o tipo T é um tipo comparable
    */

    public static <T extends Comparable<T>> T maior(List<T> lista){
        if(lista.isEmpty()){
            throw new IllegalStateException("Lista não pode estar vazia!");
        }
        T maior = lista.get(0);
        for(T obj : lista){
            if(obj.compareTo(maior) > 0)
                maior = obj;
        }
        return maior;
    }
}
