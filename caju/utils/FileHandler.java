package caju.utils;

import caju.lexer.*;
import caju.node.*;
import caju.parser.*;
import caju.ast.*;

import java.io.*;

public class FileHandler {
    
    public static boolean isValidFile(String filePath) {
        File file = new File(filePath);
        return file.exists() && file.isFile() && file.canRead();
    }

    public static FileReader getFileReader(String filePath) throws IOException {
        return new FileReader(new File(filePath));
    }

    public static void parseFile(String filePath) throws IOException, ParserException, LexerException {
        try (FileReader fileReader = getFileReader(filePath)) {
            Lexer lexer = new Lexer(new PushbackReader(fileReader, 1024));
            Parser parser = new Parser(lexer);
            Start tree = parser.parse();

            tree.apply(new ASTPrinter());
            tree.apply(new ASTDisplay());
        }
    }
}
