package CreationalPatterns.AbstractFactory.Example1;

public class Application1 {

	public static void main(String[] args) {

		AbstractFactory factory1 = new FirstFactory();
		AbstractFactory factory2 = new SecondFactory();
		AbstractFactory factory3 = new ThirdFactory();
		
		Shape shape1 = factory1.getShape();
		Color color1 = factory1.getColor();
		
		Shape shape2 = factory2.getShape();
		Color color2 = factory2.getColor();
		
		Shape shape3 = factory3.getShape();
		Color color3 = factory3.getColor();
		
		shape1.draw();
		color1.fill();
		shape2.draw();
		color2.fill();
		shape3.draw();
		color3.fill();
		
	}

}
