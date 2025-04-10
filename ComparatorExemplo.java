import java.util.*;

public class ComparatorExemplo {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Gustavo", 25));
        pessoas.add(new Pessoa("Júlia", 30));
        pessoas.add(new Pessoa("Ana", 20));

        // === ORDEM ALFABÉTICA (Comparable)
        Collections.sort(pessoas); // usa compareTo()
        System.out.println("Ordenado por nome:");
        for (Pessoa p : pessoas) {
            System.out.println(p.nome + " - " + p.idade + " anos");
        }

        System.out.println("\nOrdenado por idade:");

        // === ORDEM POR IDADE (Comparator)
        pessoas.sort(Comparator.comparingInt(p -> p.idade));

        for (Pessoa p : pessoas) {
            System.out.println(p.nome + " - " + p.idade + " anos");
        }
    }

    // Classe Pessoa com Comparable (ordem por nome)
    public static class Pessoa implements Comparable<Pessoa> {
        String nome;
        int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public int compareTo(Pessoa outra) {
            return this.nome.compareTo(outra.nome); // ordem alfabética
        }
    }
}