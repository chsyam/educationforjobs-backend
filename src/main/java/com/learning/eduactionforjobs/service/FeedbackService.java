package com.learning.eduactionforjobs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.eduactionforjobs.model.Feedback;
import com.learning.eduactionforjobs.repository.FeedbackRepository;

@Service
public class FeedbackService {
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public Feedback submitFeedback(Feedback feedback) {
		Feedback savedFeedback = feedbackRepository.save(feedback);
		return savedFeedback;
	}
}
