public class MaioresQuadrados {
    public static void main(String[] args) {
        Proporcao proporcao = new Proporcao(2001, 102);
        Proporcao proporcaoResposta = calcularMaioresQuadrados(proporcao);
        System.out.println(proporcaoResposta.x);
        System.out.println(proporcaoResposta.y);
    }

    private static Proporcao calcularMaioresQuadrados(Proporcao proporcao) {
        int maior = Math.max(proporcao.x, proporcao.y);
        int menor = Math.min(proporcao.x, proporcao.y);
        int resto = maior % menor;

        if(resto == 0) {
            return new Proporcao(proporcao.y, proporcao.y);
        }

        return calcularMaioresQuadrados(new Proporcao(menor, resto));
    } 
}

class Proporcao {
    int x;
    int y;

    Proporcao(int x, int y) {
        this.x = x;
        this.y = y;
    }
}