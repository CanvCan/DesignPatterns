package CreationalPatterns.Factory.Example1;

public class Application1 {
	
	public static void main(String[] args) {
		
		ShapeFactory factory1 = new CircleFactory();
		ShapeFactory factory2 = new RectangleFactory();
		ShapeFactory factory3 = new SquareFactory();
		
		Shape shape1 = factory1.getShape();
		Shape shape2 = factory2.getShape();
		Shape shape3 = factory3.getShape();
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		
	}

}
