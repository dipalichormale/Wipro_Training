package Day_3;


public class SaleSystemOops2 {

	public static void main(String[] args) {
		Product[] items = {
		           new Product("Laptop", 50000, 1),
		           new Product("Mouse", 500, 2),
		           new Product("Keyboard", 1000, 1)
		       };
		       double grandTotal = 0;
		       System.out.println("Product\tPrice\tQty\tTotal");
		       System.out.println("--------------------------------------");
		       for (Product item : items) {
		           item.displayItem();
		           grandTotal += item.getTotalPrice();
		       }
		       System.out.println("--------------------------------------");
		       System.out.println("Grand Total: " + grandTotal);


	}

}
