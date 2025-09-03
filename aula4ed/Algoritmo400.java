import java.util.Scanner;

class Quarto {
    int leitos;
    double preco;
    String situacao = "livre";
    double despesas = 0;
    int diarias = 0;
}

public class Algoritmo400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quarto[] quartos = new Quarto[50];
        for (int i = 0; i < 50; i++) quartos[i] = new Quarto();
        int opcao;

        do {
            System.out.println("\nHotel-Fazenda Sucesso");
            System.out.println("1 - Cadastra quartos");
            System.out.println("2 - Lista todos os quartos");
            System.out.println("3 - Lista quartos ocupados");
            System.out.println("4 - Aluguel/reserva quarto");
            System.out.println("5 - Entrar despesas extras");
            System.out.println("6 - Calcula despesa do quarto");
            System.out.println("7 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    for (int i = 0; i < 50; i++) {
                        System.out.print("Número de leitos do quarto " + (i+1) + ": ");
                        quartos[i].leitos = sc.nextInt();
                        System.out.print("Preço do quarto " + (i+1) + ": ");
                        quartos[i].preco = sc.nextDouble();
                        quartos[i].situacao = "livre";
                    }
                    break;
                case 2:
                    for (int i = 0; i < 50; i++) {
                        System.out.println("Quarto " + (i+1) + " - Situação: " + quartos[i].situacao);
                    }
                    break;
                case 3:
                    for (int i = 0; i < 50; i++) {
                        if (!quartos[i].situacao.equals("livre")) {
                            System.out.println("Quarto " + (i+1) + " - Situação: " + quartos[i].situacao);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Número do quarto para alugar/reservar: ");
                    int numQ = sc.nextInt() - 1;
                    if (numQ >= 0 && numQ < 50) {
                        if (quartos[numQ].situacao.equals("livre")) {
                            System.out.print("Digite 1 para alugar ou 2 para reservar: ");
                            int tipo = sc.nextInt();
                            quartos[numQ].situacao = (tipo == 1) ? "alugado" : "reservado";
                            System.out.print("Número de diárias: ");
                            quartos[numQ].diarias = sc.nextInt();
                        } else {
                            System.out.println("Quarto não disponível!");
                        }
                    }
                    break;
                case 5:
                    System.out.print("Número do quarto: ");
                    int q = sc.nextInt() - 1;
                    System.out.print("Valor da despesa extra: ");
                    quartos[q].despesas += sc.nextDouble();
                    break;
                case 6:
                    System.out.print("Número do quarto: ");
                    int q2 = sc.nextInt() - 1;
                    double total = quartos[q2].preco * quartos[q2].diarias + quartos[q2].despesas;
                    System.out.println("Despesa total do quarto " + (q2+1) + ": R$ " + total);
                    break;
            }
        } while(opcao != 7);

        sc.close();
    }
}
