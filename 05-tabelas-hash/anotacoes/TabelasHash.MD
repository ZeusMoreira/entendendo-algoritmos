### Tabelas Hash

Quando precisamos realizar uma busca, utilizamos **pesquisa simples `O(n)`** para arrays não ordenados e **pesquisa binária `O(log n)`** para arrays ordenados.  
Mas e se existisse uma forma de eu falar:  
> "Preciso do elemento com o valor X."  

e isso fosse aceito com tempo de execução de **`O(1)`**?  
Seria perfeito.

---

### Funções Hash

A **função hash** é dada pela característica de **receber uma string e retornar um número** indicando sua posição.  
Mas há alguns requisitos para essa função:

1. **Deve ser consistente**  
   Sempre que for inserida uma determinada string, deverá retornar sempre o mesmo número.  
2. **Deve mapear diferentes strings para diferentes números**  
   Sempre que for inserida uma determinada string, deverá retornar apenas um número exclusivo somente para ela.

---

## Fluxo de funcionamento de uma função Hash

Imagine um **array vazio** inicialmente e uma **função hash** que mapeia strings para números.  

Quando inserimos um par `(string, valor)` na entrada dessa função, essa string segue alguma **lógica de mapeamento** que define onde o valor será armazenado em um determinado índice do array.  
Esse valor poderá ser acessado futuramente ao se passar a mesma string para a função.

Exemplo:

```
("abacate", 5,99) -> índice 3  
("cebola", 3,99) -> índice 1  
("alho", 18,99) -> índice 2  
("banana", 5,99) -> índice 0  
```

Ao passar a string `"banana"` para a função hash, iremos obter o valor `5,99`.

Isso nos garante um tempo de execução **`O(1)`** para consulta.  
A função hash tem conhecimento do tamanho do array, portanto **não retornará índices inválidos**.

Em um primeiro momento, a função hash **armazenará o valor**, e em um segundo momento **retornará** ele de acordo com a string passada.  
A regra é simples:  
> Se não tiver o valor no array → insere.  
> Se tiver → retorna o valor.

Acabamos de criar então uma **tabela hash**, ao associar a função hash a um array.  
Com essa estrutura de dados, conseguimos armazenar dados de forma mais inteligente por conta da função hash.

---

### Tabelas hash para pesquisas

A tabela hash é muito útil para quando se deseja **mapear um item em relação a outro**, por exemplo:  
- Uma *string* para um valor;  
- Um *nome de contato* para um número de telefone;  
- Um *domínio* para um endereço de *IP* (resolução **DNS**).

Também é possível **evitar entradas duplicadas**, como uma lista de pessoas que não podem se repetir.  
Quando passamos uma string para a função hash, ela consegue nos dizer se aquele elemento já está associado a um valor, retornando o próprio valor.  

Usando um simples array, isso teria custo **`O(n)`** ou **`O(log n)`**, dependendo da ordenação.  
Com a **tabela hash**, conseguimos **`O(1)`**.

---

### Colisões

Por mais que a tabela hash tenha essas vantagens, ainda existe o problema de **colisão**, que acontece quando a função hash tenta armazenar um novo item em uma posição já ocupada do array.

Exemplo:  
Um array de 26 elementos, cada um representando uma letra do alfabeto.  
Ao tentar inserir o 27º item, **não há mais espaço** → ocorre colisão.

**Como resolver?**

A solução é **inicializar uma lista encadeada** na posição do array onde houve a colisão, permitindo que o mesmo índice armazene múltiplos elementos.

Mas há um risco:  
Se muitos elementos começarem com a mesma letra (por exemplo, “A”), o primeiro elemento do array pode se tornar uma **lista enorme**, tornando a tabela tão ineficiente quanto uma lista encadeada.

Por isso, escolher **boas funções hash** é essencial — quanto melhor a distribuição, **menor a colisão**.

---

### Desempenho

O **pior caso** das tabelas hash em qualquer operação é lento,  
mas no **caso médio**, as operações são executadas em **`O(1)`**, muito melhor que arrays e listas.

Para evitar o pior caso, devemos **minimizar colisões** com:
- **Baixo fator de carga**  
- **Boa função hash**

O **fator de carga** é dado por:

```
fator de carga = número de itens / número total de posições no array
```

Exemplo:  
2 elementos em um array de 5 posições → fator de carga = 0.4  

Se tivermos mais elementos que posições (fator > 1),  
é hora de **redimensionar o array** — normalmente **duplicando o tamanho** e copiando os elementos antigos.  

Isso tem custo **O(n)**, mas ocorre de forma periódica e **compensa pelo acesso `O(1)`**.

---

### O que é uma boa função hash?

Basicamente, é uma função que **distribui os elementos no array de forma uniforme**.  
Uma função ruim **agrupa valores**, criando maior probabilidade de colisão.
