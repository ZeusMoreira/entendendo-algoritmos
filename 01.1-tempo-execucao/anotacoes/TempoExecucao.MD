## Tempo de execução

Quando possuimos um algoritmo sempre devemos estar atentos ao seu **tempo de execução**, essa análise é sempre feita baseando-se em funções matemáticas que demonstram a **escalabilidade de algoritmos** para pouco e para muitos dados.

Estudamos **pesquisa binária** e **pesquisa simples**, vimos que a pesquisa simples possui tempo de execução em seu pior caso de **n**, já a pesquisa binária em contrapartida o tempo de execução em seu pior caso é **log n** e isso faz total diferença quando olhamos para grandes dados.

É importante salientar que o tempo de execução informado não diz necessáriamente sobre segundos, minutos, dias e etc, diz respeito mais sobre a **velocidade em que o algoritmo cresce**, isto é, processar quantidade x de dados.

A notação que usamos para falarmos de tempo de execução é a famosa **BIG O**, onde é analisado essencialmente o **pior caso possível** de um algoritmo, seja a pesquisa binária com o pior caso sendo quando o elemento não está presente no array ou pesquisa simples onde o pior caso é quando o elemento está no final do array. Analisando esses 2 algoritmos citados podemos dizer que pesquisa binária tem complexidade **O(log n)** e pesquisa simples com **O(n)**. A notação **O(...)** nos ajuda a comparar 2 algoritmos e analisar seu comportamento para poucos e muitos dados.

Outros exemplos: algoritmo **quicksort** com complexidade **O(n * log n)**, algoritmo **selection sort** com complexidade **O(n^2)** e algoritmo do **caixeiro-viajante** com complexidade de incríveis **O(n!)**.

Todas essas funções dentro do **O(...)** funcionam exatamente como na matemática, uma função logaritmica tem uma taxa de crescimento **MUITO inferior** a uma função fatorial, visto que o número de operações aumenta muito drásticamente para relativamente poucos dados numa fatorial e para logaritmica chega a um ponto que fica praticamente constante o aumento de número de operações, para **128 elementos** são necessários **7 passos** e para **256** são **8 passos**. Agora só de analisar **5 elementos** com **120 passos** e **7 elementos** para **5040 passos** do assombroso **O(n!)** percebemos a importância da análise de algoritmo para resolução de problemas.

Dito isso, a rapidez de um algoritmo não é medida em segundos e sim em **crescimento do número de operações**.

---

## Caso clássico de O(n!): Caixeiro-Viajante

Dadas **5 cidades** um caixeiro-viajante deve percorrer as 5 cidades de forma que ele faça o menor caminho possível, deseja o caminho ótimo. Ao pensar nessa situação percebemos que é um problema de permutação visto que temos que fazer **5!** combinações para somente depois descobrir qual a melhor combinação e definir a viagem ideal para o caixeiro-viajante, realizando o **5!** chegamos em **120 combinações possíveis**, até que é relativamente aceitável, porém se mudarmos para **7!** já temos **5040 combinações analisadas** e se chegarmos em **100 cidades** temos **100!** que é um número incompreensível de tamanha grandeza.

Mas o que isso quer dizer? Tem vezes que não existe um algoritmo melhor, muitos problemas possuem complexidades em que nossas soluções simplesmente não suprem o cenário dado, então algoritmos **O(n!)** podem ocorrer e nós não termos como escapar.
