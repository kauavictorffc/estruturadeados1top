import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ângulo em graus: ");
        double ang = sc.nextDouble();
        double rad = Math.toRadians(ang);

        double seno = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);

        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cos);
        System.out.println("Tangente: " + tan);

        if (Math.abs(seno) > 1e-12) System.out.println("Cosecante: " + (1.0 / seno));
        else System.out.println("Cosecante indefinida");

        if (Math.abs(cos) > 1e-12) System.out.println("Secante: " + (1.0 / cos));
        else System.out.println("Secante indefinida");

        if (Math.abs(tan) > 1e-12) System.out.println("Cotangente: " + (1.0 / tan));
        else System.out.println("Cotangente indefinida");

        sc.close();
    }
}
