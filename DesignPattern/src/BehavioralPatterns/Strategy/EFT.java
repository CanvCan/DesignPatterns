package BehavioralPatterns.Strategy;

public class EFT implements PaymentStrategy {
	
	public static final double EFT_PRICE = 20.0;
	public Account account;
	
	public EFT(Account account) {
		this.account = account;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println("EFT ile ödeme yapılıyor");
		account.withdrawal(amount + EFT_PRICE);
	};

}
