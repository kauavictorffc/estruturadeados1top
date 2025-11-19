import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        Random rand = new Random();

        PilhaDinamica pilha1 = new PilhaDinamica(); 
        PilhaDinamica pilha2 = new PilhaDinamica(); 
        PilhaDinamica pilha3 = new PilhaDinamica(); 

        // ============================
        // FASE 1
        // ============================

        for (int i = 0; i < 100; i++) {
            int n = rand.nextInt(9) + 1; 

            if (n >= 1 && n <= 3) {
                pilha1.push(n);
            } else if (n >= 4 && n <= 6) {
                pilha2.push(n);
            } else {
                pilha3.push(n);
            }
        }

        System.out.println("=== PILHAS APÓS FASE 1 ===");
        pilha1.imprimir("Pilha 1");
        pilha2.imprimir("Pilha 2");
        pilha3.imprimir("Pilha 3");

        // ============================
        // FASE 2
        // ============================

        for (int i = 0; i < 100; i++) {

            int destino = rand.nextInt(3) + 1;

            // verificar se qualquer pilha está vazia antes de continuar
            if (pilha1.vazia() || pilha2.vazia() || pilha3.vazia()) {
                System.out.println("O programa foi encerrado porque alguma pilha ficou vazia.");
                break;
            }

            int n1, n2;

            if (destino == 1) {
                n1 = pilha2.pop();
                n2 = pilha3.pop();
                System.out.println("Empilhando os números " + n1 + " e " + n2 + " na pilha 1");
                pilha1.push(n1);
                pilha1.push(n2);

            } else if (destino == 2) {
                n1 = pilha1.pop();
                n2 = pilha3.pop();
                System.out.println("Empilhando os números " + n1 + " e " + n2 + " na pilha 2");
                pilha2.push(n1);
                pilha2.push(n2);

            } else {  
                n1 = pilha1.pop();
                n2 = pilha2.pop();
                System.out.println("Empilhando os números " + n1 + " e " + n2 + " na pilha 3");
                pilha3.push(n1);
                pilha3.push(n2);
            }
        }

        System.out.println("\n=== PILHAS FINAIS ===");
        pilha1.imprimir("Pilha 1");
        pilha2.imprimir("Pilha 2");
        pilha3.imprimir("Pilha 3");

        System.out.println("Encerrando programa.");
    }
}
