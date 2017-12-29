package com.sapient.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.EmpNotFoundException;
import com.sapient.service.EmployeeService;
import com.sapient.service.Factory;
import com.sapient.vo.Employee;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



@DisplayName("Employeedao Test")
@RunWith(JUnitPlatform.class)
public class EmpTest {

	@Test
	@DisplayName("Test employee by id")
	public void EmpTest1(){
		Employee e1= new Employee(1001, "ram", 9000);
		Employee e2= new Employee(1001, "ram", 9000);
		assertEquals(e1, e2);
	}
	
	@Test
	public void EmpTest2() throws EmpNotFoundException{
		EmployeeService ser=Factory.getEmployeeService();
		assumeTrue(ser!=null);
		Employee expected=new Employee(1001,"Ram",20000);
		assertEquals(expected, ser.getEmployee(1001));
		
	}
	
	@Test
	public void EmpTest3() throws EmpNotFoundException{
		EmployeeService ser=Factory.getEmployeeService();
		assumeTrue(ser!=null);
		Employee expected=new Employee(1002,"Tom",27000);
		Employee actual=ser.getEmployee(1002);
		
		assertAll("test all states",
				()-> assertEquals(expected.getEid(), actual.getEid()),
				()-> assertEquals(expected.getEname(), actual.getEname()),
				()-> assertEquals(expected.getSalary(), actual.getSalary()) 
				);
		
	}
	
	@Test
	@DisplayName("Expecting expection nt found")
	public int EmpTest4() throws EmpNotFoundException{
		EmployeeService ser=Factory.getEmployeeService();
		assumeTrue(ser!=null);
		assertThrows(EmpNotFoundException.class, ()->ser.getEmployee(1234) );
		return 3;
	}
	
	
	
}
