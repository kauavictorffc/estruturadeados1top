import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número 1: ");
        double a = sc.nextDouble();
        System.out.print("Número 2: ");
        double b = sc.nextDouble();
        System.out.print("Número 3: ");
        double c = sc.nextDouble();
        System.out.print("Número 4: ");
        double d = sc.nextDouble();

        double mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10.0;
        System.out.println("Média ponderada: " + mp);
        sc.close();
    }
}
