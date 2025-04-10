import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class LerScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto:");
        String texto = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter("arquivo3.txt", true);
            writer.write(texto);
            writer.close();
            System.out.println("Arquivo gravado");
        } catch (IOException e) {
        System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo3.txt"));
            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

    }
}
