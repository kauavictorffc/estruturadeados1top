import java.util.Scanner;

public class ValidaExpressao {

    public static boolean verificarExpressao(String exp) {
        PilhaDinamica pilha = new PilhaDinamica();

        for (char c : exp.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            } 
            else if (c == ')' || c == ']' || c == '}') {

                if (pilha.vazia()) {
                    return false;
                }

                char topo = pilha.pop();

                if ((c == ')' && topo != '(') ||
                    (c == ']' && topo != '[') ||
                    (c == '}' && topo != '{')) {
                    return false;
                }
            }
        }

        return pilha.vazia();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a expressão:");
        String exp = sc.nextLine();

        if (verificarExpressao(exp)) {
            System.out.println("EXPRESSAO CORRETA!");
        } else {
            System.out.println("EXPRESSAO INCORRETA!");
        }

        sc.close();
    }
}
