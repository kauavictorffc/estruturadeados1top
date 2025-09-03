import java.util.Scanner;

public class Algoritmo351 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        System.out.print("Digite um número de 1 a 5 para mostrar o nome: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 5) {
            System.out.println("Nome escolhido: " + nomes[num - 1]);
        } else {
            System.out.println("Número inválido!");
        }

        sc.close();
    }
}
