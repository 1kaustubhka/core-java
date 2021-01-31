package assignmentTwo;

public class Triangle extends Shape{
	float length, breath;
	float area() {
		// TODO Auto-generated method stub
		return (float) 0.5*length*breath;
	}
	public Triangle(int length, int breath) {
		super();
		// TODO Auto-generated constructor stub
		this.length = (float) length;
		this.breath = (float) breath;
	}
	
}
