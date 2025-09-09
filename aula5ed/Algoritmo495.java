import java.util.Arrays;

public class Algoritmo495 {
    public static void ordenar(char[] vetor) {
        Arrays.sort(vetor);
    }

    public static void main(String[] args) {
        char[] vetor = {'d', 'a', 'c', 'b', 'e'};
        ordenar(vetor);

        System.out.print("Vetor ordenado: ");
        for (char c : vetor) {
            System.out.print(c + " ");
        }
    }
}
