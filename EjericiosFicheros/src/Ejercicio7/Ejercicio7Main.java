package Ejercicio7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//Ejercicio 7: Buscar una palabra en un archivo
//Escribe un programa que busque una palabra específica dentro del archivo datos.txt e indique cuántas veces aparece.
public class Ejercicio7Main {
    public static void main(String[] args) {
        String nombreArchivo = "EjericiosFicheros/src/datos.txt";
        // Aqui indicamos la palabra que deseamos buscar.
        String palabraBuscada = "mensaje";
        int contador = 0; // Variable que almacenara el numero de veces que aparece nuestra palabra.
        //Apertura y lectura de nuestro archivo mediante BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+"); // Divide la línea en palabras
                for (String palabra : palabras) {
                    if (palabra.equalsIgnoreCase(palabraBuscada)) { // Ignora mayúsculas/minúsculas
                        contador++;
                    }
                }
            }
            System.out.println("La palabra '" + palabraBuscada + "' aparece " + contador + " veces en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}