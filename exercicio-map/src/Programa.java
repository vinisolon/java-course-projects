import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Programa {
    public static void main(String[] args) {

        String path = "..\\exercicio-map\\arquivo";
        Map<String, Integer> map = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String linha = br.readLine();

            while(linha != null){
                if(linha.contains(",")){

                    String[] chaveValor = linha.split(",");
                    String chave = chaveValor[0];
                    Integer valor = Integer.parseInt(chaveValor[1]);

                    if(map.containsKey(chave))
                        map.put(chave, (map.get(chave) + valor));
                    else
                        map.put(chave, valor);
                }
                linha = br.readLine();
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo nao encontrado: " + e.getMessage());
        }
        catch (IOException e){
            System.out.println("Erro desconhecido:");
            e.printStackTrace();
        }

        System.out.println("**RESULTADO DAS URNAS**");
        for(String key: map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }
}
