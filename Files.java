import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("arquivo.txt", true); // true = modo append
            writer.write("Olá, Gustavo!\n");
            writer.write("Aprendendo a escrever arquivos em Java.\n");
            writer.close(); // sempre feche o arquivo
            System.out.println("Arquivo gravado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}