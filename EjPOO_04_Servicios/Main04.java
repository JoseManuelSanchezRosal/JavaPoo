package EjPOO_04_Servicios;

import java.time.LocalDate;

public class Main04 {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2025, 3, 3);
        TrabajoPintura pintor1 = new TrabajoPintura("Jose Manuel", fecha, "Evirom", 49, 10);
        System.out.println("El precio del coste material es de: "+pintor1.costeMaterial());
        System.out.println("El precio de la mano de obra es de: "+pintor1.costeManoObra());
        System.out.println("El coste total es de :"+pintor1.costeTotal());
        System.out.println(pintor1.detalleServicio());
        LocalDate fecha2 = LocalDate.of(2025, 4, 3);
        RevisionAlarma revisor1 = new RevisionAlarma(fecha2,"Avila", 56);
        System.out.println(revisor1.detalleServicio());
        System.out.println(revisor1.getTrabajador());
        //El PRINT del detalle del servicio da error
    }
}