import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotationHelper {
    private static final Pattern TOKEN_PAT = Pattern.compile("\\s*(\\d+\\.\\d+|\\d+|[()+\\-*/^])\\s*");

    public static List<String> tokenize(String expr) {
        List<String> tokens = new ArrayList<>();
        Matcher m = TOKEN_PAT.matcher(expr);
        int idx = 0;
        while (m.find()) {
            if (m.start() != idx) {
                throw new IllegalArgumentException("Caractere inválido em: " + expr.substring(idx, m.start()));
            }
            tokens.add(m.group(1));
            idx = m.end();
        }
        if (idx != expr.length()) {
            throw new IllegalArgumentException("Caractere inválido próximo de: " + expr.substring(idx));
        }
        return tokens;
    }

    public static boolean isNumber(String tok) {
        return tok.matches("\\d+\\.\\d+|\\d+");
    }

    public static boolean isOperator(String tok) {
        return tok.equals("+") || tok.equals("-") || tok.equals("*") || tok.equals("/") || tok.equals("^");
    }

    public static int precedence(String op) {
        if (op.equals("u-")) return 4; 
        switch (op) {
            case "^": return 3;
            case "*": case "/": return 2;
            case "+": case "-": return 1;
            default: return 0;
        }
    }

    public static boolean isRightAssociative(String op) {
        return op.equals("^") || op.equals("u-");
    }
}
