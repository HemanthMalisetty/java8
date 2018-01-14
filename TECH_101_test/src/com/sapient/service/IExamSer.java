package com.sapient.service;

import java.util.List;

import com.sapient.vo.Answer;
import com.sapient.vo.Questions;

public interface IExamSer {
	List<Questions> generateQuestions(int nos);
	int evaluate(List<Answer> anslist);
}
