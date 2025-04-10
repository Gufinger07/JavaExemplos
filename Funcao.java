public class Funcao {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;

        int media = CalcularMedia(a, b);
        System.out.println(media);
        String nome = ImprimirNome();
        System.out.println(nome);
    }

    public static int CalcularMedia(int a, int b) {
         return (a + b)/2;

    }
    public static String ImprimirNome() {
        return "Gustavo Coelho Finger";
    }
}
