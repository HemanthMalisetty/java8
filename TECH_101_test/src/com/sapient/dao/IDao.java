package com.sapient.dao;

import java.util.Map;

import com.sapient.vo.Questions;

public interface IDao {
		Map<Integer,Questions> viewQuestios();
}
