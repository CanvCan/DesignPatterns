package BehavioralPatterns.Strategy;

public class Cash implements PaymentStrategy {
	
	public double balance;
	
	public Cash(double balance) {
		this.balance = balance;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println("Nakit ile ödeme yapılıyor");
		if(amount > balance) {
			System.out.println("Yetersiz nakit !!!");
		} else {
			System.out.println("Para üstü: " + (balance - amount));
		}
	};

}
