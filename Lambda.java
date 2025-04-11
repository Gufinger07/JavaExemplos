import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> nomes = List.of("maria","ana", "marcelo");

        nomes.stream()
                .filter(nome -> nome.startsWith("m"))
                .forEach(nome -> System.out.println(nome.toUpperCase()));

        List<Integer> numeros = List.of(1,2,3,4,5,6);
        numeros.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n + 10)
                .forEach(n -> System.out.println(n));

        List<String> nomesOrdenar = List.of("Fabiano", "Ana", "Claudio");
        nomesOrdenar.stream().sorted().forEach(n -> System.out.println(n));


    }

}
