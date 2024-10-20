package caju.semantics;

import java.util.Stack;

import caju.analysis.DepthFirstAdapter;
import caju.node.ABlocoAComando;
import caju.node.ABooleanoATipo;
import caju.node.ACaractereATipo;
import caju.node.ANumeroATipo;
import caju.node.AVariavelADeclaracao;
import caju.node.AVetorATipo;
import caju.node.PANome;
import caju.node.PATipo;
import caju.node.Start;

public class SemanticAnalyzer extends DepthFirstAdapter {
    private Stack<SymbolTable> symbolTables;

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

    public SemanticAnalyzer() {
        symbolTables = new Stack<>();
        symbolTables.push(new SymbolTable(null));
    }

    public void inABlocoAComando(ABlocoAComando node) {
        symbolTables.push(new SymbolTable(symbolTables.peek()));
    }

    @Override
    public void outABlocoAComando(ABlocoAComando node) {
        symbolTables.pop();
    }

    @Override
public void caseAVariavelADeclaracao(AVariavelADeclaracao node) {
    Symbol.Type varType = getTypeFromNode(node.getATipo());

    for (PANome nomeNode : node.getNomes()) {
        String varName = nomeNode.toString();

        SymbolTable currentScope = symbolTables.peek();
        if (!currentScope.add(varName, new Symbol(varName, varType))) {
            System.err.println("Erro: Variável '" + varName + "' já foi declarada no escopo atual.");
        } else {
            System.out.println("Variável '" + varName + "' declarada com sucesso.");
        }
    }
}


private Symbol.Type getTypeFromNode(PATipo tipoNode) {
    if (tipoNode instanceof ANumeroATipo) {
        return Symbol.Type.NUMERO;
    } else if (tipoNode instanceof ACaractereATipo) {
        return Symbol.Type.CARACTERE;
    } else if (tipoNode instanceof ABooleanoATipo) {
        return Symbol.Type.BOOLEANO;
    } else if (tipoNode instanceof AVetorATipo) {
        return Symbol.Type.VETOR;
    } else {
        return null; 
    }
}
  
}
