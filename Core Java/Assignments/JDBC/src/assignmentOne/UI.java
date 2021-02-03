package assignmentOne;

import java.io.IOException;

import assignmentOne.exception.EmployeeException;
import assignmentOne.service.EmployeeService;
import assignmentOne.service.EmployeeServieImpl;

public class UI {
	public static void main(String[] args) throws Exception {
		
		@SuppressWarnings("unused")
		int a = 10;
		
		System.out.println("employee demo...");
		
		EmployeeService empService = new EmployeeServieImpl();
		
		try {
			//add one regular employee
			empService.add("reg101", "reg address", 123, "REG");			
		}catch(EmployeeException | IOException ee) {
			System.err.println(ee.getLocalizedMessage());
		}
		
		try {
			//add one retired employee
			empService.add("ret102", "ret address", 789, "RET");			
		}catch(EmployeeException ee) {
			System.err.println(ee.getLocalizedMessage());
		}
		
		try {
			empService.displayAll();	
		}catch (EmployeeException ee) {
			System.err.println(ee.getLocalizedMessage());
		}
		
		try {
			empService.update(20975,"Kaustubh","PUNE",150000,"REG");	
		}catch (EmployeeException ee) {
			System.err.println(ee.getLocalizedMessage());
		}
		try {
			empService.displayAll();	
		}catch (EmployeeException ee) {
			System.err.println(ee.getLocalizedMessage());
		}
		try {
			empService.delete(20975);	
		}catch (EmployeeException ee) {
			System.err.println(ee.getLocalizedMessage());
		}
		try {
			empService.displayAll();	
		}catch (EmployeeException ee) {
			System.err.println(ee.getLocalizedMessage());
		}
		
	}
}