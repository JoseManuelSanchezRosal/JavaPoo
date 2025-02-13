package EjPOO_02_Electrodomestico;

public class Main02 {
    public static void main(String[] args) {

        // Prueba clase Electrodomestico
        Electrodomestico e1 = new Electrodomestico("Frigorífico", "LG", 0.88);
        System.out.println(e1);

        e1.setPotencia(0.99);
        e1.setMarca("Samsung");
        System.out.println(e1);

        int horas = 10;
        double preciokWh = 0.20;
        double consumo = e1.getConsumo(horas);
        double coste = e1.getCosteConsumo(horas, preciokWh);
        System.out.println("Ha consumido: " + consumo+ " kW en " + horas + " horas" );
        System.out.println("Debe pagar: "+ coste + " €");

        //Prueba clase Lavadora
        Lavadora lava1 = new Lavadora("LG", 0.95, 500, false);
        System.out.println(lava1);

        lava1.setAguaCaliente(true);
        System.out.println("Consumo de la lavadora en 10 horas: "+ lava1.getConsumo(10));
        System.out.println("Coste del consumo en 10 horas: "+ lava1.getCosteConsumo(10, 1));
    }
}
