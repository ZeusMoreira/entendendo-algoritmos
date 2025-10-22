public class PesquisaBinaria {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 12, 18, 25, 33, 47, 52, 68, 79};
        int numeroEscolhido = 9;
        System.out.println(realizarBuscaBinaria(numeros, numeroEscolhido));
    }
 
    private static String realizarBuscaBinaria(int[] arr, int valorEscolhido) {
        int max = arr.length - 1;
        int min = 0;

        for(int i = max/2; max >= min; i = (max+min)/2) {
            if(arr[i] == valorEscolhido) {
                return "Valor encontrado no índice " + i;
            }
            if(arr[i] > valorEscolhido) {
                max = i - 1;
            } else {
                min = i + 1;
            }
        }

        return "Valor não encontrado!";
    }
}
