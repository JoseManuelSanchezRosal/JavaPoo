package Gestion_Nominas;

public class MainNominas {
    public static void main(String[] args) {
        Trabajadores analista1 = new Analistas("122555222", "josema",1500);
        System.out.println(analista1.calculoSalarioFinal());
        Trabajadores programador1 = new Programadores("132547", "Juan", 2000);
        System.out.println(programador1.calculoSalarioFinal());
        Trabajadores adm1 = new Administrativos("98645", "Anita", 1200, 5);
        System.out.println(adm1.calculoSalarioFinal());
        Trabajadores aux1 = new Auxiliares("78465","Rossame", 2000);
        System.out.println(aux1.calculoSalarioFinal());
        System.out.println("Aqui la lista de trabajadores en empresa");
        System.out.println("-------------------------------------------------------------------------------");
        Empresa emp1 = new Empresa(122321, "ONG");
        emp1.agregarTrabajador(new Analistas("8644165","Manu",2500));
        emp1.agregarTrabajador(new Programadores("8654","Sebas", 2500));
        emp1.agregarTrabajador(new Auxiliares("864","Ana", 2500));
        emp1.agregarTrabajador(new Administrativos("864","Carlos", 2500, 5));
        emp1.mostrarTrabajadores();
        System.out.println(emp1);
    }
}
