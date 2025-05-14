package EjerciciosFicheros3;

import java.io.*;

//Ejercicio 6: Copiar el contenido de un archivo a otro
//Crea un programa que copie el contenido de datos.txt en un nuevo archivo llamado copia.txt, manteniendo el mismo formato.
public class ej6_CopiarContenidoArchivo {
    public static void main(String[] args) {
        try {
            BufferedReader origen = new BufferedReader(new FileReader("EjerciciosFicheros3/datos3.txt"));
            BufferedWriter destino = new BufferedWriter(new FileWriter("EjerciciosFicheros3/otro.txt"));
            String linea;
            while ((linea = origen.readLine())!=null){
                destino.write(linea);
                destino.newLine();
            }
            origen.close();
            destino.close();
            System.out.println("Contenido copiado");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}