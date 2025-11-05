import java.util.Scanner;

public class GestaoPedidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaPedidos lista = new ListaPedidos();
        while (true) {
            System.out.println("1-Adicionar Pedido 2-Atender Pedido 3-Cancelar Ultimo 4-Cancelar por Posicao 5-Buscar por ID 6-Exibir Lista 7-Sair");
            int op = sc.nextInt();
            if (op == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                if (lista.existeId(id)) {
                    System.out.println("ID duplicado. Pedido rejeitado.");
                    continue;
                }
                System.out.print("Nome Cliente: ");
                String nome = sc.nextLine();
                System.out.print("Item: ");
                String item = sc.nextLine();
                System.out.print("Quantidade: ");
                int qtd = sc.nextInt();
                System.out.print("Valor: ");
                double valor = sc.nextDouble();
                sc.nextLine();
                System.out.print("Tipo (Urgente/Prioritario/Normal): ");
                String tipo = sc.nextLine();
                Pedido p = new Pedido(id, nome, item, qtd, valor, tipo);
                if (tipo.equalsIgnoreCase("Urgente")) {
                    lista.inserirUrgente(p);
                } else if (tipo.equalsIgnoreCase("Prioritario")) {
                    lista.inserirPrioritario(p);
                } else {
                    lista.inserirNormal(p);
                }
            } else if (op == 2) {
                lista.removerInicio();
            } else if (op == 3) {
                lista.removerFim();
            } else if (op == 4) {
                System.out.print("Posição para remover: ");
                int pos = sc.nextInt();
                lista.removerPosicao(pos);
            } else if (op == 5) {
                System.out.print("ID para buscar: ");
                int id = sc.nextInt();
                Pedido p = lista.buscarPorId(id);
                if (p != null) {
                    System.out.println("ID: " + p.id + " | Cliente: " + p.nomeCliente + " | Item: " + p.item + " | Qtd: " + p.quantidade + " | Valor: R$" + String.format("%.2f", p.valor) + " | Tipo: " + p.tipo);
                } else {
                    System.out.println("Pedido não encontrado.");
                }
            } else if (op == 6) {
                lista.imprimirLista();
            } else if (op == 7) {
                break;
            }
        }
        sc.close();
    }
}
