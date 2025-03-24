package PruebasJunit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FuncionCalculadorTest {

    @Test
    void testSuma() {
        FuncionCalculador calc = new FuncionCalculador(10, 3);
        assertEquals(8, calc.sumar());
    }

    @Test
    void testResta() {
        FuncionCalculador calc = new FuncionCalculador(10, 4);
        assertEquals(6, calc.restar());
    }

    @Test
    void testMultiplicacion() {
        FuncionCalculador calc = new FuncionCalculador(6, 2);
        assertEquals(12, calc.multiplicar());
    }

    @Test
    void testDivision() {
        FuncionCalculador calc = new FuncionCalculador(10, 2);
        assertEquals(5, calc.dividir());
    }

    @Test
    void testDivisionPorCero() {
        FuncionCalculador calc = new FuncionCalculador(10, 0);
        assertThrows(ArithmeticException.class, calc::dividir);
    }
}
