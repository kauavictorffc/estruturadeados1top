import java.util.Scanner;

public class Algoritmo346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        int op;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Comprimento da frase");
            System.out.println("2 - Dois primeiros e dois últimos caracteres");
            System.out.println("3 - Frase espelhada");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            op = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch(op) {
                case 1:
                    System.out.println("Comprimento: " + frase.length());
                    break;
                case 2:
                    if (frase.length() >= 2) {
                        System.out.println("Dois primeiros: " + frase.substring(0, 2));
                        System.out.println("Dois últimos: " + frase.substring(frase.length() - 2));
                    } else {
                        System.out.println("Frase muito curta.");
                    }
                    break;
                case 3:
                    String invertida = new StringBuilder(frase).reverse().toString();
                    System.out.println("Frase espelhada: " + invertida);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(op != 4);

        sc.close();
    }
}
