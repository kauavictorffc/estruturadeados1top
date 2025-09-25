public class Pilha {
    private char[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        elementos = new char[capacidade];
        topo = -1;
    }

    public void push(char c) {
        elementos[++topo] = c;
    }

    public char pop() {
        return elementos[topo--];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public void clear() {
        topo = -1;
    }
}
