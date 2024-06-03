package BehavioralPatterns.Command.Example1;

public class Multiplication implements Command {
	
	@Override
	public String execute(double a, double b) {
		double result = a * b;
		return "Multiplication results: " + result;
	};
}
