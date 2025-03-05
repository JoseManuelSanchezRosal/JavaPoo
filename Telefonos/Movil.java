package Telefonos;

public class Movil extends Terminal{
    private String tarifa;
    private double apagar;

    public Movil(int numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.apagar = apagar;

    }
    public String getTarifa() {
        return tarifa;
    }
    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }
    public double getApagar() {
        return apagar;
    }
    public void setApagar(double apagar) {
        this.apagar = apagar;
    }

    @Override
    public void llama(Terminal destinatario, int segundos) {
        super.llama(destinatario, segundos);

        if(this.tarifa == "rata"){
            this.apagar += (segundos/60) * 0.06;
        } else if (this.tarifa == "mono") {
            this.apagar += (segundos/60) * 0.12;
        }else if(this.tarifa == "bisonte"){
            apagar += (segundos/60) * 0.30;
        }else{
            System.out.println("Tarifa errónea");
        }
    }

    @Override
    public String toString() {
        return "movil{" +
                "numero = " + getNumero() +
                ", tiempo = " + getTiempo() +" segundos "+
                ", coste tarifa = "+apagar+" euros "+
                '}';
    }

}


