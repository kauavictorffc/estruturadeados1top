public class ListaPedidos {
    private Pedido cabeca;

    boolean estaVazia() {
        return cabeca == null;
    }

    int tamanho() {
        int cont = 0;
        Pedido aux = cabeca;
        while (aux != null) {
            cont++;
            aux = aux.prox;
        }
        return cont;
    }

    boolean existeId(int id) {
        Pedido aux = cabeca;
        while (aux != null) {
            if (aux.id == id) return true;
            aux = aux.prox;
        }
        return false;
    }

    void inserirUrgente(Pedido novo) {
        novo.valor *= 1.2;
        novo.prox = cabeca;
        cabeca = novo;
    }

    void inserirNormal(Pedido novo) {
        if (cabeca == null) {
            cabeca = novo;
        } else {
            Pedido aux = cabeca;
            while (aux.prox != null) aux = aux.prox;
            aux.prox = novo;
        }
    }

    void inserirPrioritario(Pedido novo) {
        novo.valor *= 1.1;
        int pos = tamanho() / 2;
        if (pos == 0) {
            inserirUrgente(novo);
            return;
        }
        Pedido aux = cabeca;
        for (int i = 0; i < pos - 1 && aux != null; i++) aux = aux.prox;
        novo.prox = aux.prox;
        aux.prox = novo;
    }

    void removerInicio() {
        if (!estaVazia()) cabeca = cabeca.prox;
    }

    void removerFim() {
        if (cabeca == null) return;
        if (cabeca.prox == null) {
            cabeca = null;
            return;
        }
        Pedido aux = cabeca;
        while (aux.prox.prox != null) aux = aux.prox;
        aux.prox = null;
    }

    void removerPosicao(int k) {
        if (k == 0) {
            removerInicio();
            return;
        }
        Pedido aux = cabeca;
        for (int i = 0; i < k - 1 && aux != null; i++) aux = aux.prox;
        if (aux != null && aux.prox != null) aux.prox = aux.prox.prox;
    }

    Pedido buscarPorId(int id) {
        Pedido aux = cabeca;
        while (aux != null) {
            if (aux.id == id) return aux;
            aux = aux.prox;
        }
        return null;
    }

    Pedido buscarPorPosicao(int pos) {
        Pedido aux = cabeca;
        for (int i = 0; i < pos && aux != null; i++) aux = aux.prox;
        return aux;
    }

    void imprimirLista() {
        Pedido aux = cabeca;
        while (aux != null) {
            System.out.println("ID: " + aux.id + " | Cliente: " + aux.nomeCliente + " | Item: " + aux.item + " | Qtd: " + aux.quantidade + " | Valor: R$" + String.format("%.2f", aux.valor) + " | Tipo: " + aux.tipo);
            aux = aux.prox;
        }
    }
}
