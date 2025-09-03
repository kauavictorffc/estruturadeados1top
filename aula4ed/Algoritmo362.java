import java.util.Scanner;
import java.util.HashSet;

public class Algoritmo362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] conjunto1 = new int[10];
        int[] conjunto2 = new int[20];
        HashSet<Integer> comuns = new HashSet<>();

        System.out.println("Digite 10 números do primeiro conjunto:");
        for (int i = 0; i < 10; i++) conjunto1[i] = sc.nextInt();

        System.out.println("Digite 20 números do segundo conjunto:");
        for (int i = 0; i < 20; i++) conjunto2[i] = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (conjunto1[i] == conjunto2[j]) {
                    comuns.add(conjunto1[i]);
                    break;
                }
            }
        }

        System.out.println("Elementos comuns (sem repetição): " + comuns);
        sc.close();
    }
}
