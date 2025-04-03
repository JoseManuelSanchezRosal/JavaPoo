package Ejercicio11;

import java.io.File;

//Ejercicio 11: Listar archivos en un directorio
//Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.
public class Ejercicio11Main {
    public static void main(String[] args) {
        // Obtener el directorio actual
        File directorio = new File(".");

        // Verificar si el directorio es válido
        if (directorio.exists() && directorio.isDirectory()) {
            // Listar los archivos y carpetas dentro del directorio
            String[] archivos = directorio.list();

            // Si el directorio no está vacío, recorrer los archivos
            if (archivos != null) {
                System.out.println("Archivos y carpetas en el directorio actual:");

                for (String archivo : archivos) {
                    // Crear objeto File para cada archivo o carpeta
                    File f = new File(directorio, archivo);

                    // Verificar si es un archivo o un directorio
                    if (f.isDirectory()) {
                        System.out.println(archivo + " es un directorio.");
                    } else if (f.isFile()) {
                        System.out.println(archivo + " es un archivo.");
                    }
                }
            } else {
                System.out.println("El directorio está vacío.");
            }
        } else {
            System.out.println("El directorio no existe o no es válido.");
        }
    }
}
