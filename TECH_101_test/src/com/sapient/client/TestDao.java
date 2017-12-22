package com.sapient.client;

import java.util.Map;
import java.util.Set;

import com.sapient.dao.ExamDaoImpl;
import com.sapient.dao.IDao;
import com.sapient.vo.Questions;

public class TestDao {

	public static void main(String[] args) {
		IDao dao=ExamDaoImpl.getDaoInstance();
		Map<Integer,Questions> map= dao.viewQuestios();
		System.out.println(map.size());
		
		
		Set<Integer> set=map.keySet();
		for(int qid: set){
			Questions question=map.get(qid);
			System.out.println(question.getQid());
			System.out.println(question.getQdesc());
			System.out.println(question.getOpta());
			System.out.println(question.getOptb());
			System.out.println(question.getOptc());
			System.out.println(question.getAnswer());
			
		}
		

	}

}
