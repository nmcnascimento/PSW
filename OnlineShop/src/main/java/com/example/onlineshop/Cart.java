public class Cart {
	protected String cartID;
	protected String prodID;
	protected int prodqty;
	protected float price;
	protected float total;

	//allows customer to costumize number of products to buy
	void setQty(int prodqty){
		this.prodqty = newqty;
	}

	float getTotal(String prodID, int newqty){
		float getPrice(String prodID){
			//gets product price from db through prodID
			price = price * prodqty;
			return price;
		}
		total = total = price;
		return total;
	}

	void rmItem(String prodID){
		//removes item/s from cart
	}

	void order(String cartID){
		//confirms cart items and proceeds to order menu
	}

}
