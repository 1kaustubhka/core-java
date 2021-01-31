package assignmentTwo;

import java.util.Scanner;

public class Employee {
	int id;
	
	Employee()
	{
		id=0;
	}
	
	public static void main(String[] args) {
		Employee emp[]=new Employee[10];
	
		for(int n=0;n<10;n++)
		{
			emp[n]=new Employee();
		}
		
		System.out.println(emp.length);
	}
}
