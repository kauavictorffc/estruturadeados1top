import java.util.Arrays;
import java.util.Scanner;

public class Algoritmo499 {
    static int[] vetor = new int[5];

    public static void dadosVetor(Scanner sc) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
        }
    }

    public static void ordenaVetor() {
        Arrays.sort(vetor);
        System.out.println("Vetor ordenado!");
    }

    public static void imprimeVetor() {
        System.out.print("Vetor: ");
        for (int v : vetor) System.out.print(v + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU VETOR - FUNCAO");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR");
            System.out.println("4. Sai do programa");
            System.out.print("Opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> dadosVetor(sc);
                case 2 -> ordenaVetor();
                case 3 -> imprimeVetor();
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opcao invalida!");
            }
        } while (opcao != 4);

        sc.close();
    }
}
