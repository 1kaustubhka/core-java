package com.cybage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<String> skills = new LinkedList<>();
		
		skills.add("Java");
		skills.add("Angular");
		skills.add("spring");
		skills.add(1, "JavaScript");
		System.out.println("------1. Using SysOut-----");
		System.out.println(skills);
		
		//2. Using for each
		System.out.println("--------2. Using for each-------");
		for(String s : skills)
		{
			System.out.println(s);
		}
		System.out.println("------3. Using Iterator--------");
		Iterator<String> skillIterator = skills.iterator();
//		while(skillIterator.hasNext())
//		{
			
//		}
		System.out.println("------4. Remove By Value--------");
		skills.remove("spring");
		
		System.out.println("------5. Remove By Index--------");
		skills.remove(1);
		
		System.out.println("------6. Search by Index--------");
		System.out.println("Skill at 2: "+skills.get(1));
		
		
		skills.add("spring");
		skills.add("JavaScript");
		System.out.println(skills);
		
		System.out.println("------7. Search using Object and get Index--------");
		System.out.println("Skill at 2: "+skills.lastIndexOf("Angular"));
		
		
		
		
		
	}
}
