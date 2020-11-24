import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();

        System.out.print("Quantidade de alunos no curso A: ");
        int quantidade = num.nextInt();

        for(int i = 0; i < quantidade; i++){
            A.add(num.nextInt());
        }

        System.out.print("Quantidade de alunos no curso B: ");
        quantidade = num.nextInt();

        for(int i = 0; i < quantidade; i++){
            B.add(num.nextInt());
        }

        System.out.print("Quantidade de alunos no curso C: ");
        quantidade = num.nextInt();

        for(int i = 0; i < quantidade; i++){
            C.add(num.nextInt());
        }

        Set<Integer> total = new HashSet<>(A);
        total.addAll(B);
        total.addAll(C);

        System.out.println("Total de alunos: " + total.size());
    }
}
