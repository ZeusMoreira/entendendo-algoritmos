## Estrutura de dados Pilha

A pilha é uma estrutura de dados com o seguinte princípio: o **último** elemento inserido na pilha é o **primeiro** a ser retirado, chamamos isso de **LIFO** (*last in, first out*).

**Exemplificando:**

Imagine uma **pilha** de roupas em cima da cama, seguindo um raciocínio em que a pessoa dobrou a primeira roupa e iniciou a pilha e, a cada roupa dobrada, ela coloca no topo da pilha, sem a possibilidade de levantar uma subpilha e pegar uma roupa do meio. O que vai acontecer quando for necessário pegar alguma roupa da pilha que não seja a última é:

A pessoa irá desempilhar um número *x* de roupas, uma de cada vez, até que a roupa desejada seja encontrada e retirada.

- O ato de retirar do topo da pilha é a operação **pop**  
- O ato de colocar no topo da pilha é a operação **push**

**Obs:** Não focaremos nessa etapa em operações como empilhar o que foi desempilhado.

Entenderemos a utilidade dessa estrutura logo abaixo.

---

## Recursão

Embora estejamos acostumados a criar rotinas utilizando ciclos (`while`, `for`, `do while`...) para resolver problemas de recorrência, temos também uma outra possibilidade que se encaixa em alguns problemas: a **recursão**.  

A recursão é o ato de chamarmos a própria função com um valor atualizado provido pelo caso recursivo, enchendo a **pilha de execução** até que o **caso base** seja atingido e a pilha de execução seja resolvida voltando até a primeira chamada da função.  

Vamos ver um exemplo:

```java
private int fatorial(int x) {
    if(x == 1) {
        return 1;
    }
    return x * fatorial(x-1);
}

int resultado = fatorial(3);
System.out.println(resultado);
```

Analisando essa função, observamos que no segundo `return` temos `return x * fatorial(x-1);`, isso nos mostra que a função **fatorial** é uma **função recursiva**.

---

### Mas o que está acontecendo na função?

Uma função recursiva é definida por **2 casos**: o **caso recursivo** e o **caso base**.

O **caso base** é quando a chamada `return x * fatorial(x-1);` não é mais necessária, pois chegamos no ponto chave da função.  
No caso do fatorial, você para de multiplicar um número pelo outro quando se chega no número 1:  
`5! = 5 * 4 * 3 * 2 * 1 = 120`, então o caso base é quando o número passado pela função é o 1.

O **caso recursivo** é quando a chamada `return x * fatorial(x-1);` ainda é necessária, pois não chegamos no caso base.  
Então esse valor precisa ser atualizado e a função deve ser chamada novamente com o valor atualizado.  
No caso da função fatorial seria: `5! = 5 * 4 * ... * 1 = 120`, enquanto o valor ainda é diferente de 1 o `return x * fatorial(x-1);` é chamado.

---

### Visualização da execução da função fatorial

```
fatorial(5) -> entra no caso recursivo e faz: return 5 * fatorial(5-1);  // passa 4 para função fatorial
fatorial(4) -> entra no caso recursivo e faz: return 4 * fatorial(4-1);  // passa 3
fatorial(3) -> entra no caso recursivo e faz: return 3 * fatorial(3-1);  // passa 2
fatorial(2) -> entra no caso recursivo e faz: return 2 * fatorial(2-1);  // passa 1
fatorial(1) -> entra no caso base e faz: return 1;
```

Nesse momento a **pilha de execução** foi preenchida da seguinte forma:

```
fatorial(1) -> quinto elemento, sendo a última vez que a função foi chamada.
fatorial(2) -> quarto elemento...
fatorial(3) -> terceiro elemento...
fatorial(4) -> segundo elemento...
fatorial(5) -> primeiro elemento da pilha, que é quando a função é chamada pela primeira vez.
```

Perceba que a **ordem da pilha** é o **inverso** da ordem de chamada da função.

---

Quando o elemento da pilha `fatorial(1)` retorna o valor 1 para o elemento de baixo, ele é excluído da pilha.  
Quando o elemento da pilha `fatorial(2)` retorna o valor 2 para o elemento de baixo, ele é excluído da pilha.  
Quando o elemento da pilha `fatorial(3)` retorna o valor 6 para o elemento de baixo, ele é excluído da pilha.  
Quando o elemento da pilha `fatorial(4)` retorna o valor 24 para o elemento de baixo, ele é excluído da pilha.  
Quando o elemento da pilha `fatorial(5)` retorna o valor 120 para o elemento de baixo, ele é excluído da pilha.

```
fatorial(1) -> retorno 1 (foi excluída)
fatorial(2) -> retorno 2 * 1 (foi excluída)
fatorial(3) -> retorno 3 * 2 (foi excluída)
fatorial(4) -> retorno 4 * 6 (foi excluída)
fatorial(5) -> retorno 5 * 24 (foi excluída)
```

Sem elementos na pilha de execução, a execução é encerrada.

---

Toda vez que se tiver um problema em que seja possível identificar um **caso base claro** e um **caso recursivo**, é possível utilizar **recursão**.

Mas devemos tomar alguns cuidados: a recursão, como vimos, nos gera uma **pilha de execução** e, para algoritmos com muitos passos, podemos causar um *stack overflow* pela própria limitação da tecnologia.  
Então, para problemas com milhares ou milhões de iterações, **opte por soluções iterativas** como ciclos.

---

### Regra de ouro

> “Use recursão quando ela simplifica a forma de pensar o problema,  
> e não apenas porque é possível implementá-la.”
