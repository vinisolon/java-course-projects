package principal;

import entidades.Funcionario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        String caminhoArquivo = "src\\arquivos\\arquivo.txt";
        String funcionarioLine;

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {

            while ((funcionarioLine = br.readLine()) != null) {
                String[] splitStr = funcionarioLine.split(",");
                funcionarios.add(new Funcionario(splitStr[0], Double.parseDouble(splitStr[1])));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
            e.printStackTrace();
        }

        Collections.sort(funcionarios);
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + ", " + funcionario.getSalario());
        }
    }
}
