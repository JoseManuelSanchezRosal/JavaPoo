package EjerciciosFicheros2;

import java.io.*;
import java.util.Scanner;

//Ejercicio 7: Buscar una palabra en un archivo
// Escribe un programa que busque una palabra específica dentro del archivo `datos.txt` e indique cuántas veces aparece.
public class ej7_Buscar_Palabras_Archivo {
    public static void main(String[] args) {
        String ruta = new String("EjerciciosFicheros2/datos.txt");
        File archivo = new File(ruta);
        Scanner sc = new Scanner(System.in);

        try{
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            String linea;
            int contador = 0;
            System.out.println("Introduce la palabra a buscar :");
            final String PALABRA_BUSCADA = sc.nextLine();

            while ((linea = lector.readLine()) != null) {// LEE UNA LINEA DEL ARCHIVO DE TEXTO Y LA GUARDA EN LA VARIABLE LINEA
                String [] texto_leido = linea.split(" ");// DIVIDE LA LINEA EN PALABRAS DONDE HAYA ESPACIOS Y LAS GUARDA EN UN ARRAY
                for(String palabra : texto_leido){// RECORREMOS EL ARRAY DE TEXTO PALABRA POR PALABRA
                    if(!palabra.isEmpty()){// SI LA PALABRA NO ESTA VACIA (dos espacios seguidos)
                        if(palabra.equalsIgnoreCase(PALABRA_BUSCADA))
                            contador++;
                    }
                }
            }
            lector.close();
            System.out.println("La palabra buscada '"+ PALABRA_BUSCADA+"' en el archivo "+ archivo.getName()+" aparece "+contador+" veces");
        }catch (IOException e){
            System.out.println("Error "+ e.getMessage());
        }
    }
}