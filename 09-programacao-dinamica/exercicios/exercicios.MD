### Exercicios

1) Imagine que você consegue roubar outro item: um MP3 player. Ele pesa 1 Kg e vale R$ 1000. Você deveria rouba-lo ?

R: Usando o ultimo estado da tabela das anotações, temos:

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | R$ 2000 | R$ 3500 |
| Iphone | R$ 2000 | R$ 3500 | R$ 3500 | R$ 4000 |


Começando para o MP3 Player, fica:

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | R$ 2000 | R$ 3500 |
| Iphone | R$ 2000 | R$ 3500 | R$ 3500 | R$ 4000 |
| MP3 Player | R$ - | R$ - | R$ - | R$ - |

Como o MP3 Player pesa 1Kg mas o beneficio do roubo é apenas 1000 e o valor anterior para 1Kg era 2000, replicaremos o 2000 do iphone

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | R$ 2000 | R$ 3500 |
| Iphone | R$ 2000 | R$ 3500 | R$ 3500 | R$ 4000 |
| MP3 Player | R$ 2000 | R$ - | R$ - | R$ - |

Na segunda coluna tinhamos 3500 na linha do iphone, se fizermos a lógica de comparar 3500 com o valor do MP3 Player + o valor do maior item de 1kg (que é o iphone) veremos que a comparação ficará: 3500 vs 3000, logo mantemos o 3500

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | R$ 2000 | R$ 3500 |
| Iphone | R$ 2000 | R$ 3500 | R$ 3500 | R$ 4000 |
| MP3 Player | R$ 2000 | R$ 3500 | R$ - | R$ - |

Na terceira coluna tinhamos 3500 na linha do iphone, se fizermos a lógica de comparar 3500 com o valor do MP3 Player + o valor do maior combinação de itens de 2kg veremos que a comparação ficará: 3500 vs 4500, logo ficará:

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | R$ 2000 | R$ 3500 |
| Iphone | R$ 2000 | R$ 3500 | R$ 3500 | R$ 4000 |
| MP3 Player | R$ 2000 | R$ 3500 | R$ 4500 | R$ - |

Na quarta coluna tinhamos 4000 na linha do iphone, se fizermos a lógica de comparar 4000 com o valor do MP3 Player + o valor do maior combinação de itens de 3kg veremos que a comparação ficará: 3500 vs 4500, logo ficará:

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: |
| Violão | R$ 1500 | R$ 1500 | R$ 1500 | R$ 1500 |
| Rádio | R$ 1500 | R$ 1500 | R$ 1500 | R$ 3000 |
| Notebook | R$ 1500 | R$ 1500 | R$ 2000 | R$ 3500 |
| Iphone | R$ 2000 | R$ 3500 | R$ 3500 | R$ 4000 |
| MP3 Player | R$ 2000 | R$ 3500 | R$ 4500 | R$ 4500 |

Então compensa sim roubar o MP3 Player.


2) Suponha que você esteja indo acampar e que sua mochila tenha capacidade para 6 quilos. Sendo assim, você pode escolher entre os itens abaixo para levar. Cada item tem um valor, e quanto mais alto este valor, mais importante o item é.

* Água, 3 kg, 10
* Livro, 1 kg, 3
* Comida, 2 kg, 9
* Casaco, 2 kg, 5
* Câmera, 1 kg, 6

Qual é o conjunto de itens ideal que deve ser levado para o acampamento ?   


Resposta:

|  | **1Kg** | **2Kg** | **3Kg** | **4Kg** | **5Kg** | **6Kg** | 
|:-----------:|:---------:|:-------:| :---------: | :---------: | :---------: | :---------: |
| Livro  | 3 L | 3 L | 3 L | 3 L | 3 L | 3 L |
| Câmera | 6 Cam | 9 Cam + L | 9 Cam + L | 9 Cam + L | 9 Cam + L | 9 Cam + L |
| Comida | 6 Cam | 9 Cam + L | 15 Com + Cam | 18 Com + Cam + L | 18 Com + Cam + L | 18 Com + Cam + L |
| Casaco | 6 Cam | 9 Cam + L | 15 Com + Cam | 18 Com + Cam + L | 20 Com + Cam + Cas | 23 Com + Cam + L + Cas |
| Água   | 6 Cam | 9 Cam + L | 15 Com + Cam | 18 Com + Cam + L | 20 Com + Cam + Cas | 25 Com + Cam + Agua |


Logo a melhor escolha seria: Agua, Comida e Camera.