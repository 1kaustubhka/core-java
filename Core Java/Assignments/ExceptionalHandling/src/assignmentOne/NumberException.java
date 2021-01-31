package assignmentOne;

public class NumberException extends Exception{
	String msg;
	NumberException()
	{
		 msg="IT IS A NUMBER";
	}
	
	String getMsg()
	{
		return msg;
	}
}
