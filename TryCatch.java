import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite seu primeiro numero: ");
            int numero1 = scanner.nextInt();
            System.out.println("Digite seu segundo numero: ");
            int numero2 = scanner.nextInt();
            int resultado = numero1 / numero2;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("inválido");
        } finally {
            System.out.println("Fim de execução");
        }

    }
}
