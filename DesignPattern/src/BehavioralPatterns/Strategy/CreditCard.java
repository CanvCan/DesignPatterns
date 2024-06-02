package BehavioralPatterns.Strategy;

public class CreditCard implements PaymentStrategy {
	
	public Account account;
	
	public CreditCard(Account account) {
		this.account = account;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println("Kredi kartı ile ödeme yapılıyor");
		account.withdrawal(amount);
	};

}
