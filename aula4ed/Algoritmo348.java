import java.util.Scanner;

public class Algoritmo348 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] nota1 = new double[5];
        double[] nota2 = new double[5];
        double[] media = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
            System.out.print("Digite a primeira nota: ");
            nota1[i] = sc.nextDouble();
            System.out.print("Digite a segunda nota: ");
            nota2[i] = sc.nextDouble();
            sc.nextLine(); // limpar buffer
            media[i] = (nota1[i] + nota2[i]) / 2;
        }

        System.out.println("\nLista de alunos:");
        System.out.println("Nome\tNota1\tNota2\tMédia");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + "\t" + nota1[i] + "\t" + nota2[i] + "\t" + media[i]);
        }

        sc.close();
    }
}
