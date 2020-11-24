import entidades.Pessoa;
import entidades.Produto;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Programa {
    public static void main(String[] args) {
        /**
         * put(chave, valor) -> adiciona uma chave : valor no map
         * get(chave) -> retorna valor da chave passada por parametro
         * remove(chave) -> remove chave : valor no map passado por parametro
         * containsKey(chave) -> retorna true/false se a chave do parametro existir no map
         * clear() -> limpa o map
         * size() -> retorna quantidade de itens no map
         * keySet() -> retorna um Set<shave> com todas as chaves do map
         * values() -> retorna um Collections<valor> com todos os valores do map
         *
         * Map nao aceita repetição de chaves. Caso ocorra o put de uma chave já existente, o
         * valor será sobrescrito.
         *
         * Map compara a chave com equals e hashCode. Caso nao tenha implementado na classe, ele
         * ira comparar os ponteiros.
         */

        Map<String, String> map = new LinkedHashMap<>();

        map.put("nome", "Vinicius Solon");
        map.put("cpf", "112233445566");
        map.put("telefone", "111111111"); //put telefone 1
        map.put("telefone", "222222222"); //put telefone 2 sobrescreve o put telefone 1

        map.remove("cpf");

        System.out.println("map possui nome: " + map.containsKey("nome"));
        System.out.println("map possui cpf: " + map.containsKey("cpf"));
        System.out.println("valor de cpf: " + map.get("cpf"));
        System.out.println("valor de telefone: " + map.get("telefone"));
        System.out.println("tamanho do map: " + map.size());

        map.put("cidade", "Campinas");
        map.put("UF", "SP");

        System.out.println("\n**Itens do map**");
        for (String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }

        /**Produto possui equals e hashCode implementado**/

        Produto p1 = new Produto("Televisão", 1450.00);
        Produto p2 = new Produto("Celular", 900.00);
        Produto p3 = new Produto("Computador", 1900.50);
        Map<Produto, Integer> quantidadeEstoque = new HashMap<>();

        quantidadeEstoque.put(p1, 3);
        quantidadeEstoque.put(p2, 5);
        quantidadeEstoque.put(p3, 7);

        //Produto instanciado com os mesmos valores dos atributos de p1
        Produto copiaP1 = new Produto("Televisão", 1450.00);

        //Usa o copiaP1 como chave para verificação de existencia no map que foi adicionado o p1
        System.out.println("\nEstoque tem chave de copiaP1: " + quantidadeEstoque.containsKey(copiaP1)); //true

        /**Pessoa NÃO possui equals e hashCode implementado**/

        Pessoa a1 = new Pessoa("Vinicius", 23);
        Pessoa a2 = new Pessoa("Erika", 43);
        Pessoa a3 = new Pessoa("Nicolas", 10);
        Map<Pessoa, Integer> mapPessoa = new HashMap<>();

        mapPessoa.put(a1, 1);
        mapPessoa.put(a2, 2);
        mapPessoa.put(a3, 3);

        //Pessoa instanciada com os mesmos valores dos atributos de a1
        Pessoa copiaA1 = new Pessoa("Vinicius", 23);

        //Usa o copiaA1 como chave para verificação de existencia no map que foi adicionado o a1
        System.out.println("\nmapPessoa tem chave de copiaA1: " + mapPessoa.containsKey(copiaA1)); //false
    }
}
