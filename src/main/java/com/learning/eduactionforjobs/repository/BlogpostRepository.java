package com.learning.eduactionforjobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.eduactionforjobs.model.Blogpost;

public interface BlogpostRepository extends JpaRepository<Blogpost, Integer>{

}
