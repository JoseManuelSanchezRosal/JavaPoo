package EjerciciosFicheros2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Ejercicio 1: Crear y escribir en un archivo
// Crea un programa en Java que cree un archivo de texto llamado `datos.txt` y escriba dentro de él un mensaje de bienvenida.
public class ej1_crear_escribir {
    public static void main(String[] args) throws IOException {
        // ESPECIFICAMOS STRING RUTA Y FILE RUTA
        String ruta = new String("EjerciciosFicheros2/datos.txt");
        File archivo = new File(ruta);
        // CREAMOS EL ARCHIVO
        if (archivo.createNewFile()) {
            System.out.println("Archivo creado: " + archivo.getName());

        } else {
            System.out.println("El archivo existe");
        };
        // ESCRIBIMOS EN EL ARCHIVO CON FILEWRITER
        try (FileWriter escritor = new FileWriter(archivo)) {
            escritor.write("Este es un mensaje de prueba" + System.lineSeparator());
            escritor.write("Este es el segundo mensaje de prueba");
            System.out.println("Mensajes escritos correctamente");
        } catch (IOException e) {
            System.out.println("Error al escribir en el achivo" + e.getMessage());
        }
    }
}