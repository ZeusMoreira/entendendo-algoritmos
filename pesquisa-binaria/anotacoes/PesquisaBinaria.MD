## Busca binária

A busca binária é um método de busca que nos permite buscar um elemento de um array com um tempo de execução máximo de log de n na base 2

Ao invés de fazer como a busca simples faz: Buscar os elementos no array de forma 1 a 1, gerando um tempo de execução linear, optamos por realizar uma busca como se fosse uma agenda telefonica ou dicionário, aqui está a lógica da busca binária:

1. Começamos definindo variáveis **max** e **min** como o ultimo elemento do array e o primeiro, respectivamente.  

2. Começamos a análise pelo índice **i** no meio do array (`n/2`):  
   - 2.1) Caso o elemento desejado esteja exatamente nesse índice **i** retornamos.  
   - 2.2) Caso o elemento desejado esteja em uma posição **MAIOR** definimos o **min** para `i + 1` (descartando o **i**, pois já verificamos que não está naquela posição).  
   - 2.3) Caso o elemento desejado esteja em um posição **MENOR** definimos o **max** para `i - 1` (descartando o **i**, pois já verificamos que não está naquela posição).  
   - 2.4) Com isso teremos o **min** e **max** atualizados, desconsiderando a metade do array considerado na iteração anterior. Então setamos o `i = (max + min) / 2` para fazer novamente a análise na metade relevante do array.  

---

**Obs:** A busca binária funciona apenas para array ordenado.