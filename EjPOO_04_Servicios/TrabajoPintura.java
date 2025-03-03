package EjPOO_04_Servicios;
import java.time.LocalDate;
//Creamos clase trabajoPintura que hereda o extiende de la clase Servicio
public class TrabajoPintura extends Servicio {
    private double superficie;
    private double precioPintura;

    //Constructo que recibe por parámetros los atributos heredados y luegos los de la propia subclase:
    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    //Getters y setters:
    public double getSuperficie() {
        return this.superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return this.precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

    @Override
    double costeMaterial() {
        return (superficie / 7.8) * precioPintura;
    }

    @Override
    double costeManoObra() {
        return (superficie / 10) * 9.5;
    }

    @Override
    double costeTotal() {
        double adicional = 0;
        if (this.superficie < 50) {
            adicional = ((costeMaterial() + costeManoObra()) * 15) / 100;
            System.out.println(adicional);
            return costeManoObra() + costeManoObra() + adicional;

        } else {
            System.out.println(adicional);
            return costeMaterial() + costeManoObra();
        }
    }

    @Override
    public void detalleServicio() {
        System.out.println("TRABAJO DE PINTURA");
        System.out.println("Cliente: "+ getCliente());
        System.out.println("Fecha de inicio: "+ getFechaInicio());
        System.out.println("----------------------------------------");
        System.out.println("Pintor: "+ getTrabajador());
        System.out.println("Coste Material......."+costeMaterial());
        System.out.println("Coste mano de obra..."+costeManoObra());
        System.out.println("Coste adicional....COMO HACER..");
        System.out.println("TOTAL.............."+costeTotal());
        System.out.println("----------------------------------------");
    }
}