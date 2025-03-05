package Gestion_Nominas;

public class Administrativos extends Gestion{
    private int antiguedad;
    private int complemento;

    public Administrativos(String dni, String nombre, double salarioBase, int antiguedad) {
        super(dni, nombre, salarioBase);
        this.antiguedad = antiguedad;
        this.complemento = 20;

    }
    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public int getComplemento() {
        return complemento;
    }
    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }

    @Override
    public double calculoSalarioFinal() {
        return salarioBase + (complemento*antiguedad);
    }
    @Override
    public String toString() {
        return "Administrativos: {" +
                "dni='" + dni +
                ", nombre='" + nombre +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + calculoSalarioFinal()+
                '}';
    }
}