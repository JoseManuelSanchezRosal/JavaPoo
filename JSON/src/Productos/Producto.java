package Productos;
/*OBJETIVO: Crear un objeto Producto con nombre y precio. Guardarlo en un JSON y volver a leerlo.
* PASOS: (Modularizar convenientemente)
* 1. Crear la clase Producto.
* 2. Crear un objeto Producto en un programa Main
* 3. Guardar el objeto u objetos en un JSON
* 4. Leer el archivo
* 5. Mostrar en consola los datos
* */

//1.
public class Producto {
    private String nombre;
    private int precio;

    Producto(){
    }
    Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
