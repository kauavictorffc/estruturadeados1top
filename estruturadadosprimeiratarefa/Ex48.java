import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salário mínimo: ");
        double sm = sc.nextDouble();
        System.out.print("Quantidade de kWh: ");
        double qtd = sc.nextDouble();

        double preco = sm / 700.0;
        double valor = preco * qtd;
        double valorDesc = valor * 0.9;

        System.out.printf("Preço por kWh: R$ %.4f%n", preco);
        System.out.printf("Valor a pagar: R$ %.2f%n", valor);
        System.out.printf("Com desconto (10%%): R$ %.2f%n", valorDesc);

        sc.close();
    }
}
