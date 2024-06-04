package CreationalPatterns.Factory.Example1;

public class CircleFactory extends ShapeFactory {
	
	public Shape getShape() {
		return new Circle();
	};

}
