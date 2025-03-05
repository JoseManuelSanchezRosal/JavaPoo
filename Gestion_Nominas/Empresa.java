package Gestion_Nominas;

import java.util.ArrayList;

public class Empresa {
    private int cif;
    private String nombre;
    private ArrayList<Trabajadores> trabajadores;

    public Empresa(int cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
        this.trabajadores = new ArrayList<>();
    }

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
    public void agregarTrabajador(Trabajadores trabajador){
        trabajadores.add(trabajador);
    }

    public void mostrarTrabajadores(){
        for (Trabajadores i: trabajadores){
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return getNombre()+": {" +
                "cif=" + cif +
                ", nombre='" + nombre +
                ",\n trabajadores=" + trabajadores +
                '}';
    }
}