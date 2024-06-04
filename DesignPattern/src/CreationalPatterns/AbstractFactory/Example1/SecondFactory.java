package CreationalPatterns.AbstractFactory.Example1;

public class SecondFactory implements AbstractFactory {
	
	public Shape getShape() {
		return new Rectangle();
	};
	public Color getColor() {
		return new Green();
	};

}
