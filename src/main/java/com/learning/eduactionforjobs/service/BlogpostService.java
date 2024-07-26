package com.learning.eduactionforjobs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.eduactionforjobs.model.Blogpost;
import com.learning.eduactionforjobs.repository.BlogpostRepository;

@Service
public class BlogpostService {
	@Autowired
	private BlogpostRepository blogpostRepository;
	
	public Blogpost savePost(Blogpost blogpost) {
		Blogpost savedPost = blogpostRepository.save(blogpost);
		return savedPost;
	}
	
	public List<Blogpost> fetchAllBlogs(){
		return blogpostRepository.findAll();
	}
	
	public Optional<Blogpost> fetchBlog(int id) {
		return blogpostRepository.findById(id);
	}
}