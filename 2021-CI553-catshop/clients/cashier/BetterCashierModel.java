package clients.cashier;

import catalogue.Basket;
import catalogue.BetterBasket;
import middle.MiddleFactory;

public class BetterCashierModel extends CashierModel {

	public BetterCashierModel(MiddleFactory mf) {
		super(mf);
		// TODO Auto-generated constructor stub
	}

	protected Basket makeBasket(){
		return new BetterBasket();
	}
}
