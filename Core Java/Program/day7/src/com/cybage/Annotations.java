package com.cybage;

@MyAnnotation
public class Annotations {
	@MyAnnotation
	private int abc = 10;
	
	@MyAnnotation
	public Annotations()
	{
		abc = 11;
	}
	@MyAnnotation
	public static void main(String[] args) {
		System.out.println("Annotation");
		
		//@SuppressWarnings("unused")
		int a = 123;
		
	}
	@Deprecated
	public static void display()
	{
		System.out.println("this is display");
	}
	
	public static void newDisplay()
	{
		System.out.println("this is new display");
	}
	
}
