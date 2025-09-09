public class Algoritmo497 {
    public static int buscaBinaria(int[] vetor, int chave) {
        int inicio = 0, fim = vetor.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == chave) {
                return meio;
            } else if (vetor[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1; // não encontrado
    }

    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9, 11};
        int pos = buscaBinaria(vetor, 7);

        if (pos != -1) {
            System.out.println("Encontrado na posição: " + pos);
        } else {
            System.out.println("Não encontrado.");
        }
    }
}
