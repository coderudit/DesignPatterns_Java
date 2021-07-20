package structural.bridge;

public class ShapeBridgeDemo {
	IColor red = new Red();
	Square square = new Square(red);
	
	IColor blue = new Blue();
	Circle circle = new Circle(blue);
}
