package EjerciciosFicheros2.Serializable;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int edad;
    private String email;

    public Persona(){
    }

    public Persona (String nombre, int edad, String email){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                '}';
    }
}