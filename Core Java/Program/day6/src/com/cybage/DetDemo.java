package com.cybage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DetDemo {
	public static void main(String[] args) {
		System.out.println("------------HashSet----------");
		
		Set<String> skills = new HashSet<>();
		
		skills.add("Song Writer");
		skills.add("Song Producer");
		skills.add("Song Vocalist");
		
		skills.add("Song Writer");
		skills.add("Song Producer");
		skills.add("Song Vocalist");
		
		System.out.println(skills);
		
		//iterator
		Iterator<String> ssit= skills.iterator();
	
		while(ssit.hasNext())
		{
			System.out.println(ssit.next());
		}
		
		System.out.println("-=------------Linked Hashset---------------");
		
		Set<String> skill = new LinkedHashSet<>();
		
		skill.add("Song Writer");
		skill.add("Song Producer");
		skill.add("Song Vocalist");
		

		
		System.out.println(skill);
		
		//iterator
		Iterator<String> sit= skill.iterator();
	
		while(sit.hasNext())
		{
			System.out.println(sit.next());
		}
		
		
System.out.println("-----------TreeSet---------------");
		
		Set<String> skil = new TreeSet<>();
		
		skil.add("Song Writer");
		skil.add("Song Producer");
		skil.add("Song Vocalist");
		

		
		System.out.println(skil);
		
		//iterator
		Iterator<String> st= skil.iterator();
	
		while(st.hasNext())
		{
			System.out.println(st.next());
		}
		
	}
}
