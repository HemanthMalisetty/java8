package com.sapient.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmpFileDao implements IDao{
	
	public EmpFileDao() {
		
	}

	@Override
	public List<String> viewEmployee() {
		List<String> list=new ArrayList<String>();
		String name=null;
		try {
			FileReader fileReader=new FileReader("emp.txt");
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			while((name=bufferedReader.readLine())!=null){
				list.add(name);
			}
			
			bufferedReader.close();
			fileReader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
}
