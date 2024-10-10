package caju;

import caju.lexer.*;
import caju.node.*;
import caju.parser.*;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java caju.CajuCompiler <caminho/para/arquivo.caju>");
            System.exit(1);
        }

        String filePath = "teste.caju";
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