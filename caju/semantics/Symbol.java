package caju.semantics;

public class Symbol {
    public enum Type {
        NUMERO, CARACTERE, BOOLEANO, FUNCAO, VETOR
    }

    private String name;
    private Type type;
    private boolean initialized;

    public Symbol(String name, Type type) {
        this.name = name;
        this.type = type;
        this.initialized = false;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }
}
