package EjPOO_04_Servicios;

import java.time.LocalDate;
// Creamos la clase abstracta Servicio con sus atributos:
abstract class Servicio {
    protected String trabajador;//Nombre y apellidos del trabajador
    protected LocalDate fechaInicio;//Fecha de inicio del servicio
    protected String cliente;//Nombre y apellidos del cliente o nombre de empresa cliente.

    //Constructor que reciba por parámetro los 3 atributos:
    protected Servicio(String trabajador, LocalDate fechaInicio, String cliente){
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }
    protected Servicio(LocalDate fechaInicio, String cliente) {
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }

    //Getters y Setters:
    public void setTrabajador(){
        this.trabajador = trabajador;
    }
    public String getTrabajador() {
        return this.trabajador;
    }
    public void setFechaInicio(){
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaInicio(){
        return this.fechaInicio;
    }
    public void setCliente(){
        this.cliente = cliente;
    }
    public String getCliente(){
        return this.cliente;
    }

    //Medodo para calcular el coste del material:
    abstract double costeMaterial();
    //Metodo para calcular el coste de la mano de obra:
    abstract double costeManoObra();
    //Metodo para calcular el coste total:
    abstract double costeTotal();
    //Metodo para devolver una cadena con informacion detallada del coste del servicio
    abstract String detalleServicio();
}