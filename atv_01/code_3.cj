# Código 3: Estruturas de Controle, Comentários, e Procedimentos Primitivos

-> numero fatorial(numero n)
inicio
    numero resultado.
    resultado := 1.
    
    # Calculando fatorial
    enquanto (n > 0) faça
    inicio
        resultado := resultado * n.
        n := n - 1.
    fim
    
    retorne resultado.
fim

inicio
    numero n, fat.
    vetor caractere[4] palavra. # Ajustado para 4 pois "Caju" tem 4 caracteres.

    # Lendo valores
    ler(n).

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
