package assignmentOne.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import assignmentOne.model.Employee;

public interface EmployeeDao {
	public void add(Employee emp, String type) throws Exception;
	public void delete(int id) throws Exception;
	public void update(int id, String name, String address, int comp, String type) throws Exception;
	public void display() throws Exception;
}
