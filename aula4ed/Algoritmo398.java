import java.util.Scanner;
import java.util.ArrayList;

public class Algoritmo398 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> codigos = new ArrayList<>();
        ArrayList<Integer> estoque = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();

        // Cadastro de produtos
        while (true) {
            System.out.print("Digite o código do produto (-1 para sair): ");
            int cod = sc.nextInt();
            if (cod == -1) break;
            System.out.print("Digite a quantidade em estoque: ");
            int qtd = sc.nextInt();
            System.out.print("Digite o preço de venda: ");
            double preco = sc.nextDouble();

            codigos.add(cod);
            estoque.add(qtd);
            precos.add(preco);
        }

        double totalVendido = 0;
        while (true) {
            System.out.print("Digite o código do produto para venda (0 para sair): ");
            int codVenda = sc.nextInt();
            if (codVenda == 0) break;

            int index = codigos.indexOf(codVenda);
            if (index == -1) {
                System.out.println("Produto não cadastrado!");
                continue;
            }

            System.out.print("Digite a quantidade requerida: ");
            int qtdReq = sc.nextInt();
            if (qtdReq <= estoque.get(index)) {
                estoque.set(index, estoque.get(index) - qtdReq);
                totalVendido += qtdReq * precos.get(index);
                System.out.println("Venda realizada!");
            } else {
                System.out.println("Estoque insuficiente!");
            }
        }

        // Listagem final
        System.out.println("\nTotal vendido no dia: R$ " + totalVendido);
        System.out.println("Estoque restante (em ordem decrescente de quantidade):");
        while (!codigos.isEmpty()) {
            int maxIndex = 0;
            for (int i = 1; i < estoque.size(); i++) {
                if (estoque.get(i) > estoque.get(maxIndex)) maxIndex = i;
            }
            System.out.println("Código: " + codigos.get(maxIndex) + " - Estoque: " + estoque.get(maxIndex) + " - Preço: " + precos.get(maxIndex));
            codigos.remove(maxIndex);
            estoque.remove(maxIndex);
            precos.remove(maxIndex);
        }

        sc.close();
    }
}
