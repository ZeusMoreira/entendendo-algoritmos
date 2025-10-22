public class Exercicio2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(contarElementos(array, 0));
    }

    private static int contarElementos(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }

        return 1 + contarElementos(array, index + 1);
    }
}
