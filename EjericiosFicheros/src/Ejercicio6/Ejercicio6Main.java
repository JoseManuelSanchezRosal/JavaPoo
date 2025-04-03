package Ejercicio6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ejercicio6Main {
    public static void main(String[] args) {
        String sourceFile = "EjericiosFicheros/src/datos.txt";
        String destinationFile = "EjericiosFicheros/src/copia.txt";

        try {
            Files.copy(Paths.get(sourceFile), Paths.get(destinationFile), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("El archivo ha sido copiado exitosamente en copia.txt");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}