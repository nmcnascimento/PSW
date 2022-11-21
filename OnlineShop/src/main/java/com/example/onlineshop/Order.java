public class Order extends Cart{
	protected int orderID;
	protected date datecreated;
	protected int total;

	Cart checkout = new Cart();
	checkout.getTotal();

	void order(Cart checkout){
		//confirms purchase and updates costumer balance
	}
}
