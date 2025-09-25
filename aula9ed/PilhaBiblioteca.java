import java.util.Stack;

public class PilhaBiblioteca {

    public static String inverterPalavras(String frase) {
        StringBuilder resultado = new StringBuilder();
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c != ' ') {
                pilha.push(c); 
            } else {
                while (!pilha.isEmpty()) {
                    resultado.append(pilha.pop());
                }
                resultado.append(" "); 
            }
        }

        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop());
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        String exemplo1 = "UM CIENTISTA DA COMPUTACAO E UM TECNOLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        String exemplo2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC E O OGOLOGNET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OAS SO SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED .SAIOG";

        System.out.println("Exemplo 1:");
        System.out.println(inverterPalavras(exemplo1));

        System.out.println("\nExemplo 2:");
        System.out.println(inverterPalavras(exemplo2));

        System.out.println("\nTeste simples:");
        System.out.println(inverterPalavras("ESTE EXERCICIO E MUITO FACIL"));
    }
}
