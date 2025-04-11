import java.util.Optional;

public class TesteOptional {
    public static void main(String[] args) {
        // Exemplo 1: nome comum
        Optional<String> nome1 = verificarNome("Gustavo");

        // Exemplo 2: nome bloqueado
        Optional<String> nome2 = verificarNome("admin");

        // Usa orElse para garantir que sempre mostra algo
        System.out.println("Resultado 1: " + nome1.orElse("Nome restrito"));
        System.out.println("Resultado 2: " + nome2.orElse("Nome restrito"));
    }

    // Método que retorna um Optional
    public static Optional<String> verificarNome(String nome) {
        // SE for "admin", retorna vazio
        if (nome.equalsIgnoreCase("admin")) {
            return Optional.empty(); // significa: sem valor
        }

        // SENÃO, retorna o nome normalmente
        return Optional.of(nome); // valor presente
    }
}
