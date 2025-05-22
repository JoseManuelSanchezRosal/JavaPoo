package EjerciciosFicheros3;

import java.io.File;
import java.util.List;

//Ejercicio 11: Listar archivos en un directorio
//Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.
public class ej_11ListarArchivosyCarpetas {
    public static void main(String[] args) {
        File directorio = new File("EjerciciosFicheros3");
        File[] elementos = directorio.listFiles();
        for(File elemento:elementos){
            if(elemento.isDirectory()){
                System.out.println("El elemento "+elemento.getName()+" es DIRECTORIO");
            }
            if(elemento.isFile()){
                System.out.println("El elemento "+elemento.getName()+" es ARCHIVO");
            }
        }
    }
}