package AccAndMut;

public class Employee {
	int id;
	int sal;
	String Name;
	
	Employee()
	{
		this.id=0;
		this.sal=0;
		this.Name=null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setId(101);
		e1.setSal(500000);
		e1.setName("Kaustubh");
		
		System.out.println("Name: "+e1.getName()+" ,Id: "+e1.getId()+" ,Sal: "+e1.getSal());
	}
	
}
