import java.util.Optional;

public class Contato {
    public static void main(String[] args) {
        ContatoPessoa c1 = new ContatoPessoa("Gustavo", 12345678);
        ContatoPessoa c2 = new ContatoPessoa("Ana", 87654321);
        ContatoPessoa c3 = new ContatoPessoa("Carlos", null); // agora pode ser null

        exibirContato(c1);
        exibirContato(c2);
        exibirContato(c3);
    }

    // Método para exibir os dados de forma segura
    public static void exibirContato(ContatoPessoa contato) {
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Telefone: " + contato.getNumero().map(String::valueOf).orElse("Telefone não informado"));
        System.out.println("-------------------");
    }

    // Classe interna
    public static class ContatoPessoa {
        private String nome;
        private Integer numero; // Usando Integer (aceita null)

        public ContatoPessoa(String nome, Integer numero) {
            this.nome = nome;
            this.numero = numero;
        }

        public String getNome() {
            return nome;
        }

        public Optional<Integer> getNumero() {
            return Optional.ofNullable(numero);
        }
    }
}
