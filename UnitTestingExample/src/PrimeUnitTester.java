import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PrimeUnitTester
{
    @Test
    public void testNumbersSmallerThanFive()
    {
        assertTrue(PrimeTester.isPrime(2));
        assertTrue(PrimeTester.isPrime(3));
        assertTrue(!PrimeTester.isPrime(4));
        assertTrue(PrimeTester.isPrime(5));
    }
    @Test
    public void testNumbersLargerThanFive()
    {
        assertTrue(!PrimeTester.isPrime(8));
        assertTrue(!PrimeTester.isPrime(10));
        assertTrue(PrimeTester.isPrime(7));
        assertTrue(PrimeTester.isPrime(11));
    }
}
