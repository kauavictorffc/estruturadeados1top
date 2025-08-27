import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro de 3 dígitos: ");
        int a = sc.nextInt();
        int d = (a % 100) / 10;
        System.out.println("Algarismo da casa das dezenas: " + d);
        sc.close();
    }
}
