package EjerciciosFicheros2;

import java.io.File;

// Ejercicio 11: Listar archivos en un directorio**
// Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.
public class ej11_Listar_Archivos_o_Directorios {
    public static void main(String[] args) {
        File directorio = new File("EjerciciosFicheros2");

        File[] listado = directorio.listFiles();
        if (listado != null) {
            for (File elemento : listado) {
                if (elemento.isDirectory()) {
                    System.out.println("El elemento " + elemento.getName() + " es un DIRECTORIO");
                } else if (elemento.isFile()) {
                    System.out.println(("El elemento " + elemento.getName() + " es un ARCHIVO "));
                }
            }
        }else {
            System.out.println("No hay nada en directorio actual");
        }
    }
}