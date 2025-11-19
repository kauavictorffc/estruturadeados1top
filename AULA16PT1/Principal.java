import java.util.Scanner;

public class Principal {

    public static boolean verificarPalindromo(String texto) {

        // remover espaços, hífens, barras, pontuação
        String limpo = texto.toLowerCase()
                            .replaceAll("[^a-z0-9]", "");

        DequeDinamico deque = new DequeDinamico();

        // preencher o deque com os caracteres
        for (char c : limpo.toCharArray()) {
            deque.inserirFim(c);
        }

        // comparar frente e trás
        while (!deque.vazia()) {
            char ini = deque.removerInicio();

            if (deque.vazia()) break; // caso número ímpar de caracteres

            char fi = deque.removerFim();

            if (ini != fi) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra, número, data ou frase:");
        String entrada = sc.nextLine();

        if (verificarPalindromo(entrada)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("NÃO é um palíndromo!");
        }

        sc.close();
    }
}
