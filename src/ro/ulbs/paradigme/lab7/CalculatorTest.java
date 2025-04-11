package ro.ulbs.paradigme.lab7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.ulbs.paradigme.lab6.DoubleCalculator;
import ro.ulbs.paradigme.lab6.IntCalculator;

public class CalculatorTest {
     private DoubleCalculator calculator = new DoubleCalculator(0);
    private IntCalculator icalculator = new IntCalculator(0);//trebe instantiata
    @BeforeEach // aceasta adnotare determina ca metoda de mai jos sa se execut inaintea fiecaru @Test
    public void setup() {
        calculator = new DoubleCalculator(0.0);
    }
    @Test
    void testAddDoubleCalculator(){
        calculator.init();
        calculator.add(4.2);
        calculator.add(4.2);
        Assertions.assertEquals(8.4,calculator.result()); //asigurate ca cei 2 param sunt egali
    }
    @Test
    void testSubtractDoubleCalculator(){
        calculator.init();
        calculator.subtract(4.2);
        calculator.subtract(4.2);
        Assertions.assertEquals(-8.4,calculator.result()); //asigurate ca cei 2 param sunt egali
    }
    @Test
    void testMultiplyDoubleCalculator(){
        calculator.init();
        calculator.multiply(4.2);
        calculator.multiply(4.2);
        Assertions.assertEquals(0.0,calculator.result()); //asigurate ca cei 2 param sunt egali
    }
    @Test
    void testAddIntCalculator(){

        icalculator.add(4);
        icalculator.add(4);
        Assertions.assertEquals(8,icalculator.result());
    }
    @Test
    void testSubtractIntCalculator(){

        icalculator.subtract(4);
        icalculator.subtract(4);
        Assertions.assertEquals(-8,icalculator.result());
    }
    @Test
    void testMultiplyIntCalculator(){

        icalculator.multiply(4);
        icalculator.multiply(4);
        Assertions.assertEquals(0,icalculator.result());
    }
    @AfterEach //metoda este executata la sfarsitul fiecarui test
    public void tearDown() {
        calculator = null;
        icalculator = null;
    }
}
