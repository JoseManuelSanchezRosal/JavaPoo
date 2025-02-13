package EjPOO_03_Supermercado;

import java.time.LocalDate;

public class Cereales implements EsAlimento{

    private String marca;
    private String tipoCereal;
    private double precio;
    private LocalDate caducidad;


    public Cereales(String marca, double precio, String tipoCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        caducidad = fc;
    }

    @Override
    public int getCalorias() {
        // A tener en cuenta: las calorías serán las siguientes: 5 si el cereal es espelta,
        //8 si es maíz, 12 si es trigo, y 15 en los demás casos.

        if (tipoCereal.equalsIgnoreCase("espelta")) {
            return 5;
        } else if (tipoCereal.equalsIgnoreCase("trigo")) {
            return 12;
        } else if (tipoCereal.equalsIgnoreCase("maíz")) {
            return 8;
        } else {
            return 15;
        }
    }

    @Override
    public String toString() {
        return "Cereales{" +
                "marca='" + marca + '\'' +
                ", tipoCereal='" + tipoCereal + '\'' +
                ", precio=" + precio +
                ", caducidad=" + caducidad +
                //", calorias=" + calorias +
                '}';
    }
}
