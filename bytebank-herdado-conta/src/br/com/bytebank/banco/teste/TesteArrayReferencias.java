package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        Conta[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(22, 33);
        ContaCorrente cc2 = new ContaCorrente(55, 22);

        contas[0] = cc1;
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());
        ContaCorrente ref = (ContaCorrente) contas[0];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());

    }

}
