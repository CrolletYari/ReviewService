package com.service;

import java.util.Date;

public class Review {

	private String title;
	private String content;
	private Date date;
	private String author;
	private int point;
	
	public Review(String title, String content, String author, int point) {
		this.setTitle(title);
		this.setContent(content);
		this.setDate(new Date());
		this.setAuthor(author);
		this.setPoint(point);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
