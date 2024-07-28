# Código 1: Declarações, Atribuições, e Vetores

inicio
    numero a, b, c.
    vetor numero[5] v.
    caractere ch.
    booleano flag.

    a := 10.
    b := 20.
    c := a + b.
    ch := 'z'.
    flag := verdadeiro.

    # Inicializando vetor
    para (numero i := 0; i < 5; i := i + 1)
        v[i] := i * 2.

    # Exibindo valores
    exibir(a, b, c, ch, flag).
    para (numero i := 0; i < 5; i := i + 1)
        exibir(v[i]).
fim
