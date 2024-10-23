package caju.semantics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import caju.analysis.DepthFirstAdapter;

// Primeiro vamos criar a classe que representa um símbolo na tabela
class Symbol {
    private String name;
    private Type type;
    private boolean isDefined;
    private SymbolKind kind;
    private List<Type> parameterTypes; // Para funções
    private Type returnType;           // Para funções

    public enum SymbolKind {
        VARIABLE,
        FUNCTION,
        PARAMETER
    }

    public Symbol(String name, Type type, SymbolKind kind) {
        this.name = name;
        this.type = type;
        this.kind = kind;
        this.isDefined = false;
        this.parameterTypes = new ArrayList<>();
    }

    // Getters e setters
    public String getName() { return name; }
    public Type getType() { return type; }
    public boolean isDefined() { return isDefined; }
    public void setDefined(boolean defined) { isDefined = defined; }
    public SymbolKind getKind() { return kind; }
    public List<Type> getParameterTypes() { return parameterTypes; }
    public Type getReturnType() { return returnType; }
    public void setReturnType(Type returnType) { this.returnType = returnType; }
}

// Classe que representa os tipos na linguagem
class Type {
    private TypeKind kind;
    private Type baseType;  // Para vetores
    private List<Integer> dimensions; // Para vetores

    public enum TypeKind {
        NUMBER,
        CHARACTER,
        BOOLEAN,
        ARRAY,
        VOID
    }

    public Type(TypeKind kind) {
        this.kind = kind;
        this.dimensions = new ArrayList<>();
    }

    public static Type createArrayType(Type baseType, List<Integer> dimensions) {
        Type type = new Type(TypeKind.ARRAY);
        type.baseType = baseType;
        type.dimensions = dimensions;
        return type;
    }

    public boolean isCompatibleWith(Type other) {
        if (this.kind == other.kind) {
            if (this.kind == TypeKind.ARRAY) {
                return baseType.isCompatibleWith(other.baseType) &&
                       dimensions.equals(other.dimensions);
            }
            return true;
        }
        return false;
    }

    public TypeKind getKind() { return kind; }
    public Type getBaseType() { return baseType; }
    public List<Integer> getDimensions() { return dimensions; }
}

// Classe que implementa a tabela de símbolos
class SymbolTable {
    private List<Map<String, Symbol>> scopes;

    public SymbolTable() {
        scopes = new ArrayList<>();
        enterScope(); // Escopo global
    }

    public void enterScope() {
        scopes.add(new HashMap<>());
    }

    public void exitScope() {
        if (!scopes.isEmpty()) {
            scopes.remove(scopes.size() - 1);
        }
    }

    public boolean declare(String name, Symbol symbol) {
        Map<String, Symbol> currentScope = scopes.get(scopes.size() - 1);
        if (currentScope.containsKey(name)) {
            return false; // Já declarado no escopo atual
        }
        currentScope.put(name, symbol);
        return true;
    }

    public Symbol lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Symbol symbol = scopes.get(i).get(name);
            if (symbol != null) {
                return symbol;
            }
        }
        return null;
    }
}

// Classe principal do analisador semântico
class SemanticAnalyzer extends DepthFirstAdapter {
    private SymbolTable symbolTable;
    private Stack<Type> typeStack;
    private boolean hasMainFunction;

    public SemanticAnalyzer() {
        this.symbolTable = new SymbolTable();
        this.typeStack = new Stack<>();
        this.hasMainFunction = false;
    }

    @Override
    public void inAPrograma(APrograma node) {
        // Inicia a análise no escopo global
    }

    @Override
    public void outAPrograma(APrograma node) {
        if (!hasMainFunction) {
            throw new SemanticException("Programa não possui função principal marcada com ->");
        }
    }

    @Override
    public void inAFuncaoDeclaracao(AFuncaoDeclaracao node) {
        symbolTable.enterScope();
        String funcName = node.getNome().getText();
        
        // Verifica se é a função principal
        if (node.getSeta() != null) {
            hasMainFunction = true;
        }

        // Cria símbolo para a função
        Type returnType = convertType(node.getTipoRetorno());
        Symbol funcSymbol = new Symbol(funcName, returnType, Symbol.SymbolKind.FUNCTION);
        
        if (!symbolTable.declare(funcName, funcSymbol)) {
            throw new SemanticException("Função " + funcName + " já declarada");
        }
    }

