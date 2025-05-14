package EjerciciosFicheros3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ej7_BuscarPalabra {
    public static void main(String[] args) {
        File archivo = new File("EjerciciosFicheros3/datos3.txt");
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;
            String palabraBuscada = "Esto";
            int contador = 0;
            while ((linea = lector.readLine())!=null){
                String[] texto = linea.split(" ");
                contador++;
            }
            System.out.println("La palabra buscada aparece "+contador+" veces");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}