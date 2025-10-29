import java.util.Random;

public class ListaOrdenada {
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Random rand = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(19999) - 9999; 
        }

        System.out.println("Vetor gerado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) System.out.print(", ");
        }
        System.out.println("\n");

        DoublyLinkedList lista = new DoublyLinkedList();

        for (int num : vetor) {
            lista.insertOrdered(num);
        }

        System.out.println("Lista em ordem crescente:");
        lista.printAscending();

        System.out.println("\nLista em ordem decrescente:");
        lista.printDescending();

        lista.removePrimes();

        System.out.println("\nLista após remover números primos (ordem crescente):");
        lista.printAscending();

        System.out.println("\nLista após remover números primos (ordem decrescente):");
        lista.printDescending();
    }
}
