package br.gov.sp.fatec.projetomaven;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest
{

    private static final double DELTA = 1e-15;

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testSoma()
    {
        final Calculadora calc = new Calculadora();
        assertEquals(calc.soma(), 10.0, DELTA);
        assertEquals(calc.sub(), 0.0, DELTA);
        assertEquals(calc.mult(), 25.0, DELTA);
        assertEquals(calc.div(), 1.0, DELTA);
    }
}
