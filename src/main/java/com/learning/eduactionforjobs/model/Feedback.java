package com.learning.eduactionforjobs.model;

import java.time.OffsetDateTime;

import org.hibernate.annotations.CurrentTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Integer id;

	@Column(name = "username")
	private String username;

	@Column(name = "email")
	private String email;

	@Column(name = "comment")
	private String comment;

	@Column(name = "created_at")
	@CurrentTimestamp
	private OffsetDateTime createdAt;

	@Column(name = "related_blog_id")
	private String relatedBlogId = "NA";

	public Feedback() {
	}

	public Feedback(String username, String email, String comment, OffsetDateTime createdAt, String relatedBlogId) {
		super();
		this.username = username;
		this.email = email;
		this.comment = comment;
		this.createdAt = createdAt;
		this.relatedBlogId = relatedBlogId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getRelatedBlogId() {
		return relatedBlogId;
	}

	public void setRelatedBlogId(String relatedBlogId) {
		this.relatedBlogId = relatedBlogId;
	}
}
