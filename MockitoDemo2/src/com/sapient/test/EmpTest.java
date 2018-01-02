package com.sapient.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.sapient.dao.EmployeeDao;

import com.sapient.service.EmployeeService;
import com.sapient.service.EmployeeServiceImpl;

import com.sapient.vo.Employee;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class EmpTest {

	@Mock
	EmployeeDao dao;

	@InjectMocks
	EmployeeService ser = new EmployeeServiceImpl();

	static List<Employee> idList;
	static List<Employee> nameList;
	static List<Employee> salaryList;

	static Employee e1, e2, e3, e4;

	@BeforeAll
	public static void beforeAll() {
		e1 = new Employee(1003, "rama", 9000);
		e2 = new Employee(1001, "tama", 19000);
		e3 = new Employee(1007, "anna", 8000);
		e4 = new Employee(1002, "sanna", 7000);

		idList = new ArrayList<>();
		idList.add(e2);
		idList.add(e4);
		idList.add(e1);
		idList.add(e3);

		nameList = new ArrayList<>();
		nameList.add(e3);
		nameList.add(e1);
		nameList.add(e4);
		nameList.add(e2);

		salaryList = new ArrayList<>();
		salaryList.add(e4);
		salaryList.add(e3);
		salaryList.add(e1);
		salaryList.add(e2);

	}

	@BeforeEach
	public void beforEach() {
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		when(dao.getEmployee()).thenReturn(list);
	}
	
	
	@Test
	public void empTest1(){
		 List<Employee> actual=ser.viewEmployees("id");
		 
		 assertEquals(idList, actual);
	}
	
	@Test
	public void empTest2(){
		 List<Employee> actual=ser.viewEmployees("id");
		
		 assertTrue(actual.size()==idList.size());
		 
	}
	@Test
	public void empTest3(){
		 List<Employee> actual=ser.viewEmployees("name");
//		 System.out.println(actual+"\njjjjjj");
		 assertEquals(nameList, actual);
	}
	@Test
	public void empTest4(){
		 List<Employee> actual=ser.viewEmployees("name");
		 assertTrue(actual.size()==nameList.size());
	}
	@Test
	public void empTest5(){
		List<Employee> actual=ser.viewEmployees("sal");
		 assertEquals(salaryList, actual);
	}
	@Test
	public void empTest6(){
		List<Employee> actual=ser.viewEmployees("sal");
		 assertTrue(actual.size()==salaryList.size());
	}
	
	@Test
	public void empTest7(){
		assertNull(ser.viewEmployees("xyz"));
	}

}
