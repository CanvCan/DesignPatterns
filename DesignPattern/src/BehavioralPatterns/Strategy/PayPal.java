package BehavioralPatterns.Strategy;

import java.util.Scanner;

public class PayPal implements PaymentStrategy {
	
	public static final double PAYPAL_PRICE = 10.0;
	public Account account;
	
	public PayPal(Account account) {
		this.account = account;
	}
	
	 @Override
    public void pay(double amount) {
        Scanner scanner = new Scanner(System.in);
        boolean useBonus = false;

        while (true) {
            System.out.println("PayPal ile ödeme yapılıyor");
            System.out.printf("Paypal bonus miktarı: %.2f\n", account.bonus);
            System.out.println("Bonus kullanmak istiyor musunuz? (E/H)");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("E")) {
                useBonus = true;
                break;
            } else if (input.equalsIgnoreCase("H")) {
                useBonus = false;
                break;
            } else {
                System.out.println("Geçersiz giriş. Lütfen 'E' veya 'H' giriniz.");
            }
        }
        
        double amountToPay = useBonus ? (amount + PAYPAL_PRICE - account.bonus) : (amount + PAYPAL_PRICE);
        account.withdrawal(amountToPay);
        
        if(useBonus) {
        	account.bonus = amountToPay * 0.05;
        } else {
            account.bonus += amountToPay * 0.1;
        }
        
        System.out.println("Ödeme başarılı.");
        System.out.printf("Yeni bonus miktarı: %.2f\n", account.bonus);

    }
}
