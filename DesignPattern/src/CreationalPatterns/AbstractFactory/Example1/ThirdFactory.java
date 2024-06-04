package CreationalPatterns.AbstractFactory.Example1;

public class ThirdFactory implements AbstractFactory {
	
	public Shape getShape() {
		return new Square();
	};
	public Color getColor() {
		return new Blue();
	};

}
