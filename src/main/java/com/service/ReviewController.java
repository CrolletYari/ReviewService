package com.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {
	
	private ReviewDb reviewDb;
	
	public ReviewController(){
		reviewDb = new ReviewDb();
	}
	
	@RequestMapping(value ="/reviews")
	public List<Gemeente> getReviews(){
		return reviewDb.getReviews();
	}
	
	@RequestMapping(value ="/reviews/{city}")
	public Gemeente getReviewsCity(@PathVariable String city){
		return reviewDb.getReviewsCity(city);
	}
}
