package util;

import entidades.Produto;

import java.util.List;
import java.util.function.Predicate;

public class ProdutoService {

    public Double somaValoresComPredicate(List<Produto> list, Predicate<Produto> criterio){
        Double soma = 0.0;
        for (Produto p : list){
            if(criterio.test(p))
                soma += p.getPreco();
        }
        return soma;
    }
}
