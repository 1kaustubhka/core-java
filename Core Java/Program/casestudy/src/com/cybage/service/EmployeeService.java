package com.cybage.service;

import java.io.IOException;

import com.cybage.exception.EmployeeException;
import com.cybage.model.Employee;

public interface EmployeeService {
	public abstract void add(String name, String address, int comp, String type) throws EmployeeException, IOException;
	public abstract void displayAll() throws EmployeeException, IOException;
	public abstract void displayComp();
	public abstract void delete(int id);
	public abstract void update(int id, Employee emp);
	//update
	//delete
	//CRUD --> create , read, update, delete
}
