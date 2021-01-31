package StringMiddle;

import java.util.Scanner;

public class Middle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(s.length()%2==0)
		{
			System.out.println("Middle of "+s+" is "+s.charAt(s.length()/2-1)+s.charAt(s.length()/2));
		}
		else
		{
			System.out.println("Middle of "+s+" is "+s.charAt(s.length()/2));
		}
	}
}
