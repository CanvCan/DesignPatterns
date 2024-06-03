package BehavioralPatterns.Command;

public class Division implements Command  {
	
	@Override
	public String execute(int a, int b) {
		int result = a / b;
		return "Division results: " + result;
	};

}
