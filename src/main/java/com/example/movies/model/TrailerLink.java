package com.example.movies.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies_trailer_link")
public class TrailerLink {
	@Id
	private long id;
	private String key;
	private String name;
	
	
	public TrailerLink() {
		super();
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