    @Override
    public void outAFuncaoDeclaracao(AFuncaoDeclaracao node) {
        symbolTable.exitScope();
    }

    @Override
    public void inAVariavelDeclaracao(AVariavelDeclaracao node) {
        Type type = convertType(node.getTipo());
        
        for (ANome nome : node.getNomes()) {
            String varName = nome.getIdentificador().getText();
            Symbol varSymbol = new Symbol(varName, type, Symbol.SymbolKind.VARIABLE);
            
            if (!symbolTable.declare(varName, varSymbol)) {
                throw new SemanticException("Variável " + varName + " já declarada no escopo atual");
            }
        }
    }

    @Override
    public void inAAtribuicaoComando(AAtribuicaoComando node) {
        // Verificar tipos na atribuição
        Type rightType = evaluateExpression(node.getValor());
        Type leftType = evaluateVar(node.getAlvo());
        
        if (!leftType.isCompatibleWith(rightType)) {
            throw new SemanticException("Tipos incompatíveis na atribuição");
        }
        
        // Marcar variável como definida
        String varName = getVarName(node.getAlvo());
        Symbol symbol = symbolTable.lookup(varName);
        if (symbol != null) {
            symbol.setDefined(true);
        }
    }

    private Type evaluateExpression(AExp exp) {
        if (exp instanceof ANumeroExp) {
            return new Type(Type.TypeKind.NUMBER);
        } else if (exp instanceof ACaractereExp) {
            return new Type(Type.TypeKind.CHARACTER);
        } else if (exp instanceof ABooleanoExp) {
            return new Type(Type.TypeKind.BOOLEAN);
        } else if (exp instanceof AVarExp) {
            String varName = getVarName(((AVarExp) exp).getVar());
            Symbol symbol = symbolTable.lookup(varName);
            if (symbol == null) {
                throw new SemanticException("Variável " + varName + " não declarada");
            }
            if (!symbol.isDefined()) {
                throw new SemanticException("Variável " + varName + " não foi inicializada");
            }
            return symbol.getType();
        }
        // Implementar outros casos de expressão...
        return null;
    }

    private Type evaluateVar(AVar var) {
        String varName = getVarName(var);
        Symbol symbol = symbolTable.lookup(varName);
        if (symbol == null) {
            throw new SemanticException("Variável " + varName + " não declarada");
        }
        return symbol.getType();
    }

    private Type convertType(AAstType type) {
        if (type instanceof ANumeroTipo) {
            return new Type(Type.TypeKind.NUMBER);
        } else if (type instanceof ACaractereTipo) {
            return new Type(Type.TypeKind.CHARACTER);
        } else if (type instanceof ABooleanoTipo) {
            return new Type(Type.TypeKind.BOOLEAN);
        } else if (type instanceof AVetorTipo) {
            Type baseType = convertType(((AVetorTipo) type).getBase());
            List<Integer> dimensions = evaluateDimensions(((AVetorTipo) type).getDimensoes());
            return Type.createArrayType(baseType, dimensions);
        }
        return null;
    }

    private List<Integer> evaluateDimensions(List<AExp> dimensoes) {
        List<Integer> result = new ArrayList<>();
        for (AExp dim : dimensoes) {
            // Aqui você deve avaliar a expressão e garantir que é um número inteiro positivo
            // Por simplicidade, vamos assumir que já é um número
            if (dim instanceof ANumeroExp) {
                result.add(Integer.parseInt(((ANumeroExp) dim).getNumero().getText()));
            } else {
                throw new SemanticException("Dimensão do vetor deve ser um número inteiro positivo");
            }
        }
        return result;
    }

    private String getVarName(AVar var) {
        if (var instanceof ASimplesVar) {
            return ((ASimplesVar) var).getNome().getText();
        }
        throw new SemanticException("Tipo de variável não suportado");
    }
}

class SemanticException extends RuntimeException {
    public SemanticException(String message) {
        super(message);
    }
}