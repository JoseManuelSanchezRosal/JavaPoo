package EjerciciosFicheros3;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

//Ejercicio 11: Listar archivos en un directorio
//Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.
public class ej14_ListarDirectorioPorParametro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca ruta para listar archivos: ");
        String ruta = sc.nextLine();
        File directorio = new File(ruta);
        System.out.println(Arrays.toString(directorio.listFiles()));
    }
}