package ec.edu.epn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculatorTestWithParameters {
    private int num1, num2, expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{20,20,40});
        objects.add(new Object[]{10,2,12});
        objects.add(new Object[]{2,5,7});
        objects.add(new Object[]{30,5,35});
        objects.add(new Object[]{525,20,545});
        return objects;
    }

    public CalculatorTestWithParameters(int num1, int num2, int expected) {
        this.num1 = num1;
        this.num2 = num2;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_add_then_addition(){
        Calculator c = new Calculator();
        assertEquals(expected,c.suma(num1,num2));
    }


}