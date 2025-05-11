package EjerciciosFicheros2;

import java.io.BufferedReader;
import java.io.FileReader;

// Ejercicio 3: Leer un archivo línea por línea
// Desarrolla un programa en Java que lea el archivo `datos.txt` línea por línea e imprima cada línea en la consola.
public class ej3_Leer_Linea {
    public static void main(String[] args) {
        String ruta = new String("EjerciciosFicheros2/datos.txt");

        try{
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String linea;
            while((linea = reader.readLine()) !=null){
                System.out.println(linea);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
    }
}