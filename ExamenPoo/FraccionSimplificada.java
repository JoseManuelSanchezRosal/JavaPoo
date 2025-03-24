package ExamenPoo;
// NOTA: He intentado calcular para hacer la simplificacion pero no se me ocurre nada. Para la próxima saldrá mejor!!.
public class FraccionSimplificada extends Fraccion {

    public FraccionSimplificada(int num, int den) {
        super(num, den);


    }
    public FraccionSimplificada() {
        super();
    }
    public FraccionSimplificada(int num) {
        super(num);
    }
    @Override
    public int getNum() {
        return super.getNum();
    }
    @Override
    public void setNum(int num) {
        super.setNum(num);
    }
    @Override
    public int getDen() {
        return super.getDen();
    }
    @Override
    public void setDen(int den) {
        super.setDen(den);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public Fraccion multiplicar(Fraccion f) {
        return super.multiplicar(f);
    }
    @Override
    public Fraccion dividir(Fraccion f) {
        return super.dividir(f);
    }
    @Override
    public Fraccion sumar(Fraccion f) {
        return super.sumar(f);
    }
    @Override
    public Fraccion restar(Fraccion f) {
        return super.restar(f);
    }
//Calculo mcd:
    public int mcd() {
        int u = Math.abs(this.getNum());
        int v = Math.abs(this.getDen());
        while (v != 0) {
            int r = u % v;
            u = v;
            v = r;
        }
        return u;
    }
    public void simplificar(Fraccion f){
        int n = mcd();
        this.num = f.getNum() / n;
        this.den = f.getDen() / n;
        
    }
}
