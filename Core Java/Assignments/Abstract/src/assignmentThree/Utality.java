package assignmentThree;

public class Utality {
	public void printAll(Printable p)
	{
		p.print();
	}
	
	public static void main(String[] args) {
		Printable a = new Animal();
		Printable s = new Shape();
		
		Utality u = new Utality();
		u.printAll(a);
		u.printAll(s);
	}
}
