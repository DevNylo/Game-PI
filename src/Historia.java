import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Historia {
    Personagem personagem = new Personagem();
    public void capituloUm()  {

        String ato1 = "Historia/ato1.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ato1))) {

            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }

        /* CRIAÇÃO DO PERSONAGEM */

        System.out.print("Informe o nome do seu personagem: ");
        personagem.setNome(new Scanner(System.in).nextLine());


    }
    public static void capituloDois(){

    }
    public static void capituloTres(){
        
    }
}
