public class Pedido {
    int id;
    String nomeCliente;
    String item;
    int quantidade;
    double valor;
    String tipo;
    Pedido prox;

    public Pedido(int id, String nomeCliente, String item, int quantidade, double valor, String tipo) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.item = item;
        this.quantidade = quantidade;
        this.valor = valor;
        this.tipo = tipo;
    }
}
