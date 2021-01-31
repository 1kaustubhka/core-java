package Constructor;

public class Constructors {
	int data;
	
	Constructors()
	{
		data = 0;
	}
	
	Constructors(int d)
	{
		data = d;
	}
	
	public static void main(String[] args) {
		Constructors c1 = new Constructors();
		Constructors c2 = new Constructors(5);
		
		System.out.println("Constructor Default: "+c1.data);
		System.out.println("Constructor with parameterized: "+c2.data);
	}
}
