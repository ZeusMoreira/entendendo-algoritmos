### Exercícios

1) Quais destas funções hash são consistentes ?

1.1) f(x) = 1

R: Consistente, para cada string ele retorna o mesmo índice.

1.2) f(x) = rand()

R: Não é consistente, caso repetirmos a mesma string tera valores diferentes de índices.

1.3) f(x) = proximo_espaco_vazio()

R: Não é consistente, visto que se repetir a mesma string vai ter valores diferentes de índices.

1.4) f(x) = len(x)

R: Consistente, visto que retorna o tamanho da string como índice, dessa forma será sempre o mesmo índice, pois o tamanho da mesma string não muda.

2) É importante que funções hash tenham uma boa distribuição. Dessa forma, elas ficam com o mapeamento mais amplo possivel. O pior caso é uma função hash que mapeia todos os itens para o mesmo espaço da tabela hash.
Suponha que você tenha estas quatro funções hash que operam com strings:

a) Retorne "1" para qualquer entrada.

b) Use o comprimento da string como o indice.

c) Use o primeiro caractere da string corno indice. Assim, todas as strings que iniciam com a letra a são hasheadas juntas e assim por diante.

d) Mapeie cada letra para um número primo: a = 2, b = 3, c = 5, d = 7, e = 11, e assim por diante. Para uma string, a função hash é a soma de todos os caracteres-módulo conforme o tamanho da hash. Se o tamanho de sua hash for 10, por exemplo, e a string for "bag", o índice será (3 + 2 + 17) % 10 = 22% 10 = 2.

Para cada um destes exemplos, qual função hash fornecerá uma boa distribuição? Considere que o tamanho da tabela hash tenha dez.
espaços.

R: para o item a não é uma boa idéia, apesar de consistente ela vai acabar aglomerando todos as strings inseridas.
   para o item b pode haver muitas strings com o mesmo tamanho, isso faz com que aglomere e nos forneça o pior caso.
   para o item c pode haver muitas string que começam com aquele começo de string.
   para o item d me parece uma alternativa mais equilibrada, seria uma boa escolha, pois da idéia de distribuir os elementos no array.