public class Fluxo {
    //testando debugger, entendendo o conceito de call stack, step over e step into.
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao e) {
            String mensagem = e.getMessage();
            System.out.println("Arithmetic Exception " + mensagem);
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
//        try {
//            metodo2();
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic exception");
//        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            throw new MinhaExcecao("Deu ruim.");
        }
        System.out.println("Fim do metodo2");
    }

}
