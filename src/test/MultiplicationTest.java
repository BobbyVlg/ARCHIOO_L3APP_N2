package test;

import calculatrice.Multiplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void soustractionTest(){
        Multiplication soustraction = new Multiplication();
        double a = 10;
        double b = 9;
        double expected = 90;
        assertEquals(expected,soustraction.executer(a, b));

    }
}