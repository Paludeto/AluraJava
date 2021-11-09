package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.*;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(10, 40);
        Conta cc2 = new ContaCorrente(12, 42);

        lista.add(cc);
        lista.add(cc2);

        for(Conta oRef : lista) {
            System.out.println(oRef);
        }


    }

}
