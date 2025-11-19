public class DequeDocumentos {

    private No inicio;
    private No fim;

    public DequeDocumentos() {
        inicio = null;
        fim = null;
    }

    // =============================
    // ADICIONAR DOCUMENTOS
    // =============================

    public void adicionar_documento_normal(Documento doc) {
        No novo = new No(doc);

        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.prox = novo;
            novo.ant = fim;
            fim = novo;
        }
    }

    public void adicionar_documento_urgente(Documento doc) {
        No novo = new No(doc);

        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.prox = inicio;
            inicio.ant = novo;
            inicio = novo;
        }
    }

    // =============================
    // PROCESSAR DOCUMENTOS
    // =============================

    public Documento processar_proximo() {
        if (inicio == null) return null;

        Documento doc = inicio.dado;
        inicio = inicio.prox;

        if (inicio != null)
            inicio.ant = null;
        else
            fim = null;

        return doc;
    }

    public Documento processar_ultimo() {
        if (fim == null) return null;

        Documento doc = fim.dado;
        fim = fim.ant;

        if (fim != null)
            fim.prox = null;
        else
            inicio = null;

        return doc;
    }

    // =============================
    // EXTRA
    // =============================

    public boolean fila_vazia() {
        return inicio == null;
    }

    public int total_documentos() {
        int cont = 0;
        No aux = inicio;
        while (aux != null) {
            cont++;
            aux = aux.prox;
        }
        return cont;
    }

    public int total_paginas() {
        int soma = 0;
        No aux = inicio;
        while (aux != null) {
            soma += aux.dado.getPaginas();
            aux = aux.prox;
        }
        return soma;
    }

    public void visualizar_fila() {
        System.out.println("\n--- FILA DE IMPRESSÃO ---");
        No aux = inicio;

        if (aux == null) {
            System.out.println("A fila está vazia.\n");
            return;
        }

        while (aux != null) {
            System.out.println(aux.dado);
            aux = aux.prox;
        }
        System.out.println();
    }
}
