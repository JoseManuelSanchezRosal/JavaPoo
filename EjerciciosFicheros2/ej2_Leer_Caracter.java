package EjerciciosFicheros2;
import java.io.FileReader;

// Ejercicio 2: Leer un archivo carácter por carácter
// Escribe un programa en Java que lea el archivo `datos.txt` carácter por carácter y muestre el contenido en la pantalla.
public class ej2_Leer_Caracter {
    public static void main(String[] args) {
        // STRING RUTA
        String ruta = new String("EjerciciosFicheros2/datos.txt");
        // FILEREADER Y CARACTER
        try{
            FileReader reader = new FileReader(ruta);
            int caracter;
            while ((caracter = reader.read()) !=-1) {
                System.out.print((char) caracter);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al escribir"+ e.getMessage());
        }
    }
}