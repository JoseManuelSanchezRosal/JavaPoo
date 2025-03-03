package EjPOO_04_Servicios;

import java.time.LocalDate;

public class Main04 {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2025, 3, 3);
        TrabajoPintura pintor1 = new TrabajoPintura("Jose Manuel", fecha, "Evirom", 49, 10);
        System.out.println("El precio del coste material es de: "+pintor1.costeMaterial());
        System.out.println("El precio de la mano de obra es de: "+pintor1.costeManoObra());
        System.out.println("El coste total es de :"+pintor1.costeTotal());
        //El PRINT del detalle del servicio da error
    }
}