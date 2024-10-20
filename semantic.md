# Checklist de Regras Semânticas - Linguagem Caju

## 1. Declaração de Variáveis e Vetores
- [ ] Toda variável foi declarada antes de ser utilizada?
- [ ] Tipos das variáveis são compatíveis com os valores atribuídos?
- [ ] Vetores foram inicializados com o tamanho correto?
- [ ] Acessos aos vetores estão dentro dos limites do tamanho definido?

## 2. Compatibilidade de Tipos
- [ ] Operações aritméticas (`+`, `-`, `*`, `/`) são realizadas apenas entre variáveis do tipo `numero`?
- [ ] Operações lógicas (`e`, `ou`, `nao`) são realizadas apenas entre variáveis do tipo `booleano`?
- [ ] Operações relacionais (`<`, `>`, `<=`, `>=`, `=`) são realizadas entre tipos compatíveis?
- [ ] Expressões em atribuições têm tipos compatíveis com as variáveis à esquerda?
- [ ] Tipos em retornos de funções e em parâmetros são compatíveis?

## 3. Estruturas de Controle
- [ ] A expressão condicional no `se/senao` é do tipo `booleano`?
- [ ] A condição no loop `enquanto` é do tipo `booleano`?
- [ ] O loop `enquanto` não é infinito (se verificável estaticamente)?
- [ ] Na estrutura `para`, os tipos das variáveis de inicialização, condição e incremento são compatíveis?
- [ ] No `para cada`, o tipo da variável iterada é compatível com os elementos do vetor?

## 4. Funções e Retorno
- [ ] Funções possuem um tipo de retorno definido?
- [ ] Funções com retorno `vazio` não possuem comando `retorne` com valor?
- [ ] O valor retornado pelas funções é compatível com o tipo declarado?
- [ ] O número de parâmetros na chamada de função coincide com a definição?
- [ ] Os tipos dos parâmetros fornecidos nas chamadas de funções são compatíveis?

## 5. Escopo
- [ ] Variáveis locais são acessadas apenas dentro de seus escopos de declaração?
- [ ] Variáveis globais não são re-declaradas nos escopos locais?
- [ ] Blocos (`inicio` e `fim`) delimitam corretamente novos escopos?

## 6. Atribuição
- [ ] O lado esquerdo de uma atribuição (`:=`) é uma variável ou posição válida de vetor?
- [ ] O valor atribuído é compatível com o tipo da variável?

## 7. Entrada e Saída
- [ ] O procedimento `exibir` aceita qualquer tipo de variável?
- [ ] O procedimento `ler` recebe apenas variáveis mutáveis?
- [ ] O valor lido é compatível com o tipo da variável destino?

## 8. Expressões
- [ ] Expressões têm tipos coerentes nas operações realizadas?
- [ ] Uso de parênteses altera corretamente a precedência das operações?
- [ ] Expressões em condições (`se/senao`, `enquanto`) são do tipo `booleano`?

## 9. Vetores
- [ ] Índices usados para acessar vetores são do tipo `numero`?
- [ ] Não há tentativas de acessar posições fora do intervalo válido dos vetores?
- [ ] Vetores multidimensionais têm tipos consistentes em todas as dimensões?

## 10. Operadores
- [ ] **Operadores aritméticos** (`+`, `-`, `*`, `/`) são aplicados apenas a variáveis do tipo `numero`?
- [ ] **Operadores relacionais** (`<`, `>`, `<=`, `>=`, `=`) são aplicados a tipos compatíveis?
- [ ] **Operadores booleanos** (`nao`, `e`, `ou`) são aplicados apenas a variáveis do tipo `booleano`?

## 11. Inicialização de Variáveis
- [ ] Nenhuma variável foi utilizada antes de ser inicializada?
- [ ] Vetores foram inicializados antes de serem acessados?

## 12. Parâmetros de Função
- [ ] O número de parâmetros na chamada de função coincide com a definição?
- [ ] Os tipos dos parâmetros fornecidos nas chamadas de funções são compatíveis com a declaração?

## 13. Retorno de Função
- [ ] Funções não `vazias` possuem pelo menos um comando `retorne`?
- [ ] O valor retornado é compatível com o tipo declarado da função?

