package com.cybage.service;

import java.io.IOException;

import com.cybage.exception.EmployeeException;
import com.cybage.model.Employee;

public interface EmployeeService {
	public abstract void add(String name, String address, int comp, String type) throws EmployeeException, Exception;
	public abstract void displayAll() throws EmployeeException, Exception;
	public abstract void displayComp();
	public abstract void delete(int id) throws Exception;
	public abstract void update(int id, String name, String address, int comp, String type) throws Exception;
	//update
	//delete
	//CRUD --> create , read, update, delete
}
