package com.cybage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserExample {
	public static void main(String args[])
	{
		List<User> users = new ArrayList<>();
		
		users.add(new User(101,"K"));
		users.add(new User(104,"A"));
		users.add(new User(103,"U"));
		users.add(new User(102,"S"));
		
		for(User s : users)
		{
			s.display();
		}
		
		users.remove(new User(102,"S"));
		
//		Collections.sort(users);
	}
}
