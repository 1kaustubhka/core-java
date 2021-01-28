package com.cybage;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductExample {
	public static void main(String[] args) {
		//Set<Product> products = new HashSet<>();
		   Set<Product> products = new TreeSet<>(new IdComparator());
	        
		products.add(new Product(1,"ipad pro",75000,87));
		products.add(new Product(2,"iphone x",55000,30));
		products.add(new Product(3,"macbook pro",99000,5));
		products.add(new Product(4,"macbook air",60000,26));
		products.add(new Product(4,"macbook air",60000,26));
		
		System.out.println(products);
		
	}
}
