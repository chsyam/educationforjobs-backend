package com.learning.eduactionforjobs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.learning.eduactionforjobs.model.Email;


@Service
public class EmailService {

	private RestTemplate restTemplate;

	@Autowired
	public EmailService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public String sendEmail(Email email) {
		return restTemplate.postForObject("http://localhost:8080/api/send-email", email, String.class);
	}
}