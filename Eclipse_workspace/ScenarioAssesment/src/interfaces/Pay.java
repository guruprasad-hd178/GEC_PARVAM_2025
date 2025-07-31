package interfaces;

interface Payment {
    void pay(double amount);
}

class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via card");
        // Card payment processing logic
    }
}

class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via UPI");
    }
}

public class Pay
{
	public static void main(String[] args) {
		Payment p1 = new CardPayment();
		p1.pay(1000);
		
		Payment p2 = new UPIPayment();
		p2.pay(2000);
	}
}