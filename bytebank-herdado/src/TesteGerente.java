public class TesteGerente {

    public static void main(String[] args) {
        Gerente ger1 = new Gerente();

        ger1.setNome("Cleiton");
        ger1.setCpf("122.900.399-13");
        ger1.setSalario(3500);

        System.out.println(ger1.getNome());
        System.out.println(ger1.getCpf());
        System.out.println(ger1.getSalario());

        ger1.setSenha(3555);
        System.out.println(ger1.autentica(ger1.getSenha()));
    }

}
