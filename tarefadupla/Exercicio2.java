import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        pilha.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor a remover: ");
        int chave = sc.nextInt();

        Stack<Integer> aux = new Stack<>();

        while (!pilha.isEmpty()) {
            int valor = pilha.pop();
            if (valor != chave) aux.push(valor);
        }

        while (!aux.isEmpty()) pilha.push(aux.pop());

        System.out.println("Pilha final: " + pilha);
    }
}
