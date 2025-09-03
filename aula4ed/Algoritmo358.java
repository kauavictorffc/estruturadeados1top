import java.util.Scanner;

public class Algoritmo358 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precoCompra = new double[100];
        double[] precoVenda = new double[100];
        int countLucro = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o preço de compra da mercadoria " + (i + 1) + ": ");
            precoCompra[i] = sc.nextDouble();
            System.out.print("Digite o preço de venda da mercadoria " + (i + 1) + ": ");
            precoVenda[i] = sc.nextDouble();
            if (precoVenda[i] > precoCompra[i]) {
                countLucro++;
            }
        }

        System.out.println("Quantidade de mercadorias que proporcionam lucro: " + countLucro);
        sc.close();
    }
}
