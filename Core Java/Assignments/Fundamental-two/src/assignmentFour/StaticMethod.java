package assignmentFour;

public class StaticMethod {
	private static int a,b=90;
	
	static void display()
	{
		System.out.println("a: "+a+" b: "+b);
	}
	
	public static void main(String[] args) {
		StaticMethod sm = new StaticMethod();
		System.out.println("Initial static variable if not initialized are set to 0");
		StaticMethod.display();
		System.out.println("Initial static variable and static metods are accessed by ClassName");
		StaticMethod.a=50;
		StaticMethod.display();
	}
}
