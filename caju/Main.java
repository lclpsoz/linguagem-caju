package caju;

import caju.lexer.*;
import caju.node.*;
import caju.parser.*;

import java.io.*;

public class Main {
    public static void main(String[] args) {    
        String filePath = (args.length > 0) ? args[0] : "test/teste.caju";
        System.out.println("Analisando o arquivo '" + filePath + "'...");
        File inputFile = new File(filePath);

        if (!inputFile.exists() || !inputFile.isFile()) {
            System.out.println("Erro: O arquivo '" + filePath + "' não existe ou não é um arquivo válido.");
            System.exit(1);
        }

        try (FileReader fileReader = new FileReader(inputFile)) {
            Lexer lexer = new Lexer(new PushbackReader(fileReader, 1024));
            Parser parser = new Parser(lexer);
            Start tree = parser.parse();

            tree.apply(new ASTPrinter());
            tree.apply(new ASTDisplay());
            System.out.println("Análise Sintática concluída com sucesso!");
           
            

        } catch (FileNotFoundException e) {
            System.out.println("Erro: Não foi possível abrir o arquivo '" + filePath + "'.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erro de I/O ao ler o arquivo '" + filePath + "'.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Erro durante a análise:");
            e.printStackTrace();
        }
    }
}