public class ArraysEStrings {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        numeros[0] = 0;
        numeros[1] = 1;
        numeros[2] = 2;
        numeros[3] = 3;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        String[] nomes = {"gustavo", "guilherme", "júlia", "jéssica", "augusto"};
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i].toUpperCase());
            System.out.println(nomes[i].length());
        }
    }
}
