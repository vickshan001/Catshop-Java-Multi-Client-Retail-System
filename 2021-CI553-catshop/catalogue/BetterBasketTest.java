package catalogue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit Test 
 * @author  Vickshan Vicknakumaran
 *
 */

public class BetterBasketTest {
	Product pr1 = null;
	Product pr2 = null;
	Product pr3 = null;
	Product pr4 = null;
	
	BetterBasket betterBasket = new BetterBasket();
	/*
	 * @param pr1 pass the value to check 
	 * @Before is used to test before the function 
	 */
	
	@Before
	public void setup() {
		pr1 = new Product("0004", "Watch", 29.99, 1);
		pr2 = new Product("0002", "DAB Radio", 29.99, 1);
		pr3 = new Product("0006", "MP3 player", 7.99, 1);
		pr4 = new Product("0003", "Toaster", 29.99, 1);
		
		betterBasket = new BetterBasket();
	}
	
	/*
	 * @param betterBasket check for incorrect size after merge
	 * @param assertEquals get quantity value to cross match with betterBasket value 
	 */
	
	@Test
	public void testMergeAddProduct() {
		 pr1 = new Product("0001", "40 inch LED HD", 269, 3);
		 pr2 = new Product("0001", "40 inch LED HD", 269, 2);
		 
		 betterBasket.add(pr1);
		 betterBasket.add(pr2);
		 
		 assertEquals(1, betterBasket.size(), "Incorrect size after merge");
		 assertEquals(4, betterBasket.get(0).getQuantity(), "Incorrect quantity after merge");
		
	}
	
	/*
	 * @param assertEquals test whether the products are sorted 
	 */
	
	@Test 
	public void testAddProduct() {
		pr1 = new Product("0001", "40 inch LED HD", 269, 1);
	    pr2 = new Product("0002", "DAB Radio", 29.99, 1);
	    pr3 = new Product("0003", "Toaster", 19.99, 1);

	    betterBasket.add(pr3);
	    betterBasket.add(pr1);
	    assertEquals("0001", betterBasket.get(0).getProductNum(), "Product missorted");
	    assertEquals("0003", betterBasket.get(1).getProductNum(), "Product missorted");

	    betterBasket.add(pr2);
	    assertEquals("0001", betterBasket.get(0).getProductNum(), "Product incorrect after insert");
	    assertEquals("0002", betterBasket.get(1).getProductNum(), "Product incorrect after insert");
	    assertEquals("0003", betterBasket.get(2).getProductNum(), "Product incorrect after insert");
		
	}

}
