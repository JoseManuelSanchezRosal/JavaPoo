package EjerciciosFicheros2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//Ejercicio 5: Contar palabras en un archivo
// Crea un programa que cuente el número total de palabras en el archivo `datos.txt` y muestre el resultado en la consola.
public class ej5_Contar_Palabras {
    public static void main(String[] args) {
        String ruta = new String("EjerciciosFicheros2/datos.txt");
        File archivo = new File(ruta);

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                String[] palabrasPorLinea = linea.split(" ");
                for (String palabra : palabrasPorLinea) {
                    if ((!palabra.isEmpty())) {
                        contador++;
                    }
                }
            }
            System.out.println("En el documento "+archivo.getName()+" hay un total de "+contador+" palabras");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}