## Exercícios de tempo de execução

Forneça o tempo de execução para cada um dos casos a seguir em termos da notação Big O.

1) Você tem um nome e deseja encontrar o número de telefone para esse nome em uma agenda telefônica.

R: O(log n), pois podemos começar a busca utilizando a estratégia da busca binária, visto que uma agenda telefônica é ordenada por nome.

2) Você tem um número de telefone e deseja encontrar o dono dele em uma agenda telefônica.

R: O(n) visto que devemos realizar uma busca sem os dados estarem ordenados pelo critério, que no caso é o número de telefone.

3) Você quer ler o número de cada pessoa da agenda telefônica

R: O(n).

4) Você quer ler os números apenas dos nomes que começam A.

R: Acredito que pode ser O(n) também, por conta que podemos ter uma agenda telefônica com a maioria dos nomes com a letra A, mas a resposta será explicada em próximos capítulos do livro.