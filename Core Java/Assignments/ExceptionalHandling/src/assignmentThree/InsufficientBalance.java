package assignmentThree;

public class InsufficientBalance extends Exception{
	String msg;

	public InsufficientBalance() {
		this.msg = "Insuficient Balance Amount";
	}
	
	String getMsg() {
		return msg;
	}
	
}
