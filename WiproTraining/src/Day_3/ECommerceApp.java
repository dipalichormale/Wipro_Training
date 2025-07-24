package Day_3;

interface PaymentMode {
    void pay(double amount);
}

class UPIPayment implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

class CreditcardPayment implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class CashnoDelivery implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " will be collected on delivery.");
    }
}

public class ECommerceApp {

	public static void main(String[] args) {
		 PaymentMode payment;

	        payment = new UPIPayment();
	        payment.pay(1500.00);

	        payment = new CreditcardPayment();
	        payment.pay(3200.00);

	        payment = new CashnoDelivery();
	        payment.pay(2000.00);

	}

}
