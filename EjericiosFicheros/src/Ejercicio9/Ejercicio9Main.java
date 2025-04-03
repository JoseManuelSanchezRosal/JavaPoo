package Ejercicio9;
import java.io.File;
import java.io.IOException;
//Ejercicio 9: Renombrar un archivo
//Desarrolla un programa que renombre el archivo datos.txt a informacion.txt, verificando que la operación se haya realizado con éxito.
public class Ejercicio9Main {
    public static void main(String[] args) {
        // Ruta del archivo original
        String rutaOriginal = "EjericiosFicheros/src/informacion.txt";
        // Nuevo nombre del archivo
        String nuevaRuta = "EjericiosFicheros/src/datos.txt";

        // Crear objetos File para el archivo original y el nuevo archivo
        File archivoOriginal = new File(rutaOriginal);
        File archivoNuevo = new File(nuevaRuta);

        // Verificar si el archivo original existe antes de intentar renombrarlo
        if (archivoOriginal.exists()) {
            // Intentar renombrar el archivo
            boolean exito = archivoOriginal.renameTo(archivoNuevo);

            // Verificar si la operación fue exitosa
            if (exito) {
                System.out.println("El archivo ha sido renombrado exitosamente.");
            } else {
                System.out.println("No se pudo renombrar el archivo.");
            }
        } else {
            System.out.println("El archivo 'datos.txt' no existe.");
        }
    }
}