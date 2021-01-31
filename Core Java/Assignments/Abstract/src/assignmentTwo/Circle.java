package assignmentTwo;

public class Circle extends Shape{
	int r;
	public Circle(int r) {
		super();
		this.r = r;
	}
	@Override
	float area()
	 {
		return (float) (Math.PI*r*r);
	 }
}
