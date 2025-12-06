package Mapping;

import java.util.TreeMap;

public class TestMap {
	
	public static void main(String []a) {
		
		TreeMap tm1= new TreeMap();
		tm1.put(new MyKey(18), new Employee(18,"virat",25000));
		tm1.put(new MyKey(45), new Employee(45,"Rohit",25000));
		tm1.put(new MyKey(12), new Employee(12,"yuvi",25000));
		tm1.put(new MyKey(7), new Employee(7,"Dhoni",25000));
		
		if(tm1.containsKey(new MyKey(7))) {
			
			System.out.println("Found");
		}
		else {
			System.out.println("not found");
		}
		System.out.println(tm1);
		
	}

}
