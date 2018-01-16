package com.service;

import java.util.ArrayList;
import java.util.List;

public class Gemeente {

	private int id;
	private String naam;
	private List<Review> reviews = new ArrayList<Review>();
	
	public Gemeente(){
		
	}
	
	public Gemeente(int id, String naam){
		this.setId(id);
		this.setNaam(naam);
	}

	

	public int getId() {
		return id;
	}

	public String getNaam() {
		return naam;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	public void addReview(Review rev){
		this.reviews.add(rev);
	}
}
