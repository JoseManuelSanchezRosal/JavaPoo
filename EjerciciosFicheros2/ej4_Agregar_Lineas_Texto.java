package EjerciciosFicheros2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Ejercicio 4: Agregar contenido a un archivo
// Modifica el archivo `datos.txt` para agregar nuevas líneas de texto sin borrar el contenido anterior.
public class ej4_Agregar_Lineas_Texto {
    public static void main(String[] args) {
        String ruta = new String("EjerciciosFicheros2/datos.txt");
        String nuevo_texto = new String("Este es el nuevo texto escrito desde el ejercicio 4");

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
            bw.newLine();
            bw.write(nuevo_texto);
            System.out.println("Texto escrito correctamente");
            bw.close();
            }catch (IOException e) {
            System.out.println("Error "+e.getMessage());;
        }
    }
}