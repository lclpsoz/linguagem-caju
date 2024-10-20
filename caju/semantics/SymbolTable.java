package caju.semantics;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, Symbol> symbols;
    private SymbolTable parent;

    public SymbolTable(SymbolTable parent) {
        this.symbols = new HashMap<>();
        this.parent = parent;
    }

    public Symbol lookup(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol == null && parent != null) {
            return parent.lookup(name);
        }
        return symbol;
    }

    public boolean add(String name, Symbol symbol) {
        if (symbols.containsKey(name)) {
            return false;
        }
        symbols.put(name, symbol);
        return true;
    }

    public SymbolTable getParent() {
        return parent;
    }
}
