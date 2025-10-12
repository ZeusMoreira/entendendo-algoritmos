public class Fatorial {
    public static void main(String[] args) {
        int resultado = fatorial(5);
        System.out.println(resultado);
    }

    private static int fatorial(int numero) {
        if(numero == 1) {
            return numero;
        }
        return numero * fatorial(numero - 1);
    }
}
