package caju;

import caju.utils.*;

public class Main {
    public static void main(String[] args) {
        String filePath = (args.length > 0) ? args[0] : "test/teste.cj";
        System.out.println("Analisando o arquivo '" + filePath + "'...");

        if (!FileHandler.isValidFile(filePath)) {
            System.err.println("Erro: O arquivo '" + filePath + "' não é válido.");
            System.exit(1);
        }
        
        try {
            FileHandler.parseFile(filePath);
            System.out.println("Análise Sintática concluída com sucesso!");
        } catch (Exception e) {
            ErrorHandler.handleErrors(filePath, e);
        }
    }

  
}
