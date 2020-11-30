package principal;

import entidades.Produto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {

        String path = "src\\arquivos\\produtos.txt";
        Set<Produto> setProdutos = new HashSet<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha;
            while((linha = br.readLine()) != null){
                String[] atributosProduto = linha.split(",");
                String descricao = atributosProduto[0];
                Double preco = Double.parseDouble(atributosProduto[1]);
                setProdutos.add(new Produto(descricao, preco));
            }
            System.out.println("**Lista de produtos**");
            for (Produto produto : setProdutos){
                System.out.println(produto);
            }
            System.out.println();
            //Calcula a média de preços dos produtos
            Double mediaPrecos = setProdutos.stream()
                    .mapToDouble(p -> p.getPreco())
                    .reduce(0, (subtotal, preco) -> subtotal + preco)
                    / setProdutos.size(); //setProdutos.stream().count();
            System.out.println("Média dos preços: " + String.format("%.2f", mediaPrecos));

            //Exibe os produtos em ordem crescente de preços menores que a média
            setProdutos.stream()
                    .filter(p -> p.getPreco() < mediaPrecos)
                    .sorted(Comparator.comparingDouble(Produto::getPreco))
                    .forEach(System.out::println);

        } catch (FileNotFoundException e){
            System.out.println("Arquivo nao encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro desconhecido: ");
            e.printStackTrace();
        }
    }
}
