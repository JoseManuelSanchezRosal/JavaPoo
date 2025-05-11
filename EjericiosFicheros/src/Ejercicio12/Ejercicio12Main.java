package Ejercicio12;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Ejercicio 12: Leer un archivo CSV y mostrar los datos
//Crea un programa que lea un archivo CSV llamado datos.csv y muestre su contenido en formato tabla.
public class Ejercicio12Main {
    public static void main(String[] args) {
        // Declaramos la ruta del archivo "datos.csv" como un String:
        String rutaArchivo = "EjericiosFicheros/src/datos.csv";
        try {
            // SI QUEREMOS LEER LINEA POR LINEA SE RECOMIENDA ENCAPSULAR LA RUTA(FILE) EN UN BUFFERED READER
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            File archivo = new File(rutaArchivo);

            // DECLARAMOS UNA VARIABLE DONDE GUARDAREMOS LAS PALABRAS DE CADA LINEA
            String linea;
            System.out.println("Contenido del CSV "+archivo.getName()+": ");
            // CON ESL !=NULL LEEMOS HASTA QUE NO QUEDEN LINEAS:
            while ((linea = lector.readLine()) != null){
                // CREAMOS UN ARRAY DONDE GUARDAREMOS CADA CAMPO DE CADA FILA
                // el metodo linea.split(",") se usa para dividir cada fila en elementos mas pequeños usando de separador la "coma"(,):
                String[] texto = linea.split(",");
                // RECORREMOS CADA PALABRA DE LA FILA
                for (String palabra : texto){
                    if (palabra.isEmpty()){
                        System.out.printf("                         ");//IMPRIME 25 ESPACIOS EN BLANCO SI NO HAY PALABRA
                    }else{
                        System.out.printf("%-25s", palabra);//CON PRINTF SE IMPRIME CON FORMATO DE 25 ESPACIOS MAS LA PALABRA O CONTENIDO (ESPECIALMENTE UTIL PARA ALINEAR COLUMNAS)
                    }
                }
                // SALTO DE LINEA AL FINAL DE CADA REGISTRO
                System.out.println();
            }
        } catch (IOException e) {
            // SI SE GENERA ALGUN TIPO DE ERROR LO CAPTURAMOS Y MOSTRAMOS POR PANTALLA
            System.out.println("Error: "+e.getMessage());
        }
    }
}