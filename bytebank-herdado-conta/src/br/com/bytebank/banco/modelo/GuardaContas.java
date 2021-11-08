package br.com.bytebank.banco.modelo;

public class GuardaContas {

    private Conta[] referencias;
    private int posicao;

    public GuardaContas() {
        this.referencias = new Conta[10];
        this.posicao = 0;
    }

    public void addConta(Conta novaConta) {
        referencias[this.posicao] = novaConta;
        this.posicao++;
    }

    public int getQuantidade() {
        return this.posicao;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }

    public void trocaConta(int pos, Conta novaConta) {
        this.referencias[pos] = novaConta;
    }

}
