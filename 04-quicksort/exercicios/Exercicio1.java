public class Exercicio1 {
    public static void main(String[] args) {
        int[] array = {2};
        System.out.println(soma(array, 0));
    }

    private static int soma(int[] array, int index) {
        if (index >= array.length) {
            return 0;
        }
        return array[index] + soma(array, index + 1);
    }
}
