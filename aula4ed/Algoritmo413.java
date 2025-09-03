import java.util.Scanner;

public class Algoritmo413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                matriz[i][j] = sc.nextInt();

        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(matriz[i][j] + "\t");
            System.out.println();
        }

        int somaQuadrados = 0;
        for (int i = 1; i < 5; i++) { // abaixo da diagonal principal
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] % 2 != 0) {
                    somaQuadrados += matriz[i][j] * matriz[i][j];
                }
            }
        }

        System.out.println("Raiz quadrada da soma dos quadrados dos ímpares abaixo da diagonal principal: " + Math.sqrt(somaQuadrados));
        sc.close();
    }
}
