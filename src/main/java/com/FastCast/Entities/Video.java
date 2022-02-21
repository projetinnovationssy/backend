package com.FastCast.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Video implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id ;
	
	private String name;
	
	private String description;
	
	private String thumbnail_location;
	
	private String video_location;
	
	@ManyToOne
	private User user ;
	
	private boolean visibility;

	public Video() {
		super();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getThumbnail_location() {
		return thumbnail_location;
	}

	public void setThumbnail_location(String thumbnail_location) {
		this.thumbnail_location = thumbnail_location;
	}

	public String getVideo_location() {
		return video_location;
	}

	public void setVideo_location(String video_location) {
		this.video_location = video_location;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}
	
	
	

}
