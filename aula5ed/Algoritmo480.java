import java.util.Scanner;

public class Algoritmo480 {
    public static boolean ehCapicua(int n) {
        String numStr = String.valueOf(n);
        String invertido = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(invertido);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (ehCapicua(num)) {
            System.out.println(num + " é capicua.");
        } else {
            System.out.println(num + " não é capicua.");
        }

        sc.close();
    }
}
