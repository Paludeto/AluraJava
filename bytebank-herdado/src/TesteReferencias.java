public class TesteReferencias {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSalario(5000);
        g1.setNome("Cleiton");

        EditorDeVideo e1 = new EditorDeVideo();
        e1.setSalario(2500);
        
        Designer d1 = new Designer();
        d1.setSalario(2000);

        ControleBonificacao ctrl = new ControleBonificacao();
        ctrl.registra(g1);
        ctrl.registra(e1);
        ctrl.registra(d1);

        System.out.println(ctrl.getSoma());
    }
}
