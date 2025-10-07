## Array

Quando pensamos em **Arrays**, pensamos em dados em sequência, mas essa sequência fica aonde por baixo dos panos?  
Fica na **memória**: quando solicitamos a criação de um array de `n` posições, uma linha de endereços de tamanho `n` é reservada **sequencialmente** na memória e isso nos gera alguns pontos de atenção e observação...

---

### 1) Inserção
Quando desejamos realizar operações de **inserção** nesse Array, o que acontece com a memória? Qual o custo disso?

Bem, quando desejamos realizar a inserção nesse Array considerando que está com os `n` espaços já preenchidos isso nos gera um problema, pois o sistema não pode simplesmente alocar mais um endereço sequencial da memória, já que esse endereço já pode estar preenchido.  

Então o sistema vai tentar alocar um novo espaço na memória onde tenha `n+1` espaços disponíveis e realizará a cópia dos dados da sequência anterior alocada para esse novo espaço — e isso nos gera um custo de **O(n)**.  
Logo, **operações de inserção são custosas**.

---

### 2) Busca por índice
Quando desejamos realizar **buscas em índices específicos** com Array, qual o custo disso?

Nesse caso já muda um pouco o panorama: como está alocado sequencialmente na memória podemos acessar o índice diretamente, já que essa sequência foi previamente calculada e fixada na memória. Isso nos gera um custo muito bom de **O(1)**.  
Logo, **operações de busca específica são muito boas** para utilizar com Arrays.

---

## Lista encadeada

**Listas encadeadas** são uma forma de armazenar dados de uma forma sequencial, assim como o Array, porém têm o diferencial de **não precisar ser sequencial na memória**.  

Podemos ter vários endereços da memória alocados para essa lista, porém sem estarem do lado um do outro fisicamente. O que acontece é que quando instanciamos uma lista colocamos referências para o **anterior** (caso seja duplamente encadeada) e o **próximo elemento (nó)** e esse outro nó pode estar em um lugar completamente disperso na memória, mas o nó anterior/próximo sabe o endereço dele.  

Isso também nos gera alguns pontos de atenção e observação...

---

### 1) Inserção
Quando desejamos realizar operações de **inserção** nessa lista, o que acontece com a memória? Qual o custo disso?

Em termos gerais, quando falamos de inserção em listas encadeadas (com *tail*), pensamos em inserção no **início** ou no **fim** da lista.  

A estrutura de Lista Encadeada tem os atributos de referência para o início e para o fim da lista, isso nos permite pegar essa referência e apontar para um novo nó e defini-lo como referência de início/fim. O custo disso é **O(1)**.  

Porém, caso haja a necessidade de inserção em alguma outra parte da lista, o custo é de **O(n)**.

---

### 2) Busca por índice
Quando desejamos realizar **buscas em índices específicos** com lista encadeada, qual o custo disso?

Aqui surge um ponto divergente do Array: a lista encadeada **não tem propriedade de index**, então é impossível acessarmos diretamente um elemento.  

Caso precise acessar o elemento `x` da lista, deve-se percorrer desde o primeiro (ou último, caso seja duplamente ligada) até o elemento `x` através de conexão de endereços (`o 1 fala onde tá o 2, que fala onde tá o 3,..., que fala onde tá o x`).  

Isso nos gera um custo de **O(n)** e, como a lista carrega todas essas referências, acaba ocupando mais espaço para cada endereço também.

---

### Observações
- **Obs 1:** A deleção é o mesmo fundamento e mesmo custo para ambas as estruturas.  
- **Obs 2:** Arrays e Listas encadeadas são úteis para gerar outras estruturas de dados que veremos posteriormente.
