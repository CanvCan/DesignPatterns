package BehavioralPatterns.Command;

public class Calculator {
	
	public String calculate(Command command, int a, int b) {
		return command.execute(a, b);
	}

}
