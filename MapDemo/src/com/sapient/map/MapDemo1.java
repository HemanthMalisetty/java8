package com.sapient.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.sapient.map.Employee;

public class MapDemo1 {

	public static void main(String[] args) {
	
		Employee emp1= new Employee(1001, "manav", 5464);
		Employee emp2= new Employee(1003, "tanav", 6456);
		Employee emp3= new Employee(1005, "savan", 56456);
		Employee emp4= new Employee(1006, "vavan", 34534);
		Employee emp5= new Employee(1003, "ravan", 34554);

		Map<Integer,Employee> map= new HashMap<Integer,Employee>();
		
		map.put(1001, emp1);
		map.put(1003, emp2);
		map.put(1005, emp3);
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter employee id");
		int eid=scanner.nextInt();
		if(map.containsKey(eid)){
			Employee emp=map.get(eid);
			System.out.println(emp);
		}else
			
		System.out.println("Not found");
		
		
	}

}
