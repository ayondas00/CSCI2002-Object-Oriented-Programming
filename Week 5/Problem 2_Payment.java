package JavaProject;

abstract class PaymentMethod {
	abstract void pay();
}

class CreditCard extends PaymentMethod {
	void pay() {
		System.out.println("Payment using Credit Card");
	}
}

class PayPal extends PaymentMethod {
	void pay() {
		System.out.println("Payment using PayPal");
	}
}

class MobileBanking extends PaymentMethod {
	void pay() {
		System.out.println("Payment using Mobile Banking");
	}
}

public class Payment {
	public static void main(String[] args) {
		PaymentMethod p1 = new CreditCard();
		PaymentMethod p2 = new PayPal();
		PaymentMethod p3 = new MobileBanking();
		p1.pay();
		p2.pay();
		p3.pay();
	}
}
