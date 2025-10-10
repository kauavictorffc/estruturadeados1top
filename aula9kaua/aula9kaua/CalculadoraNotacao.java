import java.util.List;
import java.util.Scanner;

public class CalculadoraNotacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CALCULADORA DE NOTAÇÕES (versão alternativa) ===");
        System.out.println("1 - Infixa  (ex: (3+4)*2)");
        System.out.println("2 - Pós-fixa (RPN) (ex: 3 4 + 2 *)");
        System.out.println("3 - Pré-fixa (prefix) (ex: * + 3 4 2)");
        System.out.print("Opção: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a expressão: ");
        String linha = sc.nextLine().trim();

        List<String> tokens;
        try {
            tokens = NotationHelper.tokenize(linha);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao tokenizar: " + e.getMessage());
            sc.close();
            return;
        }

        String infixaStr = "";
        String posfixaStr = "";
        String prefixaStr = "";
        double resultado;

        try {
            switch (tipo) {
                case 1: // infixa
                    infixaStr = String.join(" ", tokens);
                    List<String> postfix = NotationConverter.infixToPostfix(tokens);
                    posfixaStr = String.join(" ", postfix);
                    List<String> prefixFromInfix = NotationConverter.infixToPrefix(tokens);
                    prefixaStr = String.join(" ", prefixFromInfix);
                    resultado = ExpressionEvaluator.evaluatePostfix(postfix);
                    break;
                case 2: // posfixa
                    posfixaStr = String.join(" ", tokens);
                    infixaStr = NotationConverter.postfixToInfix(tokens);
                    List<String> prefixFromPost = NotationConverter.infixToPrefix(NotationHelper.tokenize(infixaStr));
                    prefixaStr = String.join(" ", prefixFromPost);
                    resultado = ExpressionEvaluator.evaluatePostfix(tokens);
                    break;
                case 3: // prefixa
                    prefixaStr = String.join(" ", tokens);
                    infixaStr = NotationConverter.prefixToInfix(tokens);
                    List<String> postfixFromPrefix = NotationConverter.infixToPostfix(NotationHelper.tokenize(infixaStr));
                    posfixaStr = String.join(" ", postfixFromPrefix);
                    resultado = ExpressionEvaluator.evaluatePostfix(postfixFromPrefix);
                    break;
                default:
                    System.out.println("Opção inválida");
                    sc.close();
                    return;
            }

            System.out.println("\n=== RESULTADOS ===");
            System.out.println("Infixa : " + infixaStr);
            System.out.println("Pós-fixa: " + posfixaStr);
            System.out.println("Pré-fixa: " + prefixaStr);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro durante processamento: " + e.getMessage());
        }

        sc.close();
    }
}
