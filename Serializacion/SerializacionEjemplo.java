package Serializacion;

import java.io.*;

public class SerializacionEjemplo {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 30);
        // Creamos un objeto String que le pasaremos la ruta donde queremos guardar los datos.
        String archivo = "Serializacion/personas.dat";// ARCHIVO.DAT O .SER
        // Serializar (Guardar un objeto en un archivo binario) le pasamos por parámetro el archivo en OUTPUT (salida):
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(p1);
            System.out.println("Objeto serializado: " + p1);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo" + e.getMessage());
        }

        // Deserializar (Cargar/leer un objeto desde un archivo binario:
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            Persona p2 = (Persona) in.readObject();

            System.out.println("Objeto deserializado: " + p2);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}