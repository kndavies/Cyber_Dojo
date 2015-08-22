package primeFactorKata;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.*;
import static org.junit.Assert.*;

public class PrimeFactorTest {

    @Test
    public void testIf2ResultIs2() {
        assertEquals(Integer.valueOf(2), PrimeFactor.findPrimes(2).get(0));
    }

    @Test
    public void testIf3ResultIs3() {
        assertEquals(Integer.valueOf(3), PrimeFactor.findPrimes(3).get(0));
    }
    
    @Test
    public void testIf4ResultIs2and2() {
        assertEquals(Integer.valueOf(2), PrimeFactor.findPrimes(4).get(0));
        assertEquals(Integer.valueOf(2), PrimeFactor.findPrimes(4).get(1));
    }
    
    @Test
    public void testIf5ResultIs5() {
        assertEquals(Integer.valueOf(5), PrimeFactor.findPrimes(5).get(0));
    }
    
    @Test
    public void testIf9ResultIs3and3and3() {
        assertEquals(Integer.valueOf(3), PrimeFactor.findPrimes(9).get(0));
        assertEquals(Integer.valueOf(3), PrimeFactor.findPrimes(9).get(1));
    }
    
    @Test
    public void testIf100ResultIs2and2and5and5() {
        assertEquals(Integer.valueOf(2), PrimeFactor.findPrimes(100).get(0));
        assertEquals(Integer.valueOf(2), PrimeFactor.findPrimes(100).get(1));
        assertEquals(Integer.valueOf(5), PrimeFactor.findPrimes(100).get(2));
        assertEquals(Integer.valueOf(5), PrimeFactor.findPrimes(100).get(3));    
    }
}
