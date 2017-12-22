package com.sapient.service;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.sapient.dao.ExamDaoImpl;
import com.sapient.dao.IDao;
import com.sapient.util.ExamUtil;
import com.sapient.vo.Answer;
import com.sapient.vo.Questions;




public class ExamSerImpl  implements IExamSer{
	
	private static IExamSer ser=new ExamSerImpl();
	static  private Map<Integer,Questions> qmap;
	
	
	static{
		IDao dao= ExamDaoImpl.getDaoInstance();
		qmap=dao.viewQuestios();
	}
	private ExamSerImpl(){
		
	}
	
	public static IExamSer getInstance() {
		return ser;
	}

	@Override
	public List<Questions> generateQuestions() {
		List<Questions> list=new ArrayList<Questions>();
		Set<Integer> qids=ExamUtil.generateUniqueNOs(5);
		Questions question=null;
		for(int qno:qids){
			question=qmap.get(qno);
			list.add(question);
		}
		return list;
	}

	@Override
	public int evaluate(List<Answer> anslist) {
		
		
		
		int score =0;
		Questions questions;
		for (Answer answer : anslist) {
			questions=qmap.get(answer.getQid());
			if(questions.getAnswer().equalsIgnoreCase(answer.getAnswer()));
			++score;
		}
		return score;
	}
	
	
	
}
