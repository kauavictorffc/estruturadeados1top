import java.util.Scanner;

public class Algoritmo394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[50];
        double[] nota1 = new double[50];
        double[] nota2 = new double[50];
        double[] media = new double[50];

        int opcao;
        do {
            System.out.println("\nESCOLA VIVA");
            System.out.println("1 - Entrar nomes");
            System.out.println("2 - Entrar nota 1");
            System.out.println("3 - Entrar nota 2");
            System.out.println("4 - Calcular média");
            System.out.println("5 - Listar no display");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    for (int i = 0; i < 50; i++) {
                        System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                        nomes[i] = sc.nextLine();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 50; i++) {
                        System.out.print("Digite a nota 1 do aluno " + (i + 1) + ": ");
                        nota1[i] = sc.nextDouble();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 50; i++) {
                        System.out.print("Digite a nota 2 do aluno " + (i + 1) + ": ");
                        nota2[i] = sc.nextDouble();
                    }
                    break;
                case 4:
                    for (int i = 0; i < 50; i++) {
                        media[i] = (nota1[i]*3 + nota2[i]*7)/10;
                    }
                    break;
                case 5:
                    System.out.println("Nome\tNota1\tNota2\tMédia");
                    for (int i = 0; i < 50; i++) {
                        System.out.println(nomes[i] + "\t" + nota1[i] + "\t" + nota2[i] + "\t" + media[i]);
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
            }
        } while(opcao != 6);

        sc.close();
    }
}
