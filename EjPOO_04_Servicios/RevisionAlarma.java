package EjPOO_04_Servicios;
import java.time.LocalDate;
//Subclase Revision Alarmas con su atributo nº alarmas:
public class RevisionAlarma extends Servicio {
    private int alarmas;
    private String trabajador;

    //Contructor parametrizado de atributos clase abstracta y la heredada:
    public RevisionAlarma( LocalDate fechaInicio, String cliente, int alarmas) {
        super( fechaInicio, cliente);
        this.alarmas = alarmas;
        this.trabajador = "Revisor Especialista Contraincendios";
    }
    @Override
    public String getTrabajador() {
        return trabajador;
    }
    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }
    public void SetAlarmas() {
        this.alarmas = alarmas;
    }
    public int getAlarmas() {
        return this.alarmas;
    }
    @Override
    double costeMaterial() {
        return 0;
    }
    @Override
    double costeManoObra() {
        return (getAlarmas() / 3) * 40;
    }
    @Override
    double costeTotal() {
        return (getAlarmas() / 3) + 40;
    }
    @Override
    public String detalleServicio() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: " + getCliente()+"\n");
        sb.append("Fecha revisión: " + fechaInicio+"\n");
        sb.append("-------------------------------\n");
        sb.append("Total: " + costeTotal()+"\n");
        return sb.toString();
    }
}