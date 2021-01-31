package assignmentTwo;

import java.util.Scanner;

public class FindSquareRoot {
	public static void main(String[] args) {
		Double num;
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter Number: ");
			num = sc.nextDouble();
			if(num<0)
			{
				throw new NegativeNumberException(num);
			}
			double sqrt = Math.sqrt(num);
			System.out.println("Square Root of "+num+" is "+sqrt);
		}catch(NegativeNumberException ne)
		{
			System.out.println(ne.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
