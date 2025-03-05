package Gestion_Nominas;

public class Auxiliares extends Gestion{
    private int complemento;

    public Auxiliares(String dni, String nombre, double salarioBase) {
        super(dni, nombre, salarioBase);
        this.complemento = 100;
    }

    public int getComplemento() {
        return complemento;
    }
    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }

    @Override
    public double calculoSalarioFinal() {
        return salarioBase + complemento;
    }
    @Override
    public String toString() {
        return "Auxiliares: {" +
                "dni='" + dni +
                ", nombre='" + nombre +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + calculoSalarioFinal()+
                '}';
    }
}