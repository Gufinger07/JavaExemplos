import java.util.*;

public class Collection {
    public static void main(String[] args) {
        List<String> veiculos = new ArrayList<>();
        veiculos.add("Lancer"); // metodo adicionar
        veiculos.add("IX35");
        veiculos.add("Veloster");
        veiculos.remove(1); // metodo que remove
        veiculos.set(1, "Celta");

        System.out.println(veiculos);
        System.out.println(veiculos.size());


        Set<Integer> placas = new HashSet<>();
            placas.add(1234);
            placas.add(4567);
            placas.add(8910);
            placas.remove(8910); // remove o elemento e não o index
        System.out.println(placas);


        Map<String, Integer> infos = new HashMap<>();
        infos.put("Gustavo", 1234);
        infos.put("Júlia", 5678);

        for (Map.Entry<String, Integer> item : infos.entrySet()) {
            System.out.println("Pessoa: " + item.getKey() + " | Placa: " + item.getValue());
        }

    }

    public static void sort(List<String> nomes) {

    }
}
