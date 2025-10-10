import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class ExpressionEvaluator {

    public static double evaluatePostfix(List<String> tokens) {
        Deque<Double> stack = new ArrayDeque<>();
        for (String tok : tokens) {
            if (NotationHelper.isNumber(tok)) {
                stack.push(Double.parseDouble(tok));
            } else if (tok.equals("u-")) { 
                if (stack.isEmpty()) throw new IllegalArgumentException("Operando ausente para unário");
                double v = stack.pop();
                stack.push(-v);
            } else {
                if (stack.size() < 2) throw new IllegalArgumentException("Operandos insuficientes para operador " + tok);
                double b = stack.pop();
                double a = stack.pop();
                switch (tok) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                    case "^": stack.push(Math.pow(a, b)); break;
                    default: throw new IllegalArgumentException("Operador desconhecido: " + tok);
                }
            }
        }
        if (stack.isEmpty()) throw new IllegalArgumentException("Expressão vazia");
        return stack.pop();
    }
}
