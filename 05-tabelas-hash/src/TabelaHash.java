import java.util.HashMap;
import java.util.Map;

public class TabelaHash {
    public static void main(String[] args) {
        Map<String, Integer> idades = new HashMap<>();

        // put → adiciona ou substitui um valor
        idades.put("João", 25);
        idades.put("Maria", 30);
        idades.put("José", 40);

        System.out.println(idades);
    }
}
