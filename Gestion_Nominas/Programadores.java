package Gestion_Nominas;

import javax.swing.*;

public class Programadores extends Informaticos{
    private int complemento;

    public Programadores(String dni, String nombre, double salarioBase) {
        super(dni, nombre, salarioBase);
        this.complemento = 15;
    }
    public int getComplemento() {
        return complemento;
    }
    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }
    public double calculoSalarioFinal() {
        return salarioBase + ((salarioBase*complemento)/100);
}
    @Override
    public String toString() {
        return "Programadores: {" +
                "dni='" + dni +
                ", nombre='" + nombre +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + calculoSalarioFinal()+
                '}';
    }
}