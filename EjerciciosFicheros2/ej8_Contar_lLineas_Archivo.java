package EjerciciosFicheros2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Ejercicio 8: Contar la cantidad de líneas en un archivo
// Crea un programa que cuente cuántas líneas tiene el archivo `datos.txt` y muestre el total.
public class ej8_Contar_lLineas_Archivo {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosFicheros2/datos.txt";
        int lineasBlancas = 0;
        int lineasConContenido = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    lineasBlancas++;
                } else {
                    lineasConContenido++;
                }
            }

            System.out.println("Líneas en blanco: " + lineasBlancas);
            System.out.println("Líneas con contenido: " + lineasConContenido);
            System.out.println("Total de líneas: " + (lineasBlancas + lineasConContenido));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}