import java.util.ArrayList;
import java.util.List;

public class ServicoPrint<Tipo> {

    private List<Tipo> lista = new ArrayList<>();

    public void addValor(Tipo valor){
        lista.add(valor);
    }

    public Tipo primeiroValor(){
        if(lista.isEmpty()){
            throw new IllegalStateException("Lista está vazia!");
        }
        return lista.get(0);
    }

    public void exibeLista(){
        System.out.print("[");
        if(!lista.isEmpty())
            System.out.print(lista.get(0));
        for(int i = 1; i < lista.size(); i++){
            System.out.print(", " + lista.get(i));
        }
        System.out.print("]");
    }
}
