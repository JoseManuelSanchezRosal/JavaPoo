package EjPOO_04_Servicios;
import java.time.LocalDate;
//Subclase Revision Alarmas con su atributo nº alarmas:
public class RevisionAlarma extends Servicio{
    private int alarmas;
    //Contructor parametrizado de atributos clase abstracta y la heredada:
    public RevisionAlarma(String trabajador, LocalDate fechaInicio, String cliente, int alarmas){
        super(trabajador, fechaInicio, cliente);
        this.alarmas = alarmas;
        this.trabajador = "Revisor Especialista Contraincendios";
    }
    public void SetAlarmas(){
        this.alarmas = alarmas;
    }
    public int getAlarmas(){
        return this.alarmas;
    }

    @Override
    double costeMaterial() {
        return 0;
    }
    @Override
    double costeManoObra() {
        return (getAlarmas()/3)*40;
    }
    @Override
    double costeTotal() {
        return (getAlarmas()/3)+40;
    }
    @Override
    void detalleServicio() {
        System.out.println("Cliente: " +getCliente());
        System.out.println("Fecha revisión: "+fechaInicio);
        System.out.println("-------------------------------");
        System.out.println("Total: "+costeTotal());
    }
}