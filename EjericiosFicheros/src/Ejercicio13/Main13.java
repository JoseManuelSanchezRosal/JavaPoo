package Ejercicio13;

import java.io.File; //REPRESENTA LA RRUTA DEL ARCHIVO O DIRECTORIO EN EL SISTEMA DE ARCHIVOS
import java.io.FileInputStream; //SE USA PARA LEER DATOS BINARIOS DESDE UN ARCHIVO
import java.io.FileOutputStream; //SE USA PARA ESCRIBIR DATOS BINARIOS EN UN ARCHIVO
import java.io.IOException;

//Ejercicio 13: Copiar un archivo binario (imagen o vídeo)
//Crea un programa que copie un archivo binario (por ejemplo, una imagen .jpg o un vídeo .mp4) de un directorio a otro sin modificar su contenido.
public class Main13 {
    public static void main(String[] args) {
        // CREAMOS LAS RUTAS ORIGINAL Y DE COPIA DE NUESTRAS IMAGENES:
        File archivoFuente = new File("EjericiosFicheros/src/javaIO.webp");
        File archivoDestino = new File("EjericiosFicheros/src/copiajavaIO.webp");

        // ABRIMOS TRY-CATCH PARA OPERAR CON LECTURA Y ESCRITURA DE ARCHIVOS DE LA CLASE FILE
        // Intentamos abrir los archivos de entrada y salida para copiar el archivo (en este caso, una imagen)
        try (FileInputStream archivoOriginal = new FileInputStream(archivoFuente); // Archivo de origen para leer
             FileOutputStream archivoCopia = new FileOutputStream(archivoDestino)) { // Archivo de destino donde vamos a escribir la copia

            // Creamos un buffer de 1024 bytes para almacenar bloques de datos que leemos desde el archivo de entrada
            byte[] bloqueDeDatos = new byte[1024]; // Buffer que almacenará temporalmente los datos leídos en bloques de 1024 bytes

            // Variable que almacenará la cantidad de bytes leídos en cada iteración
            int cantidadBytesLeidos;

            // Mientras haya datos por leer, copiamos el archivo en bloques de 1024 bytes
            while ((cantidadBytesLeidos = archivoOriginal.read(bloqueDeDatos)) != -1) { // Leemos hasta que no haya más datos (lectura exitosa devuelve un valor >= 0)
                // Escribimos en el archivo de destino el bloque de datos leído, comenzando desde la posición 0 del buffer
                // El parámetro cantidadBytesLeidos indica cuántos bytes del buffer deben ser escritos
                archivoCopia.write(bloqueDeDatos, 0, cantidadBytesLeidos); // Escribimos en el archivo de salida
                // Explicación de parámetros de write():
                // - bloqueDeDatos: El bloque de bytes leídos que contiene la información a escribir.
                // - 0: Es la posición inicial en el buffer desde la que se comienza a escribir (siempre comenzamos desde el inicio).
                // - cantidadBytesLeidos: Es el número de bytes que vamos a escribir, basado en lo que se haya leído.
            }
        } catch (IOException errorDeEjecucion) {
            // En caso de error, mostramos el mensaje de error
            System.out.println("Error al copiar el archivo: " + errorDeEjecucion.getMessage());
        }
        System.out.println("Imagen copiada con éxito.");
    }
}
