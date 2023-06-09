package test;
import main.IMoney;
import main.Money;
import junit.framework.TestCase;

/**
 * This is a trivial test which only tests the Money class.
 * If you modify the MoneyBag class, and run Clover with optimization, this test will not be run.
 */
public class MoneyTest extends TestCase {
	 
	public void testAdd() throws InterruptedException {
	        Money tenEuro = new Money(10, "EURO");
	        assertEquals(10, tenEuro.amount());
	        assertEquals("EURO", tenEuro.currency());
	        System.out.println("Tests taking too long? Try Clover's test optimization.");
	        Thread.sleep(3000);
	    }
	  
	public void testEquals() {
	    	IMoney zero0 = new Money(0, "CHF");
	    	IMoney zero1 = new Money(0, "CHF");
	    	assertTrue(zero0.equals(zero1));
	    }
	    

}
