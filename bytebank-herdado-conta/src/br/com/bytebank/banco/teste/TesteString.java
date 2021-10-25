package br.com.bytebank.banco.teste;

public class TesteString {

    public static void main(String[] args) {
        String nome = "Cleita";
        String nomeResultado = nome.replace('o', 'a');
        String nomeResultadoLowerCase = nome.toLowerCase();

        System.out.println(nomeResultado);
        System.out.println(nomeResultadoLowerCase);
    }

}
