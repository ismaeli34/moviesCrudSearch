package com.example.movies.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies_cast")
public class Cast {
	@Id
	private long id;
	private String name;
	private String profile_path;
	private String character;
	private int cast_id;
	
	public Cast() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProfile_path() {
		return profile_path;
	}
	public void setProfile_path(String profile_path) {
		this.profile_path = profile_path;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public int getCast_id() {
		return cast_id;
	}
	public void setCast_id(int cast_id) {
		this.cast_id = cast_id;
	}

	

	

}
