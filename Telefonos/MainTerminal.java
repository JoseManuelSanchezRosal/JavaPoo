package Telefonos;

public class MainTerminal {
    public static void main(String[] args) {
        Terminal t1 = new Terminal(111111111);
        Terminal t2 = new Terminal(222222222);
        Terminal t3 = new Terminal(333333333);
        Terminal t4 = new Terminal(444444444);
        t1.llama(t2, 200);
        System.out.println(t1);
        System.out.println(t2);

        Movil m1 = new Movil(22255588, "rata");
        System.out.println(m1);
        m1.llama(t1, 400);
        System.out.println(m1);
        Movil m2 = new Movil(22222222, "mono");
        m2.llama(m1,400);
        System.out.println(m2);
        m2.llama(m1,400);
        System.out.println(m2);
    }

}
