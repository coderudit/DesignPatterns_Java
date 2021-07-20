package structural.bridge;

public class Circle extends Shape {

	Circle(IColor color) {
		super(color);
	}

	@Override
	public void applyColor() {
		this.color.applyColor();
	}

}
