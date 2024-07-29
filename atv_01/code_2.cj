#Código 2: Estruturas de Controle e Funções
-> numero soma(numero x, numero y)
inicio
    retorne x + y.
fim

-> vazio exibir_vetor(vetor numero[5] v)
inicio
    para cada (numero elemento : v)
        exibir(elemento).
fim

inicio
    numero resultado.
    vetor numero[5] v.

    resultado := soma(5, 7).
    exibir(resultado).

    # Inicializando vetor
    para (numero i := 4; i >= 0; i := i + 1)
        v[i] := i * 3.

    # Exibindo vetor
    exibir_vetor(v).
fim
