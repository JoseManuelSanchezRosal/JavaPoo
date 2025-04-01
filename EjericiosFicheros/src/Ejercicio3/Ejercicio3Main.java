package Ejercicio3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Ejercicio 3: Leer un archivo línea por línea
//Desarrolla un programa en Java que lea el archivo datos.txt línea por línea e imprima cada línea en la consola.
public class Ejercicio3Main {
    public static void main(String[] args) {
        String nombreArchivo = "EjericiosFicheros/src/datos.txt";
        File archivo = new File(nombreArchivo);

        // Usamos BufferedReader para leer línea por línea
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;

            // Leer línea por línea hasta el final del archivo
            while ((linea = lector.readLine()) != null) {
                // Imprimir cada línea leída
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println("Mensajes leidos desde el ejercicio 3 linea por linea");
    }
}