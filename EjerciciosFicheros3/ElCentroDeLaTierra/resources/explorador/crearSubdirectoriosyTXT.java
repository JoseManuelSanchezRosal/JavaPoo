package EjerciciosFicheros3.ElCentroDeLaTierra.resources.explorador;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;

//CREAR UNA ESTRUCTURA DE SUBDIRECTORIOS DENTRO DE RESOURCES/EXPLORADOR QUE TENGA LA SIGUIENTE FORMA:
// resources/explorador/volcan/descenso/aprobar/programacion/
// y dentro de programacion crear archivo de texto centroTierra.txt
public class crearSubdirectoriosyTXT {
    public static void main(String[] args) {
        //CREAR RUTAS
        File directorios = new File("EjerciciosFicheros3/ElCentroDeLaTierra/resources/explorador/volcan/descenso/aprobar/programacion/");
        if (!directorios.exists()) {
            directorios.mkdirs();
            System.out.println("Ruta de directorios creada");
        } else {
            System.out.println("Los directorios ya existen");
        }

        //CREAR ARCHIVO
        File centrotierra = new File("EjerciciosFicheros3/ElCentroDeLaTierra/resources/explorador/volcan/descenso/aprobar/programacion/CENTROTIERRA.txt");
        System.out.println("Pulse intro para crear CENTROTIERRA.TXT");

        try {
            if (!centrotierra.exists()) {
                centrotierra.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}