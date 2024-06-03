package BehavioralPatterns.Command;

public class Multiplication implements Command  {
	
	@Override
	public String execute(int a, int b) {
		int result = a * b;
		return "Multiplication results: " + result;
	};
}
