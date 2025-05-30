package VentasProducto;
import java.util.Scanner;
/**
 * Desarrolla un programa que gestione una tabla de ventas de productos en dos días consecutivos. El programa debe:
 *  - Crear un array bidimensional que almacene las ventas de 3 productos durante 2 días.HECHO
 *  - Solicitar al usuario que introduzca las ventas (int) para cada producto y día.HECHO
 *  - Mostrar la tabla completa de ventas.HECHO
 *  - Calcular y mostrar el total de ventas por producto.HECHO
 *  - Determinar qué producto tuvo el mayor total de ventas.HECHO
 */
public class TablaVentas {
    public static void main(String[] args) {
        //Creamos el objeto scanner para leer de teclado:
        Scanner sc = new Scanner(System.in);
        // Creamos el array de 2 dias por 3 productos:
        int tabla[][] = new int[2][3];
        //Pedimos al usuario la cantidad de productos por dia (dia1 prod1,2y3 y dia 2 prod1,2y3):
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduzca cantidad de producto vendido día " + i + " producto " + j + ": ");
                tabla[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        //Sacamos por pantalla la tabla de 2 dias x 3 productos:
        System.out.println("\t\tP1\tP2\tP3");
        for (int i = 0; i < tabla.length; i++) {    //CON TABLA.LENGTH RECORREMOS FILAS
            System.out.print("Día" + (i + 1) + "\t");   //CON TABLA[I].LENGTH RECORREMOS COLUMNAS DE FILA ACTUAL.
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        //Vamos a calcular y mostrar el total de ventas por producto:
        System.out.println("El total de ventas del producto 1 son: " + (tabla[0][0] + tabla[1][0]) + " unidades");
        System.out.println("El total de ventas del producto 2 son: " + (tabla[0][1] + tabla[1][1]) + " unidades");
        System.out.println("El total de ventas del producto 3 son: " + (tabla[0][2] + tabla[1][2]) + " unidades");
        //Primero guardamos el total de cada producto en una variable:
        int p1 = tabla[0][0] + tabla[1][0];
        int p2 = tabla[0][1] + tabla[1][1];
        int p3 = tabla[0][2] + tabla[1][2];
        //Sacamos por pantalla el que más ventas tenga:
        if (p1 >= p2 && p1 >= p3) {
            System.out.println("El producto con mayor nº de ventas es P1 con " + p1 + " unidades");
        } else if (p2 >= p1 && p2 >= p3) {
            System.out.println("El producto con mayor nº de ventas es P2 con " + p2 + " unidades");
        } else {
            System.out.println("El producto con mayor nº de ventas es P3 con " + p3 + " unidades");
        }
    }
}