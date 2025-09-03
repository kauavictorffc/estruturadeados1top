import java.util.Scanner;

public class Algoritmo356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];
        double[] media = new double[15];
        String[] situacao = new String[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
            System.out.print("Digite a nota PR1: ");
            pr1[i] = sc.nextDouble();
            System.out.print("Digite a nota PR2: ");
            pr2[i] = sc.nextDouble();
            sc.nextLine(); // limpar buffer

            media[i] = Math.round((pr1[i] + pr2[i]) / 2);
            situacao[i] = (media[i] >= 60) ? "AP" : "RP";
        }

        System.out.println("\nLista de alunos:");
        System.out.println("Nome\tPR1\tPR2\tMédia\tSituação");
        for (int i = 0; i < 15; i++) {
            System.out.println(nomes[i] + "\t" + pr1[i] + "\t" + pr2[i] + "\t" + media[i] + "\t" + situacao[i]);
        }

        sc.close();
    }
}
