public class SelectionSort {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 1, 3, 2};
        int[] numerosOrdenados = ordenar(numeros);

        for(int i=0; i < numerosOrdenados.length; i++) {
            System.out.println(numerosOrdenados[i]);
        }
    }
 
    private static int[] ordenar(int[] array) {
        int[] arrayOrdenado = new int[array.length];
        for(int i=0; i < array.length; i++) {
            int min = array[i];
            for(int j=i+1; j < array.length; j++) {
                trocarElementosDeLugar(array, i, j, min);
            }
            arrayOrdenado[i] = array[i];
        }
        return arrayOrdenado;
    }

    private static void trocarElementosDeLugar(int[] array, int i, int j, int minimo) {
        if(array[i] > array[j]) {
            minimo = array[j];
            array[j] = array[i];
            array[i] = minimo;
        }  
    }
}
