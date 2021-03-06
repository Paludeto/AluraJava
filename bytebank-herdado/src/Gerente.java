public class Gerente extends Funcionario implements Autenticavel {

    private int senha;
    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }

    public int getSenha() {
        return this.senha;
    }

    @Override
    public double getBonificacao() {
        return super.getSalario();
    }

}
