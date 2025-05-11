package EjerciciosFicheros2;

import java.io.*;

// Ejercicio 6: Copiar el contenido de un archivo a otro
// Crea un programa que copie el contenido de `datos.txt` en un nuevo archivo llamado `copia.txt`, manteniendo el mismo formato.
public class ej6_Copiar_txt {
    public static void main(String[] args) {
        // 1 DECLARAMOS RUTA ORIGINAL
        String ruta_original = new String("EjerciciosFicheros2/datos.txt");
        // 2 DECLARAMOS RUTA NUEVA
        String ruta_nueva = new String("EjerciciosFicheros2/datosnuevo.txt");
        // 3 DECLARAMOS ARCHIVO NUEVO
        File archivoNuevo = new File(ruta_nueva);

        try {
            if (archivoNuevo.exists()) {
                System.out.println("El archivo ya existe");
            }else{
                archivoNuevo.createNewFile();
                System.out.println("Archivo "+archivoNuevo.getName()+" creado");

                // 4 ENVOLVEMOS LA RUTA ORIGINAL EN BUFFER Y FILEREADER PARA SU LECTURA
                BufferedReader lector = new BufferedReader(new FileReader(ruta_original));
                String linea;
                // 5 CREAMOS OBJETO SB PARA APENDAR LINEA POR LINE LO QUE BUFFERREADER OBTENGA DE LA RUTA ORIGINAL
                StringBuilder sb = new StringBuilder();
                // 6 RECORREMOS EL DOCUMENTO LINEA POR LINEA HASTA EL FINAL, ANADIENDO AL SB CADA UNA DE ELLAS
                while ((linea = lector.readLine()) !=null){
                    sb.append(linea+"\n");
                }
                // 7 ENVOLVEMOS LA RUTA NUEVA EN UN BUFFERED Y FILEWRITER
                BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta_nueva));
                // 8 VOLCAMOS EN ESCRITOR EL CONTENIDO DEL SB (PASANDOLO A TOSTRING)
                escritor.write(sb.toString());

                lector.close();//CERRAMOS LECTOR
                escritor.close();//CERRAMOS ESCRITOR
            }
        }catch (IOException e){
            System.out.println("Error "+ e.getMessage());
        }
    }
}