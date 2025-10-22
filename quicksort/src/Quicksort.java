import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quicksort {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(23, 2, 45, 13, 23, 99, -5, 0, 1));
        // List<Integer> array = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0));
        List<Integer> numerosOrdenados = quicksort(array);
        for(int i=0; i < numerosOrdenados.size(); i++) {
            System.out.println(numerosOrdenados.get(i));
        }
    }

    private static List<Integer> quicksort(List<Integer> array) {
        if(array.size() < 2) {
            return array;
        }

        int pivo = array.get(0);
        List<Integer> menoresQuePivo = selecionarMenoresQuePivo(array, pivo);
        List<Integer> maioresQuePivo = selecionarMaioresQuePivo(array, pivo);

        List<Integer> resultado = new ArrayList<>();

        resultado.addAll(quicksort(menoresQuePivo)); 
        resultado.add(pivo);                        
        resultado.addAll(quicksort(maioresQuePivo));

        return resultado;
    }

    private static List<Integer> selecionarMenoresQuePivo(List<Integer> array, int pivo) {
        List<Integer> menoresQuePivo = new ArrayList<>();
        for(int i=1; i < array.size(); i++) {
           if(array.get(i) < pivo) {
            menoresQuePivo.add(array.get(i));
           }
        }
        return menoresQuePivo;
    }

    private static List<Integer> selecionarMaioresQuePivo(List<Integer> array, int pivo) {
        List<Integer> maioresQuePivo = new ArrayList<>();
        for(int i=1; i < array.size(); i++) {
           if(array.get(i) >= pivo) {
            maioresQuePivo.add(array.get(i));
           }
        }
        return maioresQuePivo;
    }
}