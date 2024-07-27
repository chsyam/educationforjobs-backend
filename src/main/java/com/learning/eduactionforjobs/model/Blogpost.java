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
@Table(name = "blogposts")
public class Blogpost {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Integer id;

	@Column(name = "publisher_name")
	private String publisherName;

	@Column(name = "title", length = 1000)
	private String title;

	@Column(name = "content", length = 10000)
	private String content;

	@Column(name = "video_url")
	private String videoUrl;

	@Column(name = "resource_url")
	private String resourceUrl;

	@Column(name = "posted_at")
	@CurrentTimestamp
	private OffsetDateTime postedAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public OffsetDateTime getPostedAt() {
		return postedAt;
	}

	public void setPostedAt(OffsetDateTime postedAt) {
		this.postedAt = postedAt;
	}

	public Blogpost(Integer id, String title,String publisherName, String content, String videoUrl, String resourceUrl,
			OffsetDateTime postedAt) {
		super();
		this.id = id;
		this.title = title;
		this.publisherName = publisherName;
		this.content = content;
		this.videoUrl = videoUrl;
		this.resourceUrl = resourceUrl;
		this.postedAt = postedAt;
	}

	public Blogpost() {
		super();
	}
}