package edu.eci.cnyt.tdd.src;

import edu.eci.cnyt.tdd.src.excepciones.CplxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;


public class CplxMathTest {
    
    

    /**
     * Test of CompSuma method, of class CplxMath.
     */
    @Test
    public void testCompSuma() {
        Complejo C1 = new Complejo(1,5);
        Complejo C2 = new Complejo(5,-3);
        Complejo expResult = new Complejo(6,2);
        Complejo result = CplxMath.CompSuma(C1, C2);
        assertEquals(expResult, result);
    }

    /**
     * Test of CompResta method, of class CplxMath.
     */
    @Test
    public void testCompResta() {
        Complejo C1 = new Complejo(1,5);
        Complejo C2 = new Complejo(5,-3);
        Complejo expResult = new Complejo(-4,8);
        Complejo result = CplxMath.CompResta(C1, C2);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of Mult method, of class CplxMath.
     */
    @Test
    public void testMult() {
        double r = 3;
        Complejo C1 = new Complejo(1,5);
        Complejo expResult = new Complejo(3,15);
        Complejo result = CplxMath.Mult(r, C1);
        assertEquals(expResult, result);
    }

    /**
     * Test of CompMult method, of class CplxMath.
     */
    @Test
    public void testCompMult() {
        Complejo C1 = new Complejo(-1.5,5);
        Complejo C2 = new Complejo(9,7);
        Complejo expResult = new Complejo(-48.5,34.5);
        Complejo result = CplxMath.CompMult(C1, C2);
        assertEquals(expResult, result);
    }

    /**
     * Test of CompDiv method, of class CplxMath.
     */
    @Test
    public void testCompDiv() {
        try {
            Complejo C1 = new Complejo(-90,145);
            Complejo C2 = new Complejo(9.9999998,890);
            Complejo expResult = new Complejo(0.1617647059058913,0.1029411764345011);
            Complejo result = CplxMath.CompDiv(C1, C2);
            assertEquals(expResult, result);
        } catch (CplxException ex) {
            fail("Epacoio");
        }
        
    }

    /**
     * Test of CompMod method, of class CplxMath.
     */
    @Test
    public void testCompMod() {
        Complejo C = new Complejo(30,-14.5);
        double expResult = 33.32;
        double result = CplxMath.CompMod(C);
        assertEquals(expResult, result, 0.4);
    }

    /**
     * Test of CompConj method, of class CplxMath.
     */
    @Test
    public void testCompConj() {
        Complejo C = new Complejo(1,69);
        Complejo expResult = new Complejo(1,-69);
        Complejo result = CplxMath.CompConj(C);
        assertEquals(expResult, result);        
    }

    /**
     * Test of CompPolar method, of class CplxMath.
     */
    @Test
    public void testCompPolar() {
        Complejo C = new Complejo(1,-4);
        Complejo expResult = new Complejo(4.123105625617661,-0.24497866312686414);
        Complejo result = CplxMath.CompPolar(C);
        assertEquals(expResult, result);
    }

    /**
     * Test of CompCart method, of class CplxMath.
     */
    @Test
    public void testCompCart() {
        Complejo C = new Complejo(-65,0.5);
        Complejo expResult = new Complejo(-57.04286652287423, -31.162660009273196);
        Complejo result = CplxMath.CompCart(C);        
        assertEquals(expResult, result);
    }

    /**
     * Test of CompFase method, of class CplxMath.
     */
    @Test
    public void testCompFase() {
        Complejo C = new Complejo(-4.3,2);
        double expResult = 2.7;
        double result = CplxMath.CompFase(C);
        assertEquals(expResult, result, 0.05);
    }
    
}
