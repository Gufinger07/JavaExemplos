
import java.util.*;
public class Interacao {
    public static void main(String[] args) {
        List<String> nomes = List.of("Gustavo", "Claucio", "lucifer");
        for (String nome: nomes) {
            System.out.println(nome);
        }

        List<String> nomesIterator = new ArrayList<>(List.of("Gustavo", "Júlia", "Lucas"));
        Iterator<String> iterator = nomesIterator.iterator();

        while (iterator.hasNext()) {
            String nome = iterator.next();
            if (nome.equals("Lucas")) {
                iterator.remove(); // remove com segurança
            }
        }
        System.out.println(nomesIterator); // [Gustavo, Lucas]

        List<String> nomesStream= List.of("Gustavo", "Júlia", "Lucas");

        nomesStream.stream()
                .filter(nome -> nome.startsWith("G"))
                .forEach(System.out::println); // Gustavo
    }

}
