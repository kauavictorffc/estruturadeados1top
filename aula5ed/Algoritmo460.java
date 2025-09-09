import java.util.Scanner;

public class Algoritmo460 {
    public static int dobro(int n) {
        return n * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = sc.nextInt();
            System.out.println("O dobro é: " + dobro(num));
        }
        sc.close();
    }
}
