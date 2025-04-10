import java.util.Scanner;
public class VerificarIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua idade ? ");
        int idadePessoa = scanner.nextInt();
        try {
            verificarIdadePessoa(idadePessoa);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void verificarIdadePessoa(int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("Menor de idade não permitido.");
        } else {
            System.out.println("Idade válida: " + idade);
        }
    }


    public static class IdadeInvalidaException extends Exception {
        public IdadeInvalidaException(String mensagem) {
            super(mensagem); // passa a mensagem para a Exception
        }
    }
}
