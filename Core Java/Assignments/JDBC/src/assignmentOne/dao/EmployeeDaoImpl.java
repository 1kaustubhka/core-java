package assignmentOne.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import assignmentOne.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	
	
	@Override
	public void add(Employee emp, String type) throws Exception{	
		//db operation
		int id = emp.getId();
		String name = emp.getName();
		String address = emp.getAddress();
		int comp = emp.getCompensation();
		
		
		Connection con = DbUtil.getCon();
		PreparedStatement ps = con.prepareStatement("insert into employee values (? , ? , ? , ? , ?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, address);
		ps.setInt(4, comp);
		ps.setString(5, type);
		
		if(ps.executeUpdate()==1) {
			
			System.out.println("record added successfully...");
		}else {
			System.out.println("could not add record in database...");
		}
		ps.close();
		con.close();		
	}

	@Override			//you are trying modify definition of this method 
						//useful to developer
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		Connection con = DbUtil.getCon();
		PreparedStatement ps = con.prepareStatement("delete from employee where id=?");
		ps.setInt(1, id);
		if(ps.executeUpdate()==1) {
			
			System.out.println("record delted successfully...");
		}else {
			System.out.println("could not delete record in database...");
		}
		ps.close();
		con.close();		
	}

	@Override
	public void update(int id, String name, String address, int comp, String type) throws Exception {
		// TODO Auto-generated method stub
		Connection con = DbUtil.getCon();
		PreparedStatement ps = con.prepareStatement("update employee set name = ?, address = ?, comp = ?, type = ? where id=?");
		
		ps.setString(1, name);
		ps.setString(2, address);
		ps.setInt(3, comp);
		ps.setString(4, type);
		ps.setInt(5, id);
		if(ps.executeUpdate()==1) {
			
			System.out.println("record delted successfully...");
		}else {
			System.out.println("could not delete record in database...");
		}
		ps.close();
		con.close();		
	}

	@Override
	public void display() throws Exception {
		//displayAll
Connection con = DbUtil.getCon();
		
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery("select * from employee");

		while(result.next()) {
			System.out.println("ID: "+result.getInt(1) + " Name:"+ result.getString(2)+"Address: "+result.getString(3) + " Comp: "+ result.getInt(4)+"Type: "+result.getString(5));
		}

		result.close();
		statement.close();
		con.close();
	}

}
