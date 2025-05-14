package EjerciciosFicheros3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ej5_ContarPalabras {
    public static void main(String[] args) {
        File archivo = new File("EjerciciosFicheros3/datos3.txt");

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))){
            String linea;
            int contador = 0;
            while ((linea = lector.readLine())!=null){
                String [] palabras = linea.split(" ");
                for(String palabra:palabras){
                    contador++;
                }
            }
            System.out.println("El documento tiene "+contador+" palabras");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}