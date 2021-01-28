package com.cybage;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		System.out.println("DAY 3: EXCEPTION HANDLING");
		
		int age;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter 2 numbers");
		//int n1 = sc.nextInt();
		//int n2 = sc.nextInt();
		
		System.out.println("Enter Age: ");
		age = sc.nextInt();
		try {
			if(age>18)
			{
				System.out.println("You are Eligible");
			}
			else {
				throw new VotingException("Mot Eligible. You are below 18.");
			}
			//int div = n1/n2;
			//System.out.println("Division is: "+div);
		}
		catch(ArithmeticException ae)
		{
			//System.err.println("Exception Thrown: "+ae.getMessage());
		}
		catch(VotingException ve)
		{
			System.err.println(ve.getMessage());
		}

	}
}
