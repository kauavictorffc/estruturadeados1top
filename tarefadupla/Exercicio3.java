import java.util.*;

class Aviao {
    String nome;
    int id;
    Aviao(String nome, int id) { this.nome = nome; this.id = id; }
    public String toString() { return nome + " (" + id + ")"; }
}

public class Exercicio3 {
    static Queue<Aviao> fila = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n1-Adicionar avião");
            System.out.println("2-Autorizar decolagem");
            System.out.println("3-Listar fila");
            System.out.println("4-Ver primeiro avião");
            System.out.println("0-Sair");
            op = sc.nextInt(); sc.nextLine();

            switch(op) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    fila.add(new Aviao(nome, id));
                }
                case 2 -> System.out.println("Decolou: " + fila.poll());
                case 3 -> System.out.println("Fila: " + fila);
                case 4 -> System.out.println("Primeiro: " + fila.peek());
            }
        } while (op != 0);
    }
}
