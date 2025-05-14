package EjerciciosFicheros3;
import java.io.FileReader;
import java.io.IOException;
//Ejercicio 2: Leer un archivo carácter por carácter
//Escribe un programa en Java que lea el archivo datos.txt carácter por carácter y muestre el contenido en la pantalla.
public class ej2_LeerCaracterporCaracter {
    public static void main(String[] args) {
        try {
            FileReader lector = new FileReader("EjerciciosFicheros3/datos3.txt");
            int letra;
            while ((letra = lector.read())!=-1){
                System.out.print((char)letra);
            }
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}