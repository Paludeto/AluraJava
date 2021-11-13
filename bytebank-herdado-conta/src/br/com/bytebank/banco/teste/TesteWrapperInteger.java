package br.com.bytebank.banco.teste;
import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        Integer idadeRef = 29; //autoboxing
        int primitivo = Integer.valueOf(21); //unboxing

        List<Integer> listaInteiros = new ArrayList<Integer>();
        listaInteiros.add(primitivo); //autobox
        listaInteiros.add(idadeRef);

        int int1 = listaInteiros.get(0); //unbox
        Integer int2 = listaInteiros.get(1); //normal

        System.out.println(int1);
        System.out.println(int2);

        Integer valorRef = Integer.valueOf(33); // delegando a criação para método valueOf
        int valorPri = valorRef.intValue(); //desembrulhando, pegando o valor primitivo do objeto wrapper

        System.out.println(valorPri); //33

        Integer iParseado1 = Integer.valueOf("42"); //parseando e devolvendo referencia
        int iParseado2 = Integer.parseInt("44");  //parseando e devolvendo primitivo

        System.out.println(iParseado1); //42
        System.out.println(iParseado2); //44

        System.out.println(Integer.MAX_VALUE); // 2^31 - 1
        System.out.println(Integer.MIN_VALUE); //-2^31

        System.out.println(Integer.SIZE); // 32 bits
        System.out.println(Integer.BYTES); //4 Bytes

    }

}
