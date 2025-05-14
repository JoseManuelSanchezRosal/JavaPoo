package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LectorCSV {
    public static void main(String[] args) {
        // TODO: Leer el archivo "resources/datos.csv" y mostrar su contenido formateado por columnas
        File csv = new File("resources/datos.csv");

        try {
            BufferedReader lector = new BufferedReader(new FileReader(csv));
            String linea;

            while ((linea = lector.readLine()) !=null){
                String[] texto = linea.split(",");
                for (String palabra : texto){
                    if(palabra.isEmpty()){
                        System.out.printf("               ");
                    }else {
                        System.out.printf("%-15s", palabra);
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error "+ e.getMessage());
        }
    }
}