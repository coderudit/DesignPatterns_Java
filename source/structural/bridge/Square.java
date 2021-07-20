package structural.bridge;

public class Square extends Shape {

	Square(IColor color) {
		super(color);
	}

	@Override
	public void applyColor() {
		this.color.applyColor();
	}

}
