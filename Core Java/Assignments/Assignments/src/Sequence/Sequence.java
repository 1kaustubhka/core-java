package Sequence;

public class Sequence {
	public static void main(String[] args) {
		int num = 123456;
		int rem;
		
		for(int i=5;i>=0;i--)
		{
			rem=(int) (num/Math.pow(10,i));
			System.out.print(rem+" ");
			num%=Math.pow(10, i);
		}
		
	}
}
