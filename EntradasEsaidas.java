import java.util.Scanner;
public class EntradasEsaidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite seu salário: ");
        double salario = scanner.nextDouble();
        System.out.println("Meu nome é: " + nome + " Minha idade é: " + idade + " Meu salário é:" + salario);

    }
}
