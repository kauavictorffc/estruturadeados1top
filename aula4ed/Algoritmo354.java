import java.util.Scanner;

public class Algoritmo354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] NUM = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            NUM[i] = sc.nextInt();
        }

        System.out.println("\nLista de números:");
        for (int i = 0; i < 15; i++) {
            String tipo = (NUM[i] % 2 == 0) ? "Par" : "Ímpar";
            System.out.println((i + 1) + ". " + NUM[i] + " - " + tipo);
        }

        sc.close();
    }
}
