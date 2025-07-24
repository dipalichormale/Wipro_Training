package Day_3;

public class Product {
	private String productName;
	private double price;
	private int quantity;
	
	//constructor
	public Product(String productName, double price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	// calculate total price for the item
	public double getTotalPrice() {
		return  price*quantity;
	}
	
	public void displayItem() {
		System.out.println(productName + "\t" + price + "\t" + quantity + "\t" + getTotalPrice());
	}

}
