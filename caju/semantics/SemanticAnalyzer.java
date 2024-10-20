package caju.semantics;

import java.util.Stack;

import caju.analysis.DepthFirstAdapter;
import caju.node.AAPrograma;
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
        symbolTables.push(new SymbolTable(null)); // Global scope
    }

    public void inAPrograma(AAPrograma node) {
        // Start of the program, global scope
        symbolTables.push(new SymbolTable(symbolTables.peek())); // Push new scope
    }

    public void outAPrograma(AAPrograma node) {
        // End of the program, remove the global scope
        symbolTables.pop();
    }

    
}
