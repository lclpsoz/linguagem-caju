# Código 3: Estruturas de Controle, Comentários, e Procedimentos Primitivos

numero fatorial(numero n)
inicio
    numero resultado.
    resultado := 1.
    
    # Calculando fatorial
    enquanto (n > 0)
    inicio
        resultado := resultado * n.
        n := n - 1.
    fim
    
    retorne resultado.
fim

booleano funcao_xor(booleano a | booleano b)
inicio
    se a = b retorne falso.
    senao retorne verdadeiro.
fim


booleano condicional(booleano a | booleano b)
inicio
    se (a e b) retorne verdadeiro.
    se (a e (nao b)) retorne falso.
    se ((nao a) e b) retorne verdadeiro.
    se (nao a e (nao b)) retorne verdadeiro.
fim

-> vazio main()
inicio
    numero n, fat.
    booleano testar.
    vetor caractere[4] palavra. # Ajustado para 4 pois "Caju" tem 4 caracteres.

    testar := condicional(verdadeiro | verdadeiro).

    # Lendo valores
    se (testar)
        ler(n).
    
    se (nao (n >= 0))
        exibir('X').
    senao
        # Calculando fatorial
        fat := fatorial(n).
        exibir(fat).

        # Definindo e exibindo uma palavra
        palavra[0] := 'C'.
        palavra[1] := 'a'.
        palavra[2] := 'j'.
        palavra[3] := 'u'.
        exibir(palavra).
fim
