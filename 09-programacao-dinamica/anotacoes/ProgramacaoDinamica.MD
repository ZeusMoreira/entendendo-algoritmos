### Problema da mochila e programação dinâmica

Quanto temos o problema da mochila, podemos imaginar o exemplo do capitulo anterior onde com 3 itens deveriamos analisar qual a melhor combinação possível que maximizasse o lucro. O problema da mochila para termos a solução ótima temos tempo de execução de O(2^n), pois precisamos testar todas as combinações possível para determinar o melhor cenário. O grande problema disso é que para o valor de n muito grande como 32 itens temos 4 bilhões de conjuntos solução possíveis para analisar. Qual seria nossa alternativa então sem ser de forma gulosa ?

### Programação dinâmica

Usando o problema da mochila vamos exemplificar o algoritmo da programação dinâmica, para isso a idéia é dividir o problema para submochilas e para isso analisaremos os itens disponíveis e o custo de cada um para montar uma tabela que vai nos orientar na tomada da melhor decisão. Tinhamos essa configuração do problema da mochila no capitulo anterior:

item 1 - violão - 1Kg - R$ 1500<br>
item 2 - rádio - 4Kg - R$ 3000<br>
item 3 - notebook - 3Kg - R$ 2000

Montaremos então a tabela olhando para o primeiro item e para o peso máximo do item mais pesado ficando assim:

linhas: 3 (partindo do violão até o notebook)<br>
colunas: 4 (partindo do 1Kg até o 4kg com número inteiros)

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | - | - | - | - |
| Rádio | - | - | - | - |
| Notebook | - | - | - | - |


**Violão**

Primeiro olharemos para a primeira linha como só existisse o violão disponível para colocar na mochila, olhando para a primeira coluna a pergunta é: será que o violão caberia na mochila de 1Kg ? Olhando para a capacidade da mochila e para o peso do violão afirmamos que **SIM** e colocamos o valor da mochila na célula, então a tabela fica assim:

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | - | - | - |
| Rádio | - | - | - | - |
| Notebook | - | - | - | - |

Faremos o mesmo para as próximas colunas da linha do violão, como o violão pesa 1Kg obviamente caberá nas mochilas de 2,3 e 4Kg.

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | - | - | - | - |
| Notebook | - | - | - | - |

Assim encerramos a linha do violão. Partiremos então para a análise do rádio.

---

**Rádio**

Nesse momento apenas 2 itens estão visíveis: Rádio e Violão, logo não conseguimos fazer comparações com o Notebook ainda.

Como o rádio pesa 4Kg então não caberá nas mochilas de 1,2 e 3Kg, apenas o violão. Logo o valor obtido pelo violão preencherá as 3 primeiras colunas do rádio.

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | - |
| Notebook | - | - | - | - |

Ao chegarmos na análise da mochila de 4Kg percebemos que podemos roubar R$ 3000 com 4Kg ao invés do violão de R$ 1500 e como não é possível roubar os 2 itens visto que o peso do violão + o peso do rádio extrapolam a capacidade de 4Kg, roubaremos então apenas o rádio pois é o que maximiza o nosso roubo. Ficando assim a tabela:

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | - | - | - | - |

---

**Notebook**

Nesse momento todos os itens estão visíveis.

Como o notebook pesa 3Kg, então não caberá nas mochilas de 1 e 2Kg. Logo o valor obtido pelo violão preencherá as 2 primeiras colunas do notebook.

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | - | - |

Ao chegarmos na análise da mochila de 3Kg percebemos que podemos roubar R$ 2000 com 3Kg ao invés do violão de R$ 1500 e como não é possível roubar os 2 itens visto que o peso do violão + o peso do notebook extrapolam a capacidade de 3Kg, roubaremos então apenas o notebook, pois é o que maximiza o nosso roubo. Ficando assim a tabela:

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | R$ 2000 | - |

