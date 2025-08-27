import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saldo da aplicação: ");
        double saldo = sc.nextDouble();
        double nsaldo = saldo * 1.01;
        System.out.println("Novo saldo: " + nsaldo);
        sc.close();
    }
}
