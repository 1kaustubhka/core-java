package MultiThreading;

public class Test {
	public static void main(String[] args) throws Exception{
		Account ac = new Account(101,7000);
		
		User t1 = new User(ac);
		User t2 = new User(ac);
		
		t2.start();
	t1.start();
		
		t2.join();
		t1.join();
		
	}
}
