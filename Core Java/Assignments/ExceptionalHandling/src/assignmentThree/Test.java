package assignmentThree;

public class Test {
	public static void main(String[] args) {
		BankApplication ba = new BankApplication();
		
		ba.addCustomer("kaustubh","Pune",1);
		ba.addCustomer("Vivek", "Halkarni", 2);
		
		ba.display();
		
		ba.withdrawMoney(100000, 10000);
	}
}
