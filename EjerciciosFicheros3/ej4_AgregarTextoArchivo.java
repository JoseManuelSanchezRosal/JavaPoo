package EjerciciosFicheros3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ej4_AgregarTextoArchivo {
    public static void main(String[] args) {
        File archivo = new File("EjerciciosFicheros3/datos3.txt");
        try {
            FileWriter escritor = new FileWriter(archivo, true);
            escritor.append("\nEste es un mensaje desde el ejercicio 4");
            escritor.close();
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}