package com.learning.eduactionforjobs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.eduactionforjobs.model.Blogpost;
import com.learning.eduactionforjobs.service.BlogpostService;

@RestController
public class BlogpostController {
	@Autowired
	private BlogpostService blogpostService;

	@PostMapping("/api/blogs/create")
	public ResponseEntity<String> createBlog(@RequestBody Blogpost blogpost) {
		Blogpost savedPost = blogpostService.savePost(blogpost);
		if (savedPost != null) {
			return new ResponseEntity<>("Blog Created successfully...!", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Error in creating Blog. Please try again later...!",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/api/blogs/all")
	public List<Blogpost> fetchAllBlogs(){
		return blogpostService.fetchAllBlogs();
	}
	
	@GetMapping("/api/blogs/{id}")
	public Optional<Blogpost> fetchBlog(@PathVariable("id") int id) {
		return blogpostService.fetchBlog(id);
	}
}