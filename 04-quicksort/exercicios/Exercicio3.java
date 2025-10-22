public class Exercicio3 {
    public static void main(String[] args) {
        int[] array = {2, 8, 5};
        System.out.println(maiorValor(array, 0, array[0]));
    }

    private static int maiorValor(int[] array, int index, int maior) {
        if (index == array.length - 1) {
            return maior;
        }

        if (array[index + 1] > maior) {
            maior = array[index + 1];
        }

        return maiorValor(array, index + 1, maior);
    }
}
