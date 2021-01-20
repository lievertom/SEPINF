# SEPINF

Esse repositório tem como objetivo guardar a solução para participação do processo seletivo de estágio no Serviço de Perícias em Informática (SEPINF) do Instituto Nacional de Criminalística (INC).

## Processo Seletivo

A primeira etapa consiste na solução de um problema de programação em: [https://olimpiada.ic.unicamp.br/pratique/](https://olimpiada.ic.unicamp.br/pratique/).

### Problema

Foi escolhido um problema de nível sênior: [Xadrez Aleatório](https://olimpiada.ic.unicamp.br/pratique/pu/2019/f3/xadrez/).

Trata-se de um problema de análise combinatória. Apesar de não ser um problema de dificuldade muito elevada, podemos soluciona-lo usando diferentes técnicas com diferentes complexidades.

Xadrez Aleatório de Fischer, ou Xadrez 960, é uma variante do jogo de Xadrez que usa exatamente as mesmas regras com uma única exceção, a posição inicial das peças é sorteada antes do jogo. As peças da primeira linha do tabuleiro podem estar em qualquer posição desde que respeitem duas restrições: o rei deve estar entre as duas torres; e os dois bispos devem estar em casas de cores opostas. Como você já deve ter desconfiado, o número de posições iniciais válidas nessa variante do Xadrez é 960.

Neste problema queremos contar o número de posições iniciais válidas numa outra variante, bem mais simples. A dimensão do tabuleiro não é mais fixa. Para qualquer dimensão, a primeira linha do tabuleiro vai conter apenas três tipos de peças: rei, torre e peão. Haverá sempre exatamente um rei e no máximo duas torres. O número de peões será a dimensão menos a soma do número das demais peças. Se o número de torres for dois, então o rei deve estar entre as duas torres. A figura abaixo mostra uma posição inicial válida para N=8.

#### Entrada

A entrada consiste de apenas uma linha contendo dois inteiros, N e T, representando, respectivamente, a dimensão do tabuleiro e o número de torres.

#### Saída

Seu programa deve imprimir uma linha contendo um inteiro indicando o número de posições iniciais válidas.

#### Restrições

2 ≤ N ≤ 1000
0 ≤ T ≤ 2

#### Informações sobre a pontuação

- Para um conjunto de casos de testes valendo 10 pontos, T=0.
- Para um conjunto de casos de testes valendo outros 20 pontos, T=1.
- Para um conjunto de casos de testes valendo outros 20 pontos, N=4.

#### Sobre a Solução

O problema foi dividido em três casos:

- nenhuma torre
- uma torre
- duas torres

Para o caso de duas torres, foram usadas três estratégias: uma quadrática, uma linear e outra O(1). A primeira estratégia atende às restrições do problema, entretando foram utilizadas as três estratégias para demonstrar que as vezes podemos melhorar os algoritmos para uma melhor interação do usuário ou maior escalabilidade.

Basicamente a solução mais eficiente é dada em apenas três linhas, o que mostra que nem sempre o código mais simples é o mais fácil de ser desenvolvido, logo que para alcançar essa solução é necessário conhecimento em outras áreas, além da programação, para chegar nas formulas fechadas que garantem melhor performance.

```java
    if (t == 0) resposta = n;
    else if (t == 1) resposta = n*(n-1);
    else resposta = n*(n-1)*(n-2)/6;
```

Para mais detalhes a respeito da implementação do código acesse a [solução](solucao.java).

## Autor

[Lieverton Santos Silva](https://lievertom.github.io/)
