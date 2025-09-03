import java.util.Scanner;

public class Algoritmo370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de voos: ");
        int numVoos = sc.nextInt();
        int[] lugares = new int[numVoos];

        for (int i = 0; i < numVoos; i++) {
            System.out.print("Digite a quantidade de lugares do voo " + (i + 1) + ": ");
            lugares[i] = sc.nextInt();
        }

        while (true) {
            System.out.print("Digite o número da identidade do cliente (0 para sair): ");
            int id = sc.nextInt();
            if (id == 0) break;

            System.out.print("Digite o número do voo desejado: ");
            int voo = sc.nextInt();

            if (voo < 1 || voo > numVoos) {
                System.out.println("Voo inválido!");
            } else if (lugares[voo - 1] > 0) {
                System.out.println("Reserva confirmada para ID: " + id + ", Voo: " + voo);
                lugares[voo - 1]--;
            } else {
                System.out.println("Sem lugares disponíveis no voo " + voo);
            }
        }

        sc.close();
    }
}
