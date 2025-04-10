import java.util.*;

public class ComparableExemplo {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Gustavo", 25));
        pessoas.add(new Pessoa("Júlia", 30));
        pessoas.add(new Pessoa("Ana", 20));

        // Ordena com base no nome (compareTo)
        Collections.sort(pessoas);

        // Exibe a lista ordenada
        for (Pessoa p : pessoas) {
            System.out.println(p.nome + " - " + p.idade + " anos");
        }
    }

    // Classe Pessoa implementando Comparable
    public static class Pessoa implements Comparable<Pessoa> {
        String nome;
        int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public int compareTo(Pessoa outra) {
            // Ordenação alfabética pelo nome
            return this.nome.compareTo(outra.nome);
        }
    }
}
