import java.util.Scanner;

public class Algoritmo470 {
    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (ehPrimo(num)) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }

        sc.close();
    }
}
