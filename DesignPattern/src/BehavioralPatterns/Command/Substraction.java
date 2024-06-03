package BehavioralPatterns.Command;

public class Substraction implements Command {

	@Override
	public String execute(int a, int b) {
		int result = a - b;
		return "Substraction results: " + result;
	};

}
