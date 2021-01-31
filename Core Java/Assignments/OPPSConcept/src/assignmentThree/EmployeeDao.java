package assignmentThree;

public class EmployeeDao {
	static int count=0;
	Employee[] e = new Employee[100];
	static int increase()
	{
		return count++;
	}
	void addEmp(String n, int sal)
	{
		int id = EmployeeDao.increase();
		e[id]= new Employee(id, n, sal);
	}
	void display()
	{
		for(int i=0;i<EmployeeDao.count;i++)
		{
			System.out.println(e[i]);
		}
	}
}
