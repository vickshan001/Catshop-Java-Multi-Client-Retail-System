package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;

/**
 * BetterBasket is to improve the overall experience customers have.
 * Here I have added functions to add quantity to the same line if the product is same.
 * 
 * @author  Vickshan Vicknakumaran
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
  /*
   * @product is used to pass value to the method and check if the item is in the list
   * If the item is in the list loop through quantity to add more of the same item.
   */
  
  @Override
  public boolean add (Product pr)
  {
//	  Checks for same product
	  if (super.add(pr)) {
		sortbasket();
//		Loops quantity to see same product
		for(int i = 0; i < this.size(); i++) {
			if (this.get(i).getQuantity() == 0) {
				this.remove(i);
			}
		}
		return true;
	  }
	  return false;
  }
 
  /*
   * sortBasket sorts the item based on the order number 
   */
  
  private void sortbasket() {
	// TODO Auto-generated method stub
	Collections.sort(this, new Comparator<Product>() {

		@Override
		public int compare(Product item1, Product item2) {
			// TODO Auto-generated method stub
			double a = Integer.parseInt(item1.getProductNum());
			double b = Integer.parseInt(item2.getProductNum());
			if (a == b) {
				item2.setQuantity(item2.getQuantity() + 1);
				item1.setQuantity(0);
				return 0;
			}
			return a > b ? 1 : -1;
		}
		
	});
}
  /*
   * 
   */

public static int Sort (Product item1, Product item2) {
	  return item1.getProductNum().compareTo(item2.getProductNum());
			  }
}
