package BehavioralPatterns.Command.Example1;

public class Calculator {
	
	public String calculate(Command command, double a, double b) {
		return command.execute(a, b);
	}

}
