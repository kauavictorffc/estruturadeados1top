import java.util.*;

public class Exercicio6 {
    public static void main(String[] args) {
        Random r = new Random();
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        for (int i = 0; i < 1000; i++) fila.add(r.nextInt(100) + 1);
        for (int i = 0; i < 1000; i++) fila.add(-r.nextInt(100) - 1);

        while (!fila.isEmpty()) {
            int num = fila.peek();
            if (num > 0) pilha.push(fila.remove());
            else {
                fila.remove();
                if (!pilha.isEmpty())
                    System.out.println("Topo removido: " + pilha.pop());
            }
        }
    }
}
