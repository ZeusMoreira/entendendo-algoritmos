### Dividir para Conquistar

A principal ideia de um **algoritmo de dividir para conquistar** é utilizar um **caso base** e um **caso indutivo**, geralmente utilizando lógica de **recursão**.

Se quisermos utilizar um algoritmo para conseguir dividir um **retângulo** em um número *x* de **quadrados iguais** de forma que o quadrado tenha o **maior tamanho possível**, podemos utilizar uma estratégia de **dividir para conquistar**.

---

O **caso base** seria os lados serem **múltiplos um do outro**, já que seria apenas dividir o lado maior pelo lado menor e teríamos o número de quadrados com a medida do menor lado, tendo então o maior número de quadrados iguais e com a maior dimensão possível.

O **caso indutivo** seria pautado em descobrirmos **como chegar no caso base** dito acima.  
Quando temos um lado que **não é múltiplo do outro**, temos um **resto diferente de 0** ao tentar dividir esses dois números.  
No nosso caso, esse resto seria o **espaço restante do terreno** que não entrou quando tentamos dividir.  

Por exemplo, em um retângulo **1680 × 640** conseguimos ter **2 quadrados de tamanho 640 × 640**, mas sobraria um espaço de **400 × 640**.  
Isso indica que um quadrado de dimensões 640 não supre nossas exigências, então precisaremos ver o **maior quadrado possível** que caberia dentro do **400 × 640**.  

Nesse caso, o novo valor a ser analisado é o **400 × 640** ao invés do **1680 × 640**, que é o valor original.  
O **passo indutivo** então é esse: **repassar o valor do resto e da menor dimensão até que o resto seja 0** e então as duas dimensões sejam múltiplas, chegando ao nosso caso base.

---

A parte de **"dividir para conquistar"** entra em ação no momento em que realizamos o **passo indutivo com o resto da divisão**.
