package assignmentFive;

import static java.lang.Math.PI;

public class Triangle {
	int base,height;

	Triangle(int b, int h)
	{
		this.base=b;
		this.height=h;
	}
	double calcArea()
	{
		System.out.println("base: "+base+" height: "+height);
		return (double)base*height*0.5;
	}
	public static void main(String[] args) {
		Triangle t = new Triangle(20,40);
		double area = t.calcArea();
		System.out.println("Area: "+area);
		
		System.out.println("PS: Area of Triangle does not include PI. But imported PI value: "+Math.PI);
	}
}
