package EjerciciosFicheros3.ElCentroDeLaTierra.resources.explorador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

// LISTAR TODOS LOS ARCHIVOS Y CARPETAS CONTENIDOS EN LA RUTA RESOURCES/EXPLORADOR
public class listarDirectorio {
    public static void main(String[] args) {
        File directorio = new File("EjerciciosFicheros3/ElCentroDeLaTierra/resources/explorador");
        File[] elementos = directorio.listFiles();
        for (File elemento : elementos) {
            if (elemento.isDirectory()) {
                System.out.println("El elemento " + elemento.getName() + " es un DIRECTORIO");
            }
            if (elemento.isFile()) {
                System.out.println("El elemento " + elemento.getName() + " es un ARCHIVO");
            }
        }
    }
}