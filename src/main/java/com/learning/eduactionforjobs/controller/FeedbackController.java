package com.learning.eduactionforjobs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.eduactionforjobs.model.Feedback;
import com.learning.eduactionforjobs.service.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackService;
	
	@PostMapping("/api/submitfeedback")
	public Feedback SubmitForm(@RequestBody Feedback feedback) {
		Feedback savedFeedback = feedbackService.submitFeedback(feedback);
		return savedFeedback;
	}
}