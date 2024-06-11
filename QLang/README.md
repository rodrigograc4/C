# Tema **QLang**, grupo **qlang-q03**
-----

## Constituição dos grupos e participação individual global

| NMec | Nome | Participação |
|:---:|:---|:---:|
| 113475 | CAROLINA SOFIA PEREIRA DA SILVA | 16.(6)% |
| 108011 | FÁBIO ANTÓNIO TEIXEIRA MATIAS | 16.(6)% |
| 108193 | MATILDE MOITAL PORTUGAL SAMPAIO TEIXEIRA | 16.(6)% |
| 108481 | MIGUEL OLIVEIRA PINTO | 16.(6)% |
| 107634 | RODRIGO MARTINS GRAÇA | 16.(6)%|
| 107323 | VASCO MIGUEL FERNANDES FARIA | 16.(6)% |

## Relatório

### Introdução

O objetivo deste projeto era criar um questionario, a partir de duas linguagens diferentes, com o objetivo de gerar um programa que permitisse a geração de testes e de respostas a estes. Por forma a fazer isto acontecer criamos duas gramáticas diferentes uma com o objetivo de gerar os testes e outra com o objetivo de gerar as respostas. No seguimento deste readme iram ser brevemente explicados estas duas linguagens.

### Geração Quizzes
Para implementar a geração de quizes incorremos neste worflow: criação de uma gramática que conseguisse compilar os ficheiros apresentados e subcategorizar cada tipo de pergunta.

#### Gramática
Na parte da gramática esta foi feita para cumprir os requisitos minimos. Nesta definimos os diferentes tipos de questões, expressões e tipos que poderiam ser identificadas nos ficheiros .

#### Análise Semântica
Relativamente à análise semântica esta foi realizada para garantir que o código fonte é analisado semanticamente.

#### Classes Java
As classes em java foram criadas para modelar a gramática para executar as diferentes ações, formando diferentes tipos de questões. 

#### String Template
O string template foi criado para modelar os comportamentos das diferentes classes para a gramática.

#### Visitors
Relativamente aos visitors, eles visitam as diferentes partes da gramática.

### Geração Respostas
Esta trata-se da gramática secundária, que serve para interpretar as respostas dadas.

#### Gramática
Esta serve para cumprir os requisitos minimos. Esta declara formatos de escrita, tipos de dados e loops, para código escritp nas respostas.

#### Análise Semântica
Relativamente à análise semântica esta foi realizada. Esta serviu para detetar erros semânticos nesta.

#### Visitors
Relativamente aos visitors, estes foram implementados para visitar cada instrução da gramática secundária apresentada.

## Contribuições

- Descritas na tabela acima.
