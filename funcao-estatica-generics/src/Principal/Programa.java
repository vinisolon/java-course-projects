package Principal;

import Entidades.Produto;
import Servicos.ServicoCalculo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();
        String path = "src\\Arquivos\\arq.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String linhaArq = br.readLine();
            while(linhaArq != null){
                String[] camposArq = linhaArq.split(",");
                lista.add(new Produto(camposArq[0], Double.parseDouble(camposArq[1])));
                linhaArq = br.readLine();
            }

            System.out.println("Lista recebida do arquivo: ");
            for(Produto p : lista){
                System.out.println(p);
            }

            System.out.println("\nProduto mais caro da lista: " + ServicoCalculo.maior(lista));

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
