package BehavioralPatterns.Command.Example1;

public class Addition implements Command {
	
	@Override
	public String execute(double a, double b) {
		double result = a + b;
		return "Addition results: " + result;
	};
	
}
