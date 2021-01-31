package assignmentTwo;

public class NegativeNumberException extends Exception{
	String msg;

	
	
	public NegativeNumberException(Double num) {
		// TODO Auto-generated constructor stub
		msg="Negative Number Inserted: "+num;
	}
	public String getMessage()
	{
		return msg;
	}
}
