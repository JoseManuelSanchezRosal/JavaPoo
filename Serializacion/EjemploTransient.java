package Serializacion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EjemploTransient {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juanote", "");
        String archivo = "Serializacion/usuarios.dat";
    }
}