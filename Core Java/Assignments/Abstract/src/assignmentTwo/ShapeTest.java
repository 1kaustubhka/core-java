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
			}
		}
	}
}
