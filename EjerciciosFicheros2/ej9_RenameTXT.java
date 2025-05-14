package EjerciciosFicheros2;

import java.io.File;

//Ejercicio 9: Renombrar un archivo
// Desarrolla un programa que renombre el archivo `datos.txt` a `informacion.txt`, verificando que la operación se haya realizado con éxito.
public class ej9_RenameTXT {
    public static void main(String[] args) {
        String rutaOriginal = new String("EjerciciosFicheros2/datos.txt");
        File archivoOriginal = new File(rutaOriginal);

        String rutaNueva = new String("EjerciciosFicheros2/informacion.txt");
        File archivoNuevo = new File(rutaNueva);

        if(archivoOriginal.renameTo(archivoNuevo)){
            System.out.println("Archivo "+archivoOriginal.getName()+" renombrado a  "+archivoNuevo.getName());
        }else{
            System.out.println("El archivo ya existe");
        }
    }
}