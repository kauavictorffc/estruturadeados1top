public class PilhaDinamica {

    private No topo;

    public PilhaDinamica() {
        topo = null;
    }

    public void push(char c) {
        No novo = new No(c);
        novo.prox = topo;
        topo = novo;
    }

    public char pop() {
        if (vazia()) {
            return '\0';
        }
        char valor = topo.dado;
        topo = topo.prox;
        return valor;
    }

    public char peek() {
        if (vazia()) {
            return '\0';
        }
        return topo.dado;
    }

    public boolean vazia() {
        return topo == null;
    }
}
