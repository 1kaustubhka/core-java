package assignmentOne;

public class ExceptionExample {
	public static void main(String[] args) {
		Integer intg = 8;
		
		//TRY-CATCH -- getMessage() and printStackTrace()
		try {
			Integer a = 5/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		
		
		//String Exception -- Multiple Catch
		try {
			if("Kaustubh".getClass() == String.class)
			{
				throw new StringException();
			}
			
			if(intg.getClass() == Integer.class)
			{
				throw new NumberException();
			}
		}
		catch(StringException se)
		{
			System.out.println(se.getMsg());
		}
		catch(NumberException ne)
		{
			System.out.println(ne.getMsg());
		}
		
		
		//IntegerException -- Multiple Catch
		try {
			if(intg.getClass() == Integer.class)
			{
				throw new NumberException();
			}
			if("Kaustubh".getClass() == String.class)
			{
				throw new StringException();
			}	
		}
		catch(StringException se)
		{
			System.out.println(se.getMsg());
		}
		catch(NumberException ne)
		{
			System.out.println(ne.getMsg());
		}
	    
		//Nested TRY
		try { 
	  
	            // initializing array 
	            int a[] = { 1, 2, 3, 4, 5 }; 
	  
	            // trying to print element at index 5 
	            System.out.println(a[4]); 
	  
	            // try-block2 inside another try block 
	            try { 
	  
	                // performing division by zero 
	                int x = a[2] / 0; 
	            } 
	            catch (ArithmeticException e2) { 
	                System.out.println("division by zero is not possible"); 
	            } 
	        } 
	        catch (ArrayIndexOutOfBoundsException e1) { 
	            System.out.println("ArrayIndexOutOfBoundsException"); 
	            System.out.println("Element at such index does not exists"); 
	        } 
	    
		//Finally
		finally
		{
			System.out.println("THIS FINALLY WILL ALWAYS EXECUTE");
		}
	}
}
