import java.util.Scanner;

public class MENU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 1;

        while(op != 0){
            System.out.print(
                    "=================================\n" +
                            "       *** MENÚ PRINCIPAL ***    \n" +
                            "=================================\n" +
                            "1. Opción 1\n" +
                            "2. Opción 2\n" +
                            "3. Opción 3\n" +
                            "0. Salir\n" +
                            "=================================\n" +
                            "Seleccione una opción (1-4): "
            );
            op = sc.nextInt();
            if (op == 0){
                System.out.println("Saliendo del programa");
                break;
            }
            switch (op){
                case 1:
                    System.out.println("has seleeccionado la opcion 1");
                    break;
                case 2:
                    System.out.println("has seleccionado la opcion 2");
                    break;
                case 3:
                    System.out.println("has seleccionado la opcion 3");
                    break;
                default:
                    System.out.println("La opcion no es correcta");
                    continue;
            }
        }
    }
}