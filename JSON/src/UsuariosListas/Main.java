package UsuariosListas;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
/* Parte II: Añade un campo int edad a la clase llamada UsuariosListas.Usuario y por tanto, modifica el JSON.
* Modifica la lista para que se lea desde techado antes de guardarla
* Crea un metodo que recorra la lista y muestre los usuarios mayores de 30 años
*
* Ejemplo de uso de consola:
* ¿Cuantos usuarios quieres introducir? 4
* Introduce los datos del usuario 1: nombre, email, edad etc...
*
* Usuarios leido:
* Usuarios mayores de 30 años:
* Usuarios {nombre:"pepe", email:"pepe@gmail.com", edad: 34}
* */
public class Main {
    public static void main(String[] args) throws IOException {
        Usuario user = new Usuario("Jose", "jose@gmail.com");

        ObjectMapper mapper = new ObjectMapper();

        //CREAR DOCUMENTO JSON PASANDO EL OBJETO user:
        //mapper.writeValue(new File("JSON/src/javausuario.json"), user);
        //System.out.println("UsuariosListas.Usuario guardado en JSON: "+ user);

        //LEER DESDE JSON Y CONVERTIRLO A OBJETO:
        //UsuariosListas.Usuario user2 = mapper.readValue(new File("JSON/src/javausuario.json"), UsuariosListas.Usuario.class);
        //System.out.println("leemos desde archivo JSON y lo convertimos a objeto: " + user2);

        //Después de introducir a mano otro usuario con su email en nuestro .json, leer con un foreach:
        Usuario[] usuarios = mapper.readValue(new File("JSON/src/javausuario.json"), Usuario[].class);
        for (Usuario u : usuarios) {
            System.out.println("UsuariosListas.Usuario/s leído/s desde .JSON: " + u);
        }
    }
}