package EjerciciosFicheros3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Ejercicio 10: Eliminar un archivo
//Crea un programa que elimine el archivo informacion.txt y muestre un mensaje confirmando su eliminación.
public class ej10_BorrarArchivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduzca ruta del archivo a borrar: ");
            String ruta = sc.nextLine();
            File archivo = new File(ruta);
            if(archivo.exists()){
                System.out.println("Archivo "+archivo.getName()+" borrado");
                archivo.delete();
            }
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}