package com.cybage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
public static void main(String[] args) {
	System.out.println("------MAP EXAMPLE---------");
//	Map<String,String> capitals = new HashMap<>();
	Map<String,String> capitals = new TreeMap<>();
	
//	Map<String,Long> population = new Hashtable<>();
//	Map<String,Long> population = new HashMap<>();
//	Map<String,Long> population = new TreeMap<>();
//	Map<String,Long> population = new LinkedHashMap<>();
	
	capitals.put("MH","Mumbai");
	capitals.put("GJ","GandhiNagar");
	capitals.put("TL","Hydrabad");
	capitals.put("AP","Hydrabad");
	capitals.put("PB","Chandigarh");
	capitals.put("HY","Chandigarh");
	capitals.put("MH","Pune");
	capitals.put("INDIA","Dehli");
	System.out.println(capitals);
	
	Set<String> state = capitals.keySet();
	System.out.println(state);
	
	Collection<String> cities = capitals.values();
	System.out.println(cities);
	
}
}
