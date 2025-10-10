import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class NotationConverter {

    public static List<String> infixToPostfix(List<String> tokens) {
        List<String> output = new ArrayList<>();
        Deque<String> ops = new ArrayDeque<>();

        for (int i = 0; i < tokens.size(); i++) {
            String tok = tokens.get(i);
            if (NotationHelper.isNumber(tok)) {
                output.add(tok);
            } else if (NotationHelper.isOperator(tok)) {
                if (tok.equals("-") && (i == 0 || tokens.get(i - 1).equals("(") || NotationHelper.isOperator(tokens.get(i - 1)))) {
                    tok = "u-";
                }
                while (!ops.isEmpty() && NotationHelper.isOperator(ops.peek())) {
                    String top = ops.peek();
                    if ( (NotationHelper.isRightAssociative(tok) && NotationHelper.precedence(tok) < NotationHelper.precedence(top))
                        || (!NotationHelper.isRightAssociative(tok) && NotationHelper.precedence(tok) <= NotationHelper.precedence(top)) ) {
                        output.add(ops.pop());
                    } else {
                        break;
                    }
                }
                ops.push(tok);
            } else if (tok.equals("(")) {
                ops.push(tok);
            } else if (tok.equals(")")) {
                while (!ops.isEmpty() && !ops.peek().equals("(")) {
                    output.add(ops.pop());
                }
                if (ops.isEmpty()) throw new IllegalArgumentException("Parênteses não correspondem");
                ops.pop(); // remover "("
            } else {
                throw new IllegalArgumentException("Token desconhecido: " + tok);
            }
        }

        while (!ops.isEmpty()) {
            String t = ops.pop();
            if (t.equals("(") || t.equals(")")) throw new IllegalArgumentException("Parênteses não correspondem");
            output.add(t);
        }

        return output;
    }

    // Infixa -> Prefixa (usa reversão + shunting-yard trick)
    public static List<String> infixToPrefix(List<String> tokens) {
        List<String> rev = new ArrayList<>();
        // inverter tokens e trocar parênteses
        for (int i = tokens.size() - 1; i >= 0; i--) {
            String t = tokens.get(i);
            if (t.equals("(")) rev.add(")");
            else if (t.equals(")")) rev.add("(");
            else rev.add(t);
        }
        List<String> postfixOfReversed = infixToPostfix(rev);
        // inverter postfix para obter prefix
        List<String> prefix = new ArrayList<>();
        for (int i = postfixOfReversed.size() - 1; i >= 0; i--) prefix.add(postfixOfReversed.get(i));
        return prefix;
    }

    // Pós-fixa -> Infixa (reconstrói com parênteses para manter ordem)
    public static String postfixToInfix(List<String> tokens) {
        Deque<String> stack = new ArrayDeque<>();
        for (String tok : tokens) {
            if (NotationHelper.isNumber(tok)) {
                stack.push(tok);
            } else if (tok.equals("u-")) {
                String a = stack.pop();
                stack.push("(-" + a + ")");
            } else { // operador binário
                String b = stack.pop();
                String a = stack.pop();
                stack.push("(" + a + tok + b + ")");
            }
        }
        if (stack.isEmpty()) return "";
        return stack.peek();
    }

    // Pré-fixa -> Infixa
    public static String prefixToInfix(List<String> tokens) {
        Deque<String> stack = new ArrayDeque<>();
        for (int i = tokens.size() - 1; i >= 0; i--) {
            String tok = tokens.get(i);
            if (NotationHelper.isNumber(tok)) {
                stack.push(tok);
            } else if (tok.equals("u-")) {
                String a = stack.pop();
                stack.push("(-" + a + ")");
            } else {
                String a = stack.pop();
                String b = stack.pop();
                stack.push("(" + a + tok + b + ")");
            }
        }
        return stack.peek();
    }
}
