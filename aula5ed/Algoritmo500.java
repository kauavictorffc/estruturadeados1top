import java.util.Scanner;

public class Algoritmo500 {
    static int[] vetorA = new int[5];
    static int[] vetorB = new int[5];
    static boolean temA = false, temB = false;

    public static void dadosVetor(int[] vetor, Scanner sc, String nome) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i+1) + " de " + nome + ": ");
            vetor[i] = sc.nextInt();
        }
    }

    public static void imprimeVetores() {
        if (!temA || !temB) {
            System.out.println("Preencha os dois vetores primeiro!");
            return;
        }
        System.out.print("Vetor A: ");
        for (int v : vetorA) System.out.print(v + " ");
        System.out.print("\nVetor B: ");
        for (int v : vetorB) System.out.print(v + " ");
        System.out.println();
    }

    public static void somaVetores() {
        if (!temA || !temB) {
            System.out.println("Preencha os dois vetores primeiro!");
            return;
        }
        System.out.print("Soma: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print((vetorA[i] + vetorB[i]) + " ");
        }
        System.out.println();
    }

    public static void subtraiVetores() {
        if (!temA || !temB) {
            System.out.println("Preencha os dois vetores primeiro!");
            return;
        }
        System.out.print("Subtração: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print((vetorA[i] - vetorB[i]) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU VETORES");
            System.out.println("1. Dados do VETOR A");
            System.out.println("2. Dados do VETOR B");
            System.out.println("3. Imprime VETORES");
            System.out.println("4. Soma VETORES");
            System.out.println("5. Subtrai VETORES");
            System.out.println("6. Sai do programa");
            System.out.print("Opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> { dadosVetor(vetorA, sc, "Vetor A"); temA = true; }
                case 2 -> { dadosVetor(vetorB, sc, "Vetor B"); temB = true; }
                case 3 -> imprimeVetores();
                case 4 -> somaVetores();
                case 5 -> subtraiVetores();
                case 6 -> System.out.println("Saindo...");
                default -> System.out.println("Opcao invalida!");
            }
        } while (opcao != 6);

        sc.close();
    }
}
