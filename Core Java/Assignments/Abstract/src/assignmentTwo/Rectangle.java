package assignmentTwo;

public class Rectangle extends Shape {
	float length,breath;

	@Override
	float area() {
		return length*breath;
		
	}

	public Rectangle(int length2, int breath2) {
		// TODO Auto-generated constructor stub
		this.length = (float) length2;
		this.breath = (float) breath2;	
	}
	
	
}
