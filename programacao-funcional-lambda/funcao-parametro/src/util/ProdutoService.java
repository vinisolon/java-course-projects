package util;

import entidades.Produto;

import java.util.List;
import java.util.function.Predicate;

public class ProdutoService {

    public Double somaValoresComPredicate(List<Produto> list, Predicate<Produto> criterio){
        /*Double soma = 0.0;
        for (Produto p : list){
            if(criterio.test(p))
                soma += p.getPreco();
        }*/

        /* Exemplo melhorado
         *
         * list.stream() -> Transforma a lista de Produtos em uma stream.
         *
         * filter(p -> criterio.test(p)) -> Retorna uma stream com todos os produtos que
         * atendem o critério do Predicate.
         *
         * mapToDouble(p -> p.getPreco()) -> Retorna uma stream com todos os preços dos Produtos filtrados.
         *
         * reduce(0, (subtotal, preco) -> subtotal + preco) -> Retorna a soma dos preços.
         * reduce é uma operação terminal pois transforma a stream em outro objeto. No caso, Double.
         */

        return list.stream()
                .filter(p -> criterio.test(p))
                .mapToDouble(p -> p.getPreco())
                .reduce(0, (subtotal, preco) -> subtotal + preco);
    }
}
