import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            // crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
            CPP14Lexer lexer;
            if (args.length>0)
                lexer = new CPP14Lexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new CPP14Lexer(CharStreams.fromStream(System.in));
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto correspondiente al analizador sintáctico que se alimenta a partir del buffer de tokens
            CPP14Parser parser = new CPP14Parser(tokens);
            ParseTree tree = parser.translationUnit(); // Iniciar el analisis sintáctico en la regla inicial: r
            System.out.println(tree.toStringTree(parser)); // imprime el arbol al estilo LISP

            Visitor<Object> loader = new Visitor<Object>();
            loader.visit(tree);
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}

