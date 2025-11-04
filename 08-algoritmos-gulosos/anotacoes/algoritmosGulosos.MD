### Algoritmos Gulosos

Quanto temos um problema em que devemos uma solução ótima, uma abordagem que pode ser seguida é de algoritmos gulosos, que são basicamente algoritmos em que a cada etapa ele busca a solução ótima daquela etapa localmente, então é um tipo de algoritmo incapaz de olhar para o contexto global e que nunca volta atrás para avaliar as outras possibilidades, vamos dar um exemplo:

Imagine que você precise ir do ponto A até o ponto B (imagine um grafo direcionado ponderado), porém você tem 2 caminhos para ir de A até B, o primeiro caminho tem 1000 vértices entre A e B onde cada aresta tem o custo 1 e um segundo caminho onde possui apenas um vértice entre A e B e o custo de sair de A até esse vértice do meio é 2 e o para chegar ao vértice B também é 2. Olhando um panorama geral nós facilmente poderiamos afirmar que o segundo caminho é melhor, pois o custo final seria de 4 e o primeiro caminho seria uma má idéia, pois o custo final é de 1 * 999 (número de arestas), gerando um custo muito maior, mas o algoritmo guloso ele tem essa problemática, ele sempre olha para frente e não volta atrás, então numa primeira decisão ele iria escolher o caminho de custo 1 e iria até o final percorrendo todas as 999 arestas e no final nos diria que o caminho ótimo global é o primeiro caminho. 

Algoritmos gulosos geralmente tem um algoritmo bem fácil para resolver um problema, então você perceberá que são fáceis de entender e de implementar.

### O Problema da Mochila

Imagine um cenário onde você tem uma sacola que suporta 16kg e pretende guardar seus itens mais valiosos dentro dessa mochila a fim de levar o máximo de itens valiosos de maneira que não transborde a sacola.

Com 3 itens possíveis: Rádio de 13Kg custando 3 mil, Notebook de 9Kg custando 2 mil reais e um violão de 6Kg custando 1500 reais.

Caso seguirmos o algoritmo guloso primeiro avaliariamos os itens mais caros e que cabem na sacola, seguindo a linha de raciocínio o algoritmo falaria para primeiro pegarmos o rádio visto que ele é o mais caro e cabe na bolsa e depois nenhum item mais caberia, porém tem uma solução melhor que o algoritmo guloso não encherga que seria a solução ótima de levar o notebook e o violão, com isso o valor seria levado seria de 3500 ao inves de 3000 proposto pelo algoritmo guloso.

Porém se nos contentarmos em levar uma boa quantia de valor ao invés da melhor quantia possível o algoritmo guloso nos fornece um "bom resultado" e em alguns cenário um "bom resultado" ja é o suficiente para resolver um problema ou aproximar algo, algoritmos gulosos são simples e rápidos de desenvolver, porém não garantem a solução ótima caso for necessário.