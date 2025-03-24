package PruebasJunit;
//Clase Calculadora
public class FuncionCalculador {
    protected int a;
    protected int b;
//Constructor parametrizado:
    public FuncionCalculador(int a, int b) {
        this.a = a;
        this.b = b;
    }
    //Constructor vacío:
    public FuncionCalculador() {
        this.a = a;
        this.b = b;
    }
    //Funcion suma:
    public int sumar() {
        return a + b;
    }
//Funcion resta:
    public int restar() {
        return a - b;
    }
//Funcion producto:
    public int multiplicar() {
        return a * b;
    }
//Funcion cociente:
    public int dividir() {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
