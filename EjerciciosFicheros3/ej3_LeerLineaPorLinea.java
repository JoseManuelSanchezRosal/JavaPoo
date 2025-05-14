package EjerciciosFicheros3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//Ejercicio 3: Leer un archivo línea por línea
//Desarrolla un programa en Java que lea el archivo datos.txt línea por línea e imprima cada línea en la consola.
public class ej3_LeerLineaPorLinea {
    public static void main(String[] args) {
        File archivo = new File("EjerciciosFicheros3/datos3.txt");
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = lector.readLine())!=null){
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}