package EjerciciosFicheros3;

import java.io.File;

//Ejercicio 9: Renombrar un archivo
//Desarrolla un programa que renombre el archivo datos.txt a informacion.txt, verificando que la operación se haya realizado con éxito.
public class ej9_RenombrarArchivo {
    public static void main(String[] args) {
        File origen = new File("EjerciciosFicheros3/datos3.txt");
        File renombrado = new File("EjerciciosFicheros3/info3.txt");
        try {
            origen.renameTo(renombrado);
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}