package EjPOO_03_Supermercado;

public class Detergente implements ConDescuento, EsLiquido {

    private String marca;
    private double precio;
    private double descuento;
    private String tipoEnvase;
    private double volumen;

    // Constructor


    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setDescuento(double des){
        descuento = des;
    }
    @Override
    public double getDescuento() {
        return descuento;
    }
    @Override
    public double getPrecioDescuento() {
        return precio - (precio - descuento);
    }

    @Override
    public void setVolumen(double v) {
        volumen = v;
    }
    @Override
    public double getVolumen() {
        return volumen;
    }
    @Override
    public void setTipoEnvase(String env){
        tipoEnvase = env;
    }
    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public String toString() {
        return "Detergente{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                ", volumen=" + volumen +
                '}';
    }
}
