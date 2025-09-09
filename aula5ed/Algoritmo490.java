public class Algoritmo490 {
    public static int removeCaractere(char[] vetor, int tamanho, char c) {
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == c) {
                vetor[i] = '*';
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        char[] vetor = {'a', 'b', 'c', 'a', 'd'};
        int removidos = removeCaractere(vetor, vetor.length, 'a');

        System.out.println("Total removidos: " + removidos);
        System.out.print("Vetor final: ");
        for (char c : vetor) {
            System.out.print(c + " ");
        }
    }
}
