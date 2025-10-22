import java.util.*;

public class Exercicio5 {
    public static void main(String[] args) {
        Random r = new Random();
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        for (int i = 0; i < 1000; i++) {
            int num = r.nextInt(500);
            if (fila.contains(num)) pilha.push(num);
            else fila.add(num);
        }

        System.out.println("Fila (sem repetidos): " + fila);
        System.out.println("Pilha (repetidos): " + pilha);
    }
}
