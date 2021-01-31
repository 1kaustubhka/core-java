package assignmentTwo;

public class User {
	public static void main(String[] args) {
		SavingAcc s = new SavingAcc(1111,5000000);
		CurrentAcc c = new CurrentAcc(12222,566600);
		
		System.out.println("In Saving, Rate of 9.8 will have annual ammount: "+s.increaseAmt());
		System.out.println("In Current, Rate of 5.5 will have annual ammount: "+c.increaseAmt());
	}
}
