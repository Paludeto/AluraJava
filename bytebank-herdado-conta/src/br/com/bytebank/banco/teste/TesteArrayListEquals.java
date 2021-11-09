package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import java.util.ArrayList;
import java.util.List;

public class TesteArrayListEquals {

    public static void main(String[] args) {
        List<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(11, 33);
        Conta cc2 = new ContaCorrente(22, 44);

        lista.add(cc1);
        boolean existe = lista.contains(cc1);
        boolean igual = cc1.equals(cc2);
        System.out.println("Existe? " + existe);
        System.out.println("Igual? " + igual);


        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }

}
