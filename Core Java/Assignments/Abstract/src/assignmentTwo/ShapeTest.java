package assignmentTwo;

public class ShapeTest {
	public static void main(String[] args) {
		final int size =10;
		Shape s[] = new Shape[size];
	
		for(int i=0;i<size;i++)
		{
			if(i%3==0)
			{
				s[i]=new Rectangle(20,50);
				System.out.println("Area of Recangle: "+s[i].area());
			}
			else if(i%4==0)
			{
				s[i]=new Circle(5);
				System.out.println("Area of Circle: "+s[i].area());
			}
			else
			{
				s[i]=new Triangle(20,50);
				System.out.println("Area of Triangle: "+s[i].area());
			}
		}
	}
}
