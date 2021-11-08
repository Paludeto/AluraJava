package br.com.bytebank.banco.modelo;

public class GuardaContas {

    private Object[] referencias;
    private int posicao;

    public GuardaContas() {
        this.referencias = new Object[10];
        this.posicao = 0;
    }

    public void addConta(Object novaConta) {
        referencias[this.posicao] = novaConta;
        this.posicao++;
    }

    public int getQuantidade() {
        return this.posicao;
    }

    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }

    public void trocaConta(int pos, Object novaConta) {
        this.referencias[pos] = novaConta;
    }

}
