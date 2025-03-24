package ExamenPoo;
//Clase Fracción con sus dos atributos:
public class Fraccion {
    protected int num;
    protected int den;
    //Constructor f1 y f2:
    public Fraccion(int num, int den) {
        this.num = num;
        this.den = den;
    }
    //Constructor f3:
    public Fraccion(){
        this.num = 0;
        this.den = 1;
    }
    //Constructor f4
    public Fraccion(int num){
        this.num = num;
        this.den = 1;
    }
    //Getters y Setters:
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getDen() {
        return den;
    }
    public void setDen(int den) {
        this.den = den;
    }
    //Metodo toString del objeto:
    @Override
    public String toString() {
        return "" +
                "" + num +
                "/" + den +' ';
    }
        //Metodo producto:
    public Fraccion multiplicar(Fraccion f){
        int numerador = this.num * f.num;
        int denominador = this.den * f.den;
        Fraccion ff = new Fraccion(numerador, denominador);
        return ff;
    }
    //Metodo cociente:
    public Fraccion dividir(Fraccion f){
        int numerador = this.num * f.den;
        int denominador = this.den * f.num;
        Fraccion ff = new Fraccion(numerador,denominador);
        return ff;
    }
    //Metodo suma:
    public Fraccion sumar(Fraccion f){
        int numerador = (this.num * f.den)+(this.den * f.num);
        int denominador = this.den * f.den;
        Fraccion ff = new Fraccion(numerador, denominador);
        return ff;
    }
    //Metodo resta:
    public Fraccion restar(Fraccion f){
        int numerador = (this.num * f.den)-(this.den * f.num);
        int denominador = this.den * f.den;
        Fraccion ff = new Fraccion(numerador, denominador);
        return ff;
    }
}