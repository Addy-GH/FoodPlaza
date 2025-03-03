package com.squad.Dao;

import java.util.List;

import com.squad.Pojo.Feedback;

public interface FeedbackDao {
	
	boolean addFeedback(Feedback fd);
	List<Feedback>getAllFeedback();

}
