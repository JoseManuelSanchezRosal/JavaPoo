package EjerciciosFicheros2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Ejercicio 12: Leer un archivo CSV y mostrar los datos**
// Crea un programa que lea un archivo CSV llamado `datos.csv` y muestre su contenido en formato tabla.
public class ej12_Leer_CSV {
    public static void main(String[] args) {
        File csv = new File("EjerciciosFicheros2/datos.csv");

        try {
            BufferedReader lector = new BufferedReader(new FileReader(csv));
            String linea;
            while ((linea = lector.readLine())!=null){
                String[] texto = linea.split(",");
                for(String palabra : texto){
                    if(palabra.isEmpty()){
                        System.out.printf("                         ");
                    }else{
                        System.out.printf("%-25s", palabra);
                    }
                }
                System.out.println();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}