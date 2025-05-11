package EjerciciosFicheros2;

import java.io.BufferedReader;
import java.io.FileReader;

// Ejercicio 8: Contar la cantidad de líneas en un archivo
// Crea un programa que cuente cuántas líneas tiene el archivo `datos.txt` y muestre el total.
public class ej8_Contar_lLineas_Archivo {
    public static void main(String[] args) {
        String ruta = new String("EjerciciosFicheros2/datos.txt");

        try {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            int cuentalineas = 0;

            while (lector.readLine() !=null){
                cuentalineas++;
            }
            System.out.println("El archivo cuenta con "+cuentalineas+" lineas");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}1