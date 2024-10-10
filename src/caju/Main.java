package caju;
import caju.lexer.*;
import caju.node.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		String arquivos[] = {
				"teste/teste.caju",
				"teste/code_1.cj",
				"teste/code_2.cj",
				"teste/code_3.cj"
		};
		
		for(String arquivo : arquivos) {
			try {	
				Lexer lexer =
						new Lexer(
								new PushbackReader(  
										new FileReader(arquivo), 1024)); 
				Token token;
				while(!((token = lexer.next()) instanceof EOF)) {
					System.out.println(token.getClass());
					System.out.println(" ( "+token.toString()+")");
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}