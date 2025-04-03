package Ejercicio8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//Ejercicio 8: Contar la cantidad de líneas en un archivo
//Crea un programa que cuente cuántas líneas tiene el archivo datos.txt y muestre el total.
public class Ejercicio8Main {
    public static void main(String[] args) {
        String nombreArchivo = "EjericiosFicheros/src/datos.txt"; // Ruta del archivo
        int contadorLineas = 0; // Contador de líneas

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contadorLineas++; // Se incrementa el contador por cada línea leída
            }
            System.out.println("El archivo tiene " + contadorLineas + " líneas.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}