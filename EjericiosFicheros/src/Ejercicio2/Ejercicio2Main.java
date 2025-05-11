package Ejercicio2;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//Ejercicio 2: Leer un archivo carácter por carácter
//Escribe un programa en Java que lea el archivo datos.txt carácter por carácter y muestre el contenido en la pantalla.
public class Ejercicio2Main {
    public static void main(String[] args) {
        // Nombre del archivo a leer (SE PUEDE PONER RUTA DE DIFERENTES PACKAGES):
        String nombreArchivo = "EjericiosFicheros/src/datos.txt";
        File archivo = new File(nombreArchivo);

        // Usar FileReader para leer el archivo carácter por carácter
        try (FileReader lector = new FileReader(archivo)) {
            int caracter;
            // Leer carácter por carácter hasta el final del archivo (EL FINAL DEL ARCHIVO LO INDICA EL -1)
            while ((caracter = lector.read()) != -1) {
                // Imprimir el carácter leído
                System.out.print((char) caracter);  // Convertir de int a char
            }
            System.out.println();//Para mover a la siguiente linea después de imprimir todo el contenido
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());

        }
        System.out.println("Mensajes leidos desde el ejercicio 2 caracter por caracter");
    }
}