package com.sapient.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.IDao;
import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Employee;

public class EmployeeClient {

	static Scanner scanner =new  Scanner(System.in);
	static IDao dao=DaoFactory.getDaoInstance();
	public static void main(String[] args) {
		String menu=null;
		String option=null;
		Menu emenu=null;
		
		do{
		
			System.out.println("Choose: ADD\nVIEW\nVIEWALL\nUPDATE\nREMOVE\nDEPTSINFO\nEMPBYDEPTID");
			menu=scanner.next();
			try {
				emenu=Menu.valueOf(menu);
				processMenu(emenu);
			} catch (Exception e) {
				System.out.println("Invalid Menu Option");
			}
			System.out.println("Press y to continue...");
			option = scanner.next();
		}while(option.equalsIgnoreCase("y") );
		

	}
	
	public static void processMenu(Menu menu) throws NotFoundException{
		switch(menu){
		case ADD:
			add();
			break;
		case VIEW:
			viewById();
			break;
		case VIEWALL:
			viewAll();
			break;
			
		
		
//		case UPDATE:
//			update();
//			break;
//		case REMOVE:
//			remove();
//			break;
		case DEPTS_INFO:
			viewAllDepartments();
			break;
		case EMP_BY_DEPTID:
			viewEmployeeByDepartmentId();
			break;
		}
		
	}
	public static void viewAllDepartments() {
		
	}
	public static void viewEmployeeByDepartmentId() {
		
	}
	public static void viewAll() {
		List<Employee> list=dao.viewAllEmployee();
			for (Employee employee : list) {
				System.out.println(employee);
			}
	}
	
	public static void viewById(){
		System.out.println("Enter employee id");
		int eid=scanner.nextInt();
		try {
			
			dao.viewEmployee(eid);
			
			System.out.println(dao.viewEmployee(eid));
		} catch (NotFoundException e) {
			e.getMessage();
		}
	}
	
	public static void add(){
		System.out.println("Enter employee id ");
		int eid=scanner.nextInt();
		System.out.println("Employee name: ");
		String ename=scanner.next();
		System.out.println("salary");
		double salary=scanner.nextDouble();
		System.out.println("department id");
		int did=scanner.nextInt();
		System.out.println("date");
		String strdate=scanner.next();
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("DD-MM-YYYY");
		LocalDate doj =LocalDate.parse(strdate,dateTimeFormatter);
		
		Employee employee= new Employee(eid, ename, salary, did, doj);
		try {
			dao.addEmployee(employee);
			System.out.println("Employee added");
		} catch (IdException e) {
			e.getMessage();
		}
		
		
	}

}
