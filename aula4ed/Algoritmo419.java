import java.util.Scanner;

public class Algoritmo419 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int[][] dif = new int[5][5];

        System.out.println("Digite os valores da matriz A (5x5):");
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Digite os valores da matriz B (5x5):");
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                dif[i][j] = A[i][j] - B[i][j];

        System.out.println("Matriz diferença A - B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(dif[i][j] + "\t");
            System.out.println();
        }

        sc.close();
    }
}
