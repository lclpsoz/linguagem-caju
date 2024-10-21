package caju.semantics;

class Symbol {
    public enum Type {
        VARIAVEL, FUNCAO, VETOR, INTEIRO,
        BOOLEANO, CARACTERE, STRING, VAZIO
    }

    private String name;
    private Type type;
    private String dataType; 

    public Symbol(String name, Type type, String dataType) {
        this.name = name;
        this.type = type;
        this.dataType = dataType;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getDataType() {
        return dataType;
    }
}
