package Ejercicio10;
import java.io.File;
//Ejercicio 10: Eliminar un archivo
//Crea un programa que elimine el archivo informacion.txt y muestre un mensaje confirmando su eliminación.
public class Ejercicio10Main {
    public static void main(String[] args) {
        // Ruta del archivo que se desea eliminar
        String rutaArchivo = "informacion.txt";

        // Crear un objeto File para representar el archivo
        File archivo = new File(rutaArchivo);

        // Verificar si el archivo existe antes de intentar eliminarlo
        if (archivo.exists()) {
            // Intentar eliminar el archivo
            boolean exito = archivo.delete();

            // Verificar si la operación fue exitosa
            if (exito) {
                System.out.println("El archivo ha sido eliminado exitosamente.");
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }
        } else {
            System.out.println("El archivo 'informacion.txt' no existe.");
        }
    }
}