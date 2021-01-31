package assignmentThree;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		EmployeeDao ed = new EmployeeDao();
		do
		{
			System.out.println("1. Add Employee\n2. Display\n 3. Exit");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: ed.addEmp("Kaustubh Kakade", 1000000);
					break;
					
			case 2: ed.display();
					break;
			}
			
		}while(choice!=3);
		sc.close();
	}
}
