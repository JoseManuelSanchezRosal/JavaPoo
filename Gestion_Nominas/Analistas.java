package Gestion_Nominas;

public class Analistas extends Informaticos{
    private int complemento;

    public Analistas(String dni, String nombre, double salarioBase) {
        super(dni, nombre, salarioBase);
        this.complemento = 30;
    }
    public int getComplemento() {
        return complemento;
    }
    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }

    @Override
    public double calculoSalarioFinal() {
        return salarioBase + ((salarioBase*complemento)/100);
    }

    @Override
    public String toString() {
        return "Analistas: {" +
                "dni='" + dni +
                ", nombre='" + nombre +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + calculoSalarioFinal()+
                '}';
    }
}