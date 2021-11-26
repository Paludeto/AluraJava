import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        try {

            FileInputStream fis = new FileInputStream("lorem.txt");
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String linha = br.readLine();
            while(linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }

        } catch (FileNotFoundException e) {

            System.out.println("Erro, arquivo não encontrado.");

        }

    }


}
