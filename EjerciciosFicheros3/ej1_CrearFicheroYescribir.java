package EjerciciosFicheros3;

import java.io.File;
import java.io.FileWriter;

//Ejercicio 1: Crear y escribir en un archivo
//Crea un programa en Java que cree un archivo de texto llamado datos.txt y escriba dentro de él un mensaje de bienvenida.
public class ej1_CrearFicheroYescribir {
    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter(new File("EjerciciosFicheros3/datos3.txt"));
            escritor.write("Bienvenido al excitante mundo de los archivos"+System.lineSeparator());
            escritor.write("Este es otro mensaje de bienvenida");
            escritor.close();

        } catch (Exception e) {
            System.out.println();
        }
    }
}