package com.sapient.client;


import java.util.List;
import java.util.Scanner;

import com.sapient.service.ExamSerImpl;
import com.sapient.service.IExamSer;
import com.sapient.vo.Questions;

public class Client {
		public static void main(String [] args) {
			Scanner  scanner=new Scanner(System.in);
			System.out.println("Sts=art quiz");
			IExamSer ser= ExamSerImpl.getInstance();
			List<Questions> list=ser.generateQuestions();
			int i=0;
			int score=0;
			for (Questions questions : list) {
				System.out.println(i + "	"+questions.getQdesc() );
				System.out.println(questions.getOpta());
				System.out.println(questions.getOptb());
				System.out.println(questions.getOptc());
				String str=scanner.next();
				if(questions.getAnswer().equalsIgnoreCase(str)){
					++score;
				}
				System.out.println("-----------------------------------------------------------");
			}
			
			System.out.println("Youre score is "+ score);
			
		}
}
