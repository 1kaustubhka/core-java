package com.cybage;

public class WrapperExample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		int salary =123;
		
		Integer iObj = new Integer(100);
		Integer iObj1 = 12345;
		
		String name = new String("KK");
		String name1 = "Kaustubh";
		//object will be created and placed in the string pool.
		//if already existing(in string pool) then we will reuse the same object
		
		
	}
}
