public class TestaConexao {

    public static void main(String[] args) {
        //try-with-resources, implements autocloseable
        try(Conexao conexao = new Conexao() ){
            conexao.leDados();
        } catch(IllegalStateException ex){
            System.out.println("Deu erro na conexão");
        }

//        LEGACY CODE BELOW
//        Conexao con = null;
//        try{
//            con = new Conexao();
//            con.leDados();
//            con.fecha();
//        } catch(IllegalStateException ex){
//            System.out.println("Deu erro na conexão");
//        } finally {
//            con.fecha();
//        }

    }

}
