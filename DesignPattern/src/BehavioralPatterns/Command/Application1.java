package BehavioralPatterns.Command;

public class Application1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		Calculator calculator = new Calculator();

		
		System.out.println(calculator.calculate(new Addition(), a, b));
		System.out.println(calculator.calculate(new Substraction(), a, b));
		System.out.println(calculator.calculate(new Multiplication(), a, b));
		System.out.println(calculator.calculate(new Division(), a, b));
		
	}

}
