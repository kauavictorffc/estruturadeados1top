import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Erro: divisão por zero.");
        } else {
            int quociente = dividendo / divisor;
            int resto = dividendo % divisor;
            System.out.println("Dividendo: " + dividendo);
            System.out.println("Divisor: " + divisor);
            System.out.println("Quociente: " + quociente);
            System.out.println("Resto: " + resto);
        }
        sc.close();
    }
}
