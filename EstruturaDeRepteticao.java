public class EstruturaDeRepteticao {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Número: " + i);
        }

        int numero = 5;

        while (numero <10) {
            numero ++;
            System.out.println(numero);
        }
        do {
            System.out.println(numero);
        } while (numero <10);
    }
}
