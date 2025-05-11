package Ejercicio1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//Ejercicio 1: Crear y escribir en un archivo:
//Crea un programa en Java que cree un archivo de texto llamado datos.txt y escriba dentro de él un mensaje de bienvenida
public class Ejercicio1Main {
    public static void main(String[] args) throws IOException {
        // Paso 1: Declarar ruta del archivo "datos.txt" como un String
        String nombreArchivo = "EjericiosFicheros/src/datos.txt";
        // Creamos archivo File que representa esa ruta:
        File archivo = new File(nombreArchivo); // Crea un objeto File que representa el archivo

        // Paso 2: Crear el archivo si no existe
        if (archivo.createNewFile()) {
            System.out.println("Archivo creado: " + archivo.getName());  // Si se creó, lo indica
        } else {
            System.out.println("El archivo ya existe.");  // Si ya existe, no hace nada
        }

        // Paso 3: Escribir en el archivo usando FileWriter
        try (FileWriter escritor = new FileWriter(archivo)) {
            //CON SYSTEM.LINESEPARATOR() HACEMOS UN SALTO DE LINEA CON FILEWRITER:
            escritor.write("¡Hola, este es un mensaje escrito desde el ejercicio 1!"+ System.lineSeparator());//Escribe el primer mensaje
            System.out.println("Mensaje escrito correctamente.");
            escritor.write("Hola, este es otro mensaje escrito desde el ejercicio 1");//Escribimos otro mensaje
            System.out.println("Mensaje escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}