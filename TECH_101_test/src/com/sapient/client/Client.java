package com.sapient.client;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sapient.service.ExamSerImpl;
import com.sapient.service.IExamSer;
import com.sapient.vo.Answer;
import com.sapient.vo.Questions;

public class Client {
		public static void main(String [] args) {
			Scanner  scanner=new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name=scanner.nextLine();
			
			System.out.println("Start quiz");
			IExamSer ser= ExamSerImpl.getInstance();
			List<Questions> list=ser.generateQuestions();
			List<Answer> ansList= new ArrayList<Answer>();
			Answer answer=null;
			int i=0;
			
			for (Questions questions : list) {
				System.out.println("Questions no "+ ++i +")"+ "	"+questions.getQdesc()+"\n" );
				System.out.println(questions.getOpta());
				System.out.println(questions.getOptb());
				System.out.println(questions.getOptc());
				String str=scanner.next();
				answer=new Answer(questions.getQid(), questions.getAnswer());
				ansList.add(answer);
								System.out.println("-----------------------------------------------------------");
			}
			int score=ser.evaluate(ansList);
			System.out.println(name+" your score is "+ score);
			
		}
}
