package caju.semantics;

import java.util.Stack;
import java.util.HashMap;

// Classe SymbolTable para armazenar variáveis, funções e seus atributos
class SymbolTable {
    private Stack<HashMap<String, Symbol>> scopes;

    public SymbolTable() {
        scopes = new Stack<>();
        openScope(); // abre o escopo global
    }

    public void openScope() {
        scopes.push(new HashMap<>());
    }

    public void closeScope() {
        scopes.pop();
    }

    public boolean insertSymbol(String name, Symbol symbol) {
        if (scopes.peek().containsKey(name)) {
            return false; // simbolo já existe no escopo atual
        }
        scopes.peek().put(name, symbol);
        return true;
    }

    public Symbol lookupSymbol(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(name)) {
                return scopes.get(i).get(name);
            }
        }
        return null; // símbolo não encontrado
    }
}
