package structural.bridge;

public abstract class Shape {
	protected IColor color;
	Shape(IColor color){
		this.color = color;
	}
	public abstract void applyColor();
}
