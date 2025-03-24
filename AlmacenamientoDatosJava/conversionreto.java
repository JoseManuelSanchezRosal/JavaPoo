package AlmacenamientoDatosJava;

import java.io.PrintWriter;
// Ayatem.out es un objeto PrintStream, que a seu vez es de tipo OutStream. PrintWriter tiene un constructor que toma un objeto OutputStream como argumento. Por tanto, si queremos convertir System.out en un objeto PrintWriter utilizaremos dicho constructor.
public class conversionreto {
    public static void main(String[] args) {
        PrintWriter pepe = new PrintWriter(System.out, true);
        pepe.print("Se instancia pepe para emplearlo como printeo en consola");
        System.out.println("HOla");
        pepe.close();
    }
}
