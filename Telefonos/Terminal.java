package Telefonos;
//Implementa la clase Terminal. Un terminal tiene asociado un número. Los terminales se pueden llamar unos a otros, y el tiempo de conversación corre para ambos. El programa principal debe crear varios terminales, realizar llamadas entre ellos y mostrar el tiempo de conversación de cada uno
public class Terminal {
    private int numero;
    private int tiempo;

    public Terminal(int numero) {
        this.numero = numero;
        this.tiempo = tiempo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public void llama(Terminal destinatario, int segundos){
        this.tiempo+=segundos;
        destinatario.tiempo+=segundos;

    }

    @Override
    public String toString() {
        return "Terminal{" +
                "numero=" + numero +
                ", tiempo=" + tiempo +" segundos "+
                '}';
    }
}
