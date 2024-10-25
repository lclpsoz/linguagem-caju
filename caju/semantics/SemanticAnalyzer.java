package caju.semantics;

import caju.analysis.DepthFirstAdapter;
import caju.node.*;
import java.util.*;

public class SemanticAnalyzer extends DepthFirstAdapter {
    private SymbolTable symbolTable;
    private List<String> errors;

    public SemanticAnalyzer() {
        this.symbolTable = new SymbolTable();
        this.errors = new ArrayList<>();
    }

    @Override
    public void inStart(Start node) {
        System.out.println("-------------------------------------------------");
        System.out.println("Iniciando análise semântica...");
    }

    @Override
    public void outStart(Start node) {
        System.out.println("-------------------------------------------------");
        if (errors.isEmpty()) {
            System.out.println("Análise semântica concluída sem erros.");
        } else {
            System.out.println("Erros semânticos encontrados:");
            for (String error : errors) {
                System.out.println("- " + error);
            }
        }
        System.out.println("-------------------------------------------------");
    }

    @Override
    public void inAVariavelADeclaracao(AVariavelADeclaracao node) {
        String tipo = node.getATipo().toString().trim();
        for (PANome nome : node.getNomes()) {
            String nomeStr = nome.toString();
            if (symbolTable.exists(nomeStr)) {
                addError("Variável '" + nomeStr + "' já declarada neste escopo.");
            } else {
                symbolTable.add(nomeStr, new Symbol(nomeStr, tipo));
            }
        }
    }

    @Override
    public void inAFuncaoADeclaracao(AFuncaoADeclaracao node) {
        String nome = node.getNome().getText();
        String tipoRetorno = node.getTipoRetorno().toString().trim();
        
        if (symbolTable.exists(nome)) {
            addError("Função '" + nome + "' já declarada.");
        } else {
            symbolTable.add(nome, new Symbol(nome, "funcao", tipoRetorno));
        }
        
        symbolTable.enterScope();
    }

    @Override
    public void outAFuncaoADeclaracao(AFuncaoADeclaracao node) {
        symbolTable.exitScope();
    }

    @Override
    public void inAVarAExp(AVarAExp node) {
        String nome = node.getAVar().toString();
        if (!symbolTable.exists(nome)) {
            addError("Variável '" + nome + "' não declarada.");
        }
    }

    private void addError(String message) {
        errors.add(message);
    }
}

class SymbolTable {
    private LinkedList<HashMap<String, Symbol>> scopes;

    public SymbolTable() {
        scopes = new LinkedList<>();
        enterScope();
    }

    public void enterScope() {
        scopes.addFirst(new HashMap<>());
    }

    public void exitScope() {
        scopes.removeFirst();
    }

    public void add(String name, Symbol symbol) {
        scopes.getFirst().put(name, symbol);
    }

    public boolean exists(String name) {
        for (HashMap<String, Symbol> scope : scopes) {
            if (scope.containsKey(name)) {
                return true;
            }
        }
        return false;
    }

    public Symbol get(String name) {
        for (HashMap<String, Symbol> scope : scopes) {
            Symbol symbol = scope.get(name);
            if (symbol != null) {
                return symbol;
            }
        }
        return null;
    }
}

class Symbol {
    String name;
    String type;
    String returnType;
    boolean initialized;

    public Symbol(String name, String type) {
        this(name, type, null);
    }

    public Symbol(String name, String type, String returnType) {
        this.name = name;
        this.type = type;
        this.returnType = returnType;
        this.initialized = false;
    }
}
