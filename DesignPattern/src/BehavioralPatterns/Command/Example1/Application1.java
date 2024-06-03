package BehavioralPatterns.Command.Example1;

public class Application1 {

	public static void main(String[] args) {
		double a = 6;
		double b = 3;
		
		Calculator calculator = new Calculator();

		System.out.println(calculator.calculate(new Addition(), a, b));
		System.out.println(calculator.calculate(new Substraction(), a, b));
		System.out.println(calculator.calculate(new Multiplication(), a, b));
		System.out.println(calculator.calculate(new Division(), a, b));
		System.out.println(calculator.calculate(new Exponentiation(), a, b));
		
		System.out.println("------------------------------");
		
		//Scenerio 2
		
		Calculator calculator2 = new Calculator();
		
		Command command1 = new Addition();
		Command command2 = new Substraction();
		Command command3 = new Multiplication();
		Command command4 = new Division();
		Command command5 = new Exponentiation();
		
		System.out.println(calculator2.calculate(command1, a, b));
		System.out.println(calculator2.calculate(command2, a, b));
		System.out.println(calculator2.calculate(command3, a, b));
		System.out.println(calculator2.calculate(command4, a, b));
		System.out.println(calculator2.calculate(command5, a, b));
	
	}

}
