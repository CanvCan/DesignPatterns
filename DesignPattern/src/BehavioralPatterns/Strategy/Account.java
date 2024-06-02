package BehavioralPatterns.Strategy;

public class Account {
	
	public String accountName;
	public double balance;
	public double bonus;
	
	public Account(String accountName, double balance) {
		this.accountName = accountName;
		this.balance =balance;
		this.bonus = 10;
	}
	
	public void withdrawal(double cost) {
		System.out.println("Mevcut bakiye: " + balance);
		if(cost > balance) {
			System.out.println("Yetersiz bakiye !!!");
		} else {
			this.balance -= cost;
			System.out.println("Kalan bakiye: " + balance);
		}
	}

}
