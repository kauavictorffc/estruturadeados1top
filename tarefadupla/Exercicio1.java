import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = sc.nextLine().toLowerCase().replaceAll("[ .]", "");

        Stack<Character> pilha = new Stack<>();
        for (char c : texto.toCharArray()) pilha.push(c);

        StringBuilder inverso = new StringBuilder();
        while (!pilha.isEmpty()) inverso.append(pilha.pop());

        System.out.println("Texto invertido: " + inverso);
        if (texto.equals(inverso.toString()))
            System.out.println("É palíndromo!");
        else
            System.out.println("Não é palíndromo.");
    }
}
