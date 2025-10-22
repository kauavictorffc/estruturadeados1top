import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        Queue<Integer> f1 = new LinkedList<>();
        for (int i = 1; i <= 10; i++) f1.add(i);

        Stack<Integer> pilha = new Stack<>();
        while (!f1.isEmpty()) pilha.push(f1.remove());
        while (!pilha.isEmpty()) f1.add(pilha.pop());

        System.out.println("Fila invertida: " + f1);
    }
}
