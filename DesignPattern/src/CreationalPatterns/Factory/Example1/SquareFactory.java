package CreationalPatterns.Factory.Example1;

public class SquareFactory extends ShapeFactory{
	
	public Shape getShape() {
		return new Square();
	};

}
