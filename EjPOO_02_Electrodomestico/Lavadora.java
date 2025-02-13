package EjPOO_02_Electrodomestico;

public class Lavadora extends Electrodomestico{

    private double precio;
    private boolean aguaCaliente;


    public Lavadora(String marca, double potencia) {
        super("Lavadora", marca, potencia);
        aguaCaliente = false;
    }

    public Lavadora(String marca, double potencia, double precio, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "marca='" + marca + '\'' +
                ", potencia=" + potencia +
                ", precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }

    @Override
    public double getConsumo(int horas) {
        if(aguaCaliente) {
            return (potencia + potencia*0.20)*horas;
        } else {
            return potencia*horas;
        }
    }

    public double getCosteConsumo(int horas, double costeHora) {
        return getConsumo(horas)*costeHora;
    }
}
