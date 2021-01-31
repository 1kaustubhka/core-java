package Sum;

public class Sum {
	public static void main(String[] args) {
		int num=555;
		int sum=0;
		int n =num;
		if(num>=0 && num<=1000)
		{
		while(num>0)
		{
			sum+=num%10;
			num=num/10;
		}
		
			System.out.println("The sum of all digits in "+n+" is "+sum);
		}
		else
		{
			System.out.println("No is not in range");
		}
	}
}
