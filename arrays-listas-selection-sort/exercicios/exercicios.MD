## Exercício de Arrays e Listas Encadeadas

1) Suponha que você esteja criando um aplicativo para anotar os pedidos dos clientes em um restaurante. Seu aplicativo precisa de uma lista de pedidos. Os garçons adicionam os pedidos a essa lista e os chefes retiram os pedidos da lista. Funciona como uma fila. Os garçons colocam os pedidos no final da fila e os chefes retiram os pedidos do começo dela para cozinhá-los.  

Você usaria um **array** ou uma **lista encadeada** para implementar essa lista?  
*(Dica: listas encadeadas são boas para inserções/ eliminações e arrays são bons para acesso aleatório. O que fazer neste caso?)*  

**R:** Como existem mais operações de inserção e deleção não compensa ficar toda hora copiando o array e gerando complexidade **O(n)** a todo instante, a melhor alternativa seria utilizar **lista encadeada** por sua operação de inserção no início da lista e remoção no final ser de complexidade **O(1)**.

---

2) Vamos analisar um experimento. Imagine que o Facebook guarda uma lista de usuários. Quando alguém tenta acessar o Facebook, uma busca é feita pelo nome de usuário. Se o nome da pessoa está na lista, ela pode continuar o acesso. As pessoas acessam o Facebook com muita frequência, então existem muitas buscas nessa lista. Presuma que o Facebook usa a **pesquisa binária** para procurar um nome na lista. A pesquisa binária requer **acesso aleatório** – você precisa ser capaz de acessar o meio da lista de nomes instantaneamente. Sabendo disso, você implementaria essa lista como um **array** ou uma **lista encadeada**?  

**R:** Com **array**, o acesso aleatório faz com que a busca binária acesse diretamente os elementos do array com índices para conseguir fazer o split do array, o que gera mais custo para **lista encadeada**, visto que toda vez que fosse para acessar um elemento e saber seu valor seria necessário percorrer a lista até o ponto desejado, gerando acessos desnecessários.

---

3) As pessoas se inscrevem no Facebook com muita frequência também. Suponha que você decida usar um **array** para armazenar a lista de usuários. Quais as desvantagens de um array em relação às inserções? Em particular, imagine que você está usando a pesquisa binária para buscar os logins. O que acontece quando você adiciona novos usuários em um array?  

**R:** O realocamento de espaço que nos gera complexidade **O(n)** nas inserções.

---

4) Na verdade, o Facebook não usa nem arrays nem listas encadeadas para armazenar informações. Vamos considerar uma estrutura de dados **híbrida**: um array de listas encadeadas.  
Você tem um array com 26 slots. Cada slot aponta para uma lista encadeada. Por exemplo, o primeiro slot do array aponta para uma lista encadeada que contém os usuários que começam com a letra **A**. O segundo slot aponta para a lista encadeada que contém os usuários que começam com a letra **B**, e assim por diante.  

Suponha que o **Adit B** se inscreva no Facebook e você queira adicioná-lo à lista. Você vai ao slot 1 do array, a seguir para a lista encadeada do slot 1, e adiciona Adit B no final. Agora, suponha que você queira procurar o **Zakhir H**. Você vai ao slot 26, que aponta para a lista encadeada de todos os nomes começados em **Z**. Então, procura pela lista até encontrar o Zakhir H.  

Compare esta estrutura híbrida com arrays e listas encadeadas. É mais lento ou mais rápido fazer inserções e eliminações nesse caso?  
*(Você não precisa responder dando o tempo de execução Big(O), apenas diga se a nova estrutura de dados é mais rápida ou mais lenta do que os arrays e as listas encadeadas.)*

---

**Minha resposta:** Vamos pensar no custo operacional para inserção no **Array** que seria de **O(n)** e para buscar seria de **O(log n)**, logo para as operações descritas seria **O(n) + O(log n)**.  

Vamos pensar no custo operacional para inserção na **lista encadeada** que seria de **O(n)**, pois supondo que na lista estaria por ordem alfabética poderíamos inserir um usuário no meio da lista e para busca seria **O(n)**, logo para as operações descritas seria **O(n) + O(n)**.  

Pensando agora na **estrutura nova**, seria **O(1)** para encontrar o índice específico daquela letra, visto que está ordenado e que cada letra foi mapeada para um índice (`0=A, 1=B, ..., 25=Z`) mais o custo de **O(1)** para inserir/remover, resultando em **O(1) + O(1)**, porém para buscar seria **O(1) + O(n)**.  

Logo, temos 1 relação só com o Array e outra só com a lista encadeada:

- Estrutura híbrida e Array:  
  `(O(1) + O(1)) + (O(1) + O(n)) < O(n) + O(log n)`  
  → logo a estrutura híbrida seria melhor.  

- Estrutura híbrida e Lista encadeada:  
  `(O(1) + O(1)) + (O(1) + O(n)) < O(n) + O(n)`  

- Array e Lista encadeada:  
  `O(n) + O(log n) < O(n) + O(n)`  

→ logo a **estrutura híbrida** seria melhor.

---

### Ordem de rapidez
1) Estrutura híbrida  
2) Array  
3) Lista
