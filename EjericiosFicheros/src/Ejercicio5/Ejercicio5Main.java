package Ejercicio5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Ejercicio 5: Contar palabras de un archivo.
// Crea un programa que cuente el número total de palabras en el archivo datos.txt y muestre el resultado por pantalla
public class Ejercicio5Main {
    public static void main(String[] args) {
        String nombreArchivo = "EjericiosFicheros/src/datos.txt";
        try {
            //Paths.get(filePath): Obtiene la ruta del archivo.
            //Files.readAllBytes(...): Lee el contenido del archivo y devuelve un array de bytes
            //new String(...): Convierte esos bytes en una cadena de texto.
            String contenido = new String(Files.readAllBytes(Paths.get(nombreArchivo)));
            // content.split(" ") divide el contenido y lo guarda en un array de palabras utilizando los espacios como delimitador
            String[] palabras = contenido.split(" ");
            //Sacamos por pantalla la cantidad de palabras total de la cadena palabras con .length.
            System.out.println("Número total de palabras en datos.txt: " + palabras.length);//Devuelve el numero total de palabras del docuemento.
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}