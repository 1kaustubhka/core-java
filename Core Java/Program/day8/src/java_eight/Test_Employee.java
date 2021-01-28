package java_eight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test_Employee {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		for (int i=1; i<10000;i++)
		{
		list.add(new Employee(100+i,"k",22,1000));
//		list.add(new Employee(102+i,"r",22,1000));
//		list.add(new Employee(103+i,"n",21,1000));
//		list.add(new Employee(104,"v",22,1000));
//		list.add(new Employee(105,"a",20,1000));
		}
		list
		//.parallelStream()
		.stream()
		.filter(e -> e.getId()>7000)
		
		//.skip(1)
		.limit(5)
		//.sorted((e1,e2)-> e2.getId() - e1.getId())
		//.map(e -> {e.setName(e.getName().toUpperCase()); return e;})
		.forEach((e)-> System.out.println(e));
		//.findFirst();
		//System.out.println(firstRecord.get());
	}
}
