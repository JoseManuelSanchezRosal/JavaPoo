package EjerciciosFicheros2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// Ejercicio 13: Copiar un archivo binario (imagen o vídeo)**
// Crea un programa que copie un archivo binario (por ejemplo, una imagen `.jpg` o un vídeo `.mp4`) de un directorio a otro sin modificar su contenido.
public class ej13_Copiar_Imagen {
    public static void main(String[] args) {
        File original = new File("EjerciciosFicheros2/playa.jpeg");
        File copia = new File("EjerciciosFicheros2/playacopia.jpeg");

        try (FileInputStream lectura = new FileInputStream(original);
             FileOutputStream escritura = new FileOutputStream(copia)){
            byte[] buffer = new byte[512];
            int bytesLeidos;
            while ((bytesLeidos = lectura.read(buffer))!= -1){
                escritura.write(buffer,0,bytesLeidos);
            }
            System.out.println("Imagen copiada");
        } catch (Exception e) {
            System.out.println("Error "+ e.getMessage());
        }
    }
}