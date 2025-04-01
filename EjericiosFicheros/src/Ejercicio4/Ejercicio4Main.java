package Ejercicio4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Ejercicio 4: Agregar contenido a un archivo
//Modifica el archivo datos.txt para agregar nuevas líneas de texto sin borrar el contenido anterior.
public class Ejercicio4Main {
    public static void main(String[] args) {
        String nombreArchivo = "EjericiosFicheros/src/datos.txt";
        File archivo = new File(nombreArchivo);

        // Usamos FileWriter en modo "append" (agregar contenido)
        try (FileWriter escritor = new FileWriter(archivo, true)) {
            // Agregar nuevas líneas al final del archivo
            //Metemos un salto de linea antes de escribir
            escritor.write("\n");
            escritor.write("Esta es una nueva línea agregada al archivo desde el ejercicio 4.\n");
            escritor.write("Otra línea agregada al archivo sin borrar el contenido anterior.\n");

            System.out.println("Contenido agregado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al agregar contenido al archivo: " + e.getMessage());
        }
    }
}