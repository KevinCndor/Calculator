package ec.edu.epn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;
    @Before
    public void setUp() {
        c = new Calculator();
    }

    @Test
    public void given_two_numbers_when_add_then_ok(){
        assertEquals(15,c.suma(10,5));
    }

    @Test
    public void given_two_numbers_when_substraction_then_ok(){
        assertEquals(5,c.resta(10,5));
    }

    @Test
    public void given_two_numbers_when_multiplication_then_ok(){
        assertEquals(50,c.multiplicacion(10,5));
    }

    @Test
    public void given_two_numbers_when_division_then_ok(){
        assertEquals(2,c.division(10,5));
    }


    /* Unit test para la nueva operación*/
    @Test
    public void given_a_number_when_square_root_then_ok(){
        assertEquals(10.0,c.raizCuadrada(100),0.0001);
    }

}