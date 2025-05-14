package EjerciciosFicheros3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Ejercicio 8: Contar la cantidad de líneas en un archivo
//Crea un programa que cuente cuántas líneas tiene el archivo datos.txt y muestre el total.
public class ej8_ContarLineas {
    public static void main(String[] args) {
        File archivo = new File("EjerciciosFicheros3/datos3.txt");
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;
            int linasContenido = 0;
            int lineasVacias = 0;
            int totalLineas = 0;
            while ((linea = lector.readLine())!=null){
                if(linea.isEmpty()){
                    lineasVacias++;
                }else {
                    linasContenido++;
                }
            }
            System.out.println("Lines con contenido = "+linasContenido);
            System.out.println("Lineas vacias = "+lineasVacias);
            totalLineas = lineasVacias + linasContenido;
            System.out.println("Lineas total = "+totalLineas);

        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}