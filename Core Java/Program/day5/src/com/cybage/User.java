package com.cybage;

public class User {
	public
	String Name;
	int id;
	
	void display()
	{
		System.out.println("Name: "+Name+" ID: "+id);
	}
	
	User(int i, String s)
	{
		this.id=i;
		this.Name=s;
	}
	
}
