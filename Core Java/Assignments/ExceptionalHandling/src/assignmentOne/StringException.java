package assignmentOne;

public class StringException extends Throwable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	StringException()
	{
		 msg="IT IS A String";
	}
	
	String getMsg()
	{
		return msg;
	}
}
