package BehavioralPatterns.Command.Example1;

public class Substraction implements Command {

	@Override
	public String execute(double a, double b) {
		double result = a - b;
		return "Substraction results: " + result;
	};

}
