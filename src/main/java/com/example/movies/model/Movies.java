package com.example.movies.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * @author ronneyismael
 *
 */

/*
Entities in JPA are nothing but POJOs representing data that can be persisted to the database.
An entity represents a table stored in a database. Every instance of an entity represents a row in the table.
*/
@Entity
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String director;
	private String language;
	private String genre;
	private String release_date;
	private String ratings;
	private String overview;
	private String poster_path;
	private String backdrop_path;
	@OneToMany
	private List<Cast>  cast;
	@OneToOne
	private TrailerLink trailer;
	private int vote_average;





	public Movies(int id, String title, String director,
		String language, String genre, String release_date,
		
		String ratings,String overview,String poster_path,String backdrop_path,int vote_average) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.language = language;
		this.genre = genre;
		this.release_date = release_date;
		this.ratings = ratings;
		this.overview = overview;
		this.poster_path = poster_path;
		this.backdrop_path = backdrop_path;
		this.vote_average = vote_average;

	}
	
	public TrailerLink getTrailer() {
		return trailer;
	}

	public void setTrailer(TrailerLink trailer) {
		this.trailer = trailer;
	}

	public List<Cast> getCast() {
		return cast;
	}

	public void setCast(List<Cast> cast) {
		this.cast = cast;
	}

	public  Movies(){

	}
	
	public String getBackdrop_path() {
		return backdrop_path;
	}

	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}

	public int getVote_average() {
		return vote_average;
	}

	public void setVote_average(int vote_average) {
		this.vote_average = vote_average;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getPoster_path() {
		return poster_path;
	}

	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public String toString(){
	return "Movies [id="+id+",title="
			+title+",director="
			+director+",language="
			+language+",genre="+genre+",release_date="+release_date+",ratings="+ratings+"]";
	}
}
