import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número (>0): ");
        double num = sc.nextDouble();

        if (num <= 0) {
            System.out.println("Erro: log indefinido.");
        } else {
            System.out.println("log10(" + num + ") = " + Math.log10(num));
        }
        sc.close();
    }
}
