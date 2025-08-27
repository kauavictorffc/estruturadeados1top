import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número (>0): ");
        double num = sc.nextDouble();
        System.out.print("Base (>0, !=1): ");
        double base = sc.nextDouble();

        if (num <= 0 || base <= 0 || base == 1) {
            System.out.println("Entrada inválida para logaritmo.");
        } else {
            double log = Math.log(num) / Math.log(base);
            System.out.println("log base " + base + " de " + num + " = " + log);
        }
        sc.close();
    }
}
