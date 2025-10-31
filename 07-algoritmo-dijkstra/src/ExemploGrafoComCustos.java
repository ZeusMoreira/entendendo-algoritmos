import java.util.*;

// Há um exemplo de execução desse algoritmo ilustrado em minha caderneta.

public class ExemploGrafoComCustos {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> grafo = criarGrafo();
        Map<String, Integer> custos = criarCustosIniciais();
        Map<String, String> pais = criarPaisIniciais();

        Map<List<String>, Integer> resultado = buscarCaminhoMenosCustoso(grafo, custos, pais);

        resultado.forEach((caminho, custo) -> {
            System.out.println("Caminho: " + String.join(" → ", caminho));
            System.out.println("Custo total: " + custo);
        });
    }

    // -------------------------------
    // Configuração do grafo
    // -------------------------------

    private static Map<String, Map<String, Integer>> criarGrafo() {
        Map<String, Map<String, Integer>> grafo = new HashMap<>();

        // grafo.put("inicio", Map .of("A", 6, "B", 2));
        // grafo.put("A", Map.of("fim", 1));
        // grafo.put("B", Map.of("A", 3, "fim", 5));
        // grafo.put("fim", Collections.emptyMap());

        grafo.put("D", Map .of("A", 5, "B", 9, "E", 5, "F", 1));
        grafo.put("A", Map.of("B", 2));
        grafo.put("B", Map.of("C", 8));
        grafo.put("E", Map.of("B", 1));
        grafo.put("F", Map.of("E", 3, "G", 1));
        grafo.put("G", Map.of("E", 1));
        grafo.put("C", Collections.emptyMap());

        // grafo.put("D", Map .of("A", 2, "B", 9, "E", 5, "F", 1));
        // grafo.put("A", Map.of("B", 1));
        // grafo.put("B", Map.of("C", 8));
        // grafo.put("E", Map.of("B", 1));
        // grafo.put("F", Map.of("E", 3, "G", 1));
        // grafo.put("G", Map.of("E", 1));
        // grafo.put("C", Collections.emptyMap());

        return grafo;
    }

    private static Map<String, Integer> criarCustosIniciais() {
        final int INFINITO = Integer.MAX_VALUE;
        // return new HashMap<>(Map.of(
        //         "A", 6,
        //         "B", 2,
        //         "fim", INFINITO
        // ));
        return new HashMap<>(Map.of(
                "A", 5,
                "B", 9,
                "C", INFINITO,
                "E", 5,
                "F", 1,
                "G", INFINITO
        ));
        // return new HashMap<>(Map.of(
        //         "A", 2,
        //         "B", 9,
        //         "C", INFINITO,
        //         "E", 5,
        //         "F", 1,
        //         "G", INFINITO
        // ));
    }

    private static Map<String, String> criarPaisIniciais() {
        Map<String, String> pais = new HashMap<>();
        // pais.put("A", "inicio");
        // pais.put("B", "inicio");
        // pais.put("fim", null);
        pais.put("A", "D");
        pais.put("B", "D");
        pais.put("C", null);
        pais.put("E", "D");
        pais.put("F", "D");
        pais.put("G", null);
        return pais;
    }

    // -------------------------------
    // Algoritmo de Dijkstra simplificado
    // -------------------------------

    private static Map<List<String>, Integer> buscarCaminhoMenosCustoso(
            Map<String, Map<String, Integer>> grafo,
            Map<String, Integer> custos,
            Map<String, String> pais) {

        String noAtual = encontrarNoComMenorCusto(custos, new HashSet<>());

        Set<String> processados = new HashSet<>();

        while (noAtual != null) {
            int custoAtual = custos.get(noAtual);
            Map<String, Integer> vizinhos = grafo.get(noAtual);

            for (Map.Entry<String, Integer> aresta : vizinhos.entrySet()) {
                String vizinho = aresta.getKey();
                int novoCusto = custoAtual + aresta.getValue();

                if (novoCusto < custos.get(vizinho)) {
                    custos.put(vizinho, novoCusto);
                    pais.put(vizinho, noAtual);
                }
            }

            processados.add(noAtual);
            noAtual = encontrarNoComMenorCusto(custos, processados);
        }

        return gerarResultado(custos, pais);
    }

    private static String encontrarNoComMenorCusto(Map<String, Integer> custos, Set<String> processados) {
        int menorCusto = Integer.MAX_VALUE;
        String noMenorCusto = null;

        for (Map.Entry<String, Integer> entry : custos.entrySet()) {
            String no = entry.getKey();
            int custo = entry.getValue();

            if (custo < menorCusto && !processados.contains(no)) {
                menorCusto = custo;
                noMenorCusto = no;
            }
        }

        return noMenorCusto;
    }

    // -------------------------------
    // Geração do resultado final
    // -------------------------------

    private static Map<List<String>, Integer> gerarResultado(Map<String, Integer> custos, Map<String, String> pais) {
        String noAtual = "C";
        List<String> caminho = new ArrayList<>();

        while (noAtual != null) {
            caminho.add(noAtual);
            noAtual = pais.get(noAtual);
        }

        Collections.reverse(caminho);

        Map<List<String>, Integer> resultado = new HashMap<>();
        resultado.put(caminho, custos.get("C"));

        return resultado;
    }
}