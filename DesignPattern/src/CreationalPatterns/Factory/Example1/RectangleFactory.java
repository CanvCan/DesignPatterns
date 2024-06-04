package CreationalPatterns.Factory.Example1;

public class RectangleFactory extends ShapeFactory {
	
	public Shape getShape() {
		return new Rectangle();
	};

}