Nessa ultima análise da mochila de 4Kg temos um dilema, o valor do notebook é menor que o do rádio então não podemos substituir os R$ 3000, mas como o notebook pesa menos que 4Kg **PRECISAMOS** analisar se da para colocar mais algum item na mochila de 4Kg junto com o notebook, visto que o notebook ocupa 3Kg e está sobrando 1Kg livre, então precisamos ver qual o item de 1Kg que tem o maior custo, para isso devemos analisar o valor da **linha anterior** na **coluna de valor = numero da coluna atual - o peso que restou na mochila**,  para vermos qual o maior item de 1Kg possível que no caso é o violão. Com isso tiramos a conclusão que é possível colocar o notebook + o violão e comparar o valor da soma de ambos com os R$ 3000 do rádio, como R$ 3500 > R$ 3000, então colocaremos R$ 3500 na ultima célula, ficando assim:

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | R$ 2000 | R$ 3500 |

Assim conseguimos encontrar a solução ótima.

---

E se adicionarmos um novo item, vamos precisar calcular tudo de novo ? Certamente que não visto que já temos uma análise feita. Vamos supor que tem um novo item de 1Kg que é o Iphone que tem o valor de R$ 2000, vamos ver o impacto disso prosseguindo com a tabela.

---

**Iphone**

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | R$ 2000 | R$ 3500 |
| Iphone | - | - | - | - |

Como o iphone cabe na mochila de 1Kg ficaria assim, podemos substituir pelo violão visto que o ganho será maior:

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | R$ 2000 | R$ 3500 |
| Iphone | R$ 2000 | - | - | - |

Agora para 2Kg poderemos somar o valor do violão e do iphone, já que a soma do peso deles é 2Kg, ficando assim:

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | R$ 2000 | R$ 3500 |
| Iphone | R$ 2000 | R$ 3500 | - | - |

Agora para 3Kg, como o iphone + violão é maior que o preço do notebook, podemos manter os R$ 3500, visto que não tem nenhum item a mais para colocar no espaço sobrando, então a mochila irá sobrar 1Kg, mas carregará mais valor do que se eu enche-la com o notebook, ficando assim:

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | R$ 2000 | R$ 3500 |
| Iphone | R$ 2000 | R$ 3500 | R$ 3500 | - |

Nesse último caso no caso anterior tinhamos que R$ 3500 maximizava a nossa solução, porém com a chegada do iphone no caso da sacola de 4Kg temos o seguinte embate R$ 3500 (notebook e violao com 4kg somados) vs R$ 2000 (iphone de 1Kg) + R$ X. Esse X é a combinação mais cara de 3Kg, que no caso é o notebook de R$ 2000. Ficando assim o embate:

R$ 3500 com 4Kg vs R$ 2000 do iphone de 1Kg + R$ 2000 do notebook de 3  Kg. Então R$ 3500 vs R$ 4000, temos então uma nova solução ótima, ficando assim a tabela:

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | R$ 2000 | R$ 3500 |
| Iphone | R$ 2000 | R$ 3500 | R$ 3500 | R$ 4000 |

Então a programação dinâmica vai retornar pra gente sempre um dos valores ótimos. 

---

Obs. 1: Quando invertemos a ordem dos itens, ou escolhermos qualquer ordem que seja a solução não muda dará certo de qualquer maneira.<br>
Obs. 2: Estavamos tratando com valores de peso inteiro no exemplo, porém caso apareça um item de 0,5Kg será preciso refazer a tabela. <br>
Obs. 3: Não é possível fracionar itens na programação dinâmica, ou você pega tudo ou não pega nada, não é possível abrir um pacote de arroz e pegar uma pequena quantia por exemplo.
Obs. 4: Não é possível trabalhar com interdependencia na programação dinamica, então se temos 3 itens com o mesmo custo, porém quando você fizer um e o custo dos demais diminuir por conta do primeiro item feito a programação dinâmica não consegue lidar muito bem. Se o custo para viajarmos para ver a torre eiffel leve 1 dia e meio e para ver o louvre também levar 1 dia e meio, só que o tempo para você chegar em paris for de meio dia, logo o custo para ver a torre eiffel será 1 dia e meio por conta da viajem, só que para ver o louvre não será mais 1 dia e meio e sim meio dia, visto que você já está em Paris devido a ida a torre eiffel.
Obs. 5: A capacidade da mochila não precisa estar 100% cheia para ser a melhor solução.

---

