package EjerciciosFicheros2.Serializable;

import java.io.*;

public class PersonaSerializable {
    public static void main(String[] args) {
        Persona per1 = new Persona("Jose",39,"jose@gmail.com");
        File ruta = new File("EjerciciosFicheros2/Serializable/persona.dat");

        try {
            ObjectOutputStream serializar = new ObjectOutputStream(new FileOutputStream(ruta));
            serializar.writeObject(per1);
            System.out.println("Objeto Serializado "+ per1);

            ObjectInputStream deserializar = new ObjectInputStream(new FileInputStream("EjerciciosFicheros2/Serializable/persona.dat"));
            Persona per2 = (Persona) deserializar.readObject();
            System.out.println("Objeto "+per2+" deserializado");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}