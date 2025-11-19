import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DequeDocumentos fila = new DequeDocumentos();
        int opc;

        do {
            System.out.println("\n===== SISTEMA DE FILA DE IMPRESSÃO =====");
            System.out.println("1 - Adicionar documento normal");
            System.out.println("2 - Adicionar documento urgente");
            System.out.println("3 - Processar próximo documento");
            System.out.println("4 - Processar último documento");
            System.out.println("5 - Visualizar fila");
            System.out.println("6 - Total de documentos");
            System.out.println("7 - Total de páginas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    Documento normal = new Documento();
                    fila.adicionar_documento_normal(normal);
                    System.out.println("Documento adicionado: " + normal);
                    break;

                case 2:
                    Documento urgente = new Documento();
                    fila.adicionar_documento_urgente(urgente);
                    System.out.println("Documento URGENTE adicionado: " + urgente);
                    break;

                case 3:
                    Documento proximo = fila.processar_proximo();
                    if (proximo == null) {
                        System.out.println("Não há documentos na fila.");
                    } else {
                        System.out.println("Processando: " + proximo);
                    }
                    break;

                case 4:
                    Documento ultimo = fila.processar_ultimo();
                    if (ultimo == null) {
                        System.out.println("Não há documentos na fila.");
                    } else {
                        System.out.println("Processando último: " + ultimo);
                    }
                    break;

                case 5:
                    fila.visualizar_fila();
                    break;

                case 6:
                    System.out.println("Total de documentos: " + fila.total_documentos());
                    break;

                case 7:
                    System.out.println("Total de páginas para imprimir: " + fila.total_paginas());
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opc != 0);

        sc.close();
    }
}
