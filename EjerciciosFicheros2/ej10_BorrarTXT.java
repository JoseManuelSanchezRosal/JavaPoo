package EjerciciosFicheros2;

import java.io.File;

//Ejercicio 10: Eliminar un archivo**
// Crea un programa que elimine el archivo `informacion.txt` y muestre un mensaje confirmando su eliminación.
public class ej10_BorrarTXT {
    public static void main(String[] args) {
        File archivo = new File("EjerciciosFicheros2/informacion.txt");

        if (archivo.exists()){
            archivo.delete();
            System.out.println("Archivo borrado");
        }else {
            System.out.println("El archivo no existe");
        }
    }
}