package CreationalPatterns.AbstractFactory.Example1;

public class FirstFactory implements AbstractFactory {
	
	public Shape getShape() {
		return new Circle();
	};
	public Color getColor() {
		return new Red();
	};

}
