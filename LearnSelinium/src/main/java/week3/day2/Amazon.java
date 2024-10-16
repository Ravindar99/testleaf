package week3.day2;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("cash on delivery is available");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("upi payment is available");
	}

	@Override
	public void cardPayments() {
		System.out.println("card payment is available");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internet banking is available");
		
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("payment is recorded");
		
	}
	public static void main(String[] args) {
		Amazon a=new Amazon();
		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.internetBanking();
		a.recordPaymentDetails();
		
	}

}
