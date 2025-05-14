package EjerciciosFicheros2.Eliminar;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EliminarArchivo {
    public static void main(String[] args) {

        String ruta = new String("EjerciciosFicheros2/Eliminar/prueba.txt");
        File archivo = new File(ruta);
        try {
            if(archivo.createNewFile()) {
                System.out.println("Archivo creado");
            }else {
                System.out.println("El archivo ya existe");
            }
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Pulse intro para eliminar");
        sc.nextLine();
        try {
            if (archivo.exists()) {
                archivo.delete();
                System.out.println("archivo eliminado");
            } else {
                System.out.println("El archivo no existe");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}