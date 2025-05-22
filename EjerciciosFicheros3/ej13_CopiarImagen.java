package EjerciciosFicheros3;

import java.io.*;

//Ejercicio 13: Copiar un archivo binario (imagen o vídeo)
//Crea un programa que copie un archivo binario (por ejemplo, una imagen .jpg o un vídeo .mp4) de un directorio a otro sin modificar su contenido.
public class ej13_CopiarImagen {
    public static void main(String[] args) {
        try {
            FileInputStream original = new FileInputStream("EjerciciosFicheros3/playa.jpeg");
            FileOutputStream copia = new FileOutputStream("EjerciciosFicheros3/playaCopis.jpeg");
            int character;
            while ((character = original.read())!=-1){
                copia.write(character);
            }
            original.close();
            copia.close();
            System.out.println("Imagen copiada correctamente");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}