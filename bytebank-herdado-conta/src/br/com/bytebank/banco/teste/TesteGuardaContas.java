package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;
import br.com.bytebank.banco.modelo.GuardaContas;

public class TesteGuardaContas {
    public static void main(String[] args) {
        GuardaContas guardador = new GuardaContas();

        Conta cc = new ContaCorrente(22, 11);
        guardador.addConta(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.addConta(cc2);

        Conta cc3 = new ContaCorrente(33, 44);
        guardador.trocaConta(1, cc3);

        Conta referencia1 = guardador.getReferencia(1);
        System.out.println(referencia1.getNumero());

        int tamanho = guardador.getQuantidade();
        System.out.println(tamanho);

        Conta referencia2 = guardador.getReferencia(0);
        System.out.println(referencia2.getNumero());

    }
}
