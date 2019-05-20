package test;

import calculatrice.Soustraction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoustractionTest {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void soustractionTest() {
        Soustraction soustraction = new Soustraction();
        double a = 10;
        double b = 9;
        double expected = 1;
        assertEquals(expected, soustraction.executer(a,b));

    }
}