package caju.semantics;

import caju.analysis.DepthFirstAdapter;
import caju.node.*;

public class SemanticAnalyzer extends DepthFirstAdapter {
    private SymbolTable symbolTable;

    public SemanticAnalyzer() {
        this.symbolTable = new SymbolTable();
    }

    @Override
    public void inStart(Start node) {
        System.out.println("-------------------------------------------------");
        System.out.println("Iniciando análise semântica...");
    }

    @Override
    public void outStart(Start node) {
        System.out.println("-------------------------------------------------");
        System.out.println("Fim da análise semântica");
        System.out.println("-------------------------------------------------");

    }

     // Ao entrar em um programa
    @Override
    public void inAAPrograma(AAPrograma node) {
        System.out.println("Iniciando análise semântica do programa");
    }

    // Ao sair de um programa
    @Override
    public void outAAPrograma(AAPrograma node) {
        System.out.println("Finalizando análise semântica do programa");
    }

    // Ao entrar em um bloco de código (abre novo escopo)
    @Override
    public void inABlocoAComando(ABlocoAComando node) {
        System.out.println("Abrindo escopo de bloco");
        symbolTable.openScope();
    }

    // Ao sair de um bloco de código (fecha o escopo)
    @Override
    public void outABlocoAComando(ABlocoAComando node) {
        System.out.println("Fechando escopo de bloco");
        symbolTable.closeScope();
    }

    // Caso de uma declaração de variável
    @Override
    public void caseAVariavelADeclaracao(AVariavelADeclaracao node) {
        // Obtém o nome da variável a partir da lista de nomes
        if (!node.getNomes().isEmpty()) {
            String varName = node.getNomes().getFirst().toString(); // Nome da variável
            String varType = node.getATipo().toString();  // Tipo da variável
    
            // Verifica se a variável já foi declarada no escopo atual
            if (!symbolTable.insertSymbol(varName, new Symbol(varName, Symbol.Type.VARIAVEL, varType))) {
                System.err.println("Erro: Variável " + varName + " já foi declarada no escopo atual.");
            } else {
                System.out.println("Variável " + varName + " declarada com sucesso.");
            }
        } else {
            System.err.println("Erro: Declaração de variável sem nome.");
        }
    }
    

    // Caso de uma declaração de função
    @Override
    public void caseAFuncaoADeclaracao(AFuncaoADeclaracao node) {
        String functionName = node.getNome().getText();
        String returnType = node.getTipoRetorno().toString();
    
        // Verifica se a função já foi declarada no escopo atual
        if (!symbolTable.insertSymbol(functionName, new Symbol(functionName, Symbol.Type.FUNCAO, returnType))) {
            System.err.println("Erro: Função " + functionName + " já foi declarada.");
        } else {
            System.out.println("Função " + functionName + " declarada com sucesso.");
        }
    
        // Abre um novo escopo para os parâmetros e o corpo da função
        symbolTable.openScope();
    
        // Insere os parâmetros na tabela de símbolos
        for (PAParametro parametro : node.getParametros()) {
            // Usa o método getATipo() para pegar o tipo do parâmetro
            String paramName = ((AAParametro) parametro).getNome().getText();
            String paramType = ((AAParametro) parametro).getATipo().toString();
    
            if (!symbolTable.insertSymbol(paramName, new Symbol(paramName, Symbol.Type.VARIAVEL, paramType))) {
                System.err.println("Erro: Parâmetro " + paramName + " já foi declarado.");
            } else {
                System.out.println("Parâmetro " + paramName + " declarado com sucesso.");
            }
        }
    
        // Processa o bloco da função
        node.getABloco().apply(this);
    
        // Fecha o escopo da função
        symbolTable.closeScope();
    }
    
}
