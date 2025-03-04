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
            System.out.println("ENTRA EN IF");
            return costeMaterial() + costeManoObra() + adicional;
        } else {
            System.out.println(adicional);
            System.out.println("NO ENTRA");
            return costeMaterial() + costeManoObra();
        }
    }
    @Override
    public String detalleServicio() {
        StringBuilder sb = new StringBuilder();
        sb.append("TRABAJO DE PINTURA\n");
        sb.append("Cliente: "+getCliente()+"\n");
        sb.append("Fecha de inicio: "+ getFechaInicio()+"\n");
        sb.append("----------------------------------------\n");
        sb.append("Pintor: "+ getTrabajador()+"\n");
        sb.append("Coste Material......."+costeMaterial()+"\n");
        sb.append("Coste mano de obra..."+costeManoObra()+"\n");
        sb.append("Coste adicional......"+(costeTotal()-costeMaterial()-costeManoObra())+"\n");
        sb.append("TOTAL................"+costeTotal()+"\n");
        sb.append("----------------------------------------\n");
        return sb.toString();
    }
}