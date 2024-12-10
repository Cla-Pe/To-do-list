package com.example.demo.model;

import java.time.LocalDate;

public class Task {
  
    private Long id;

    private String title;
    private String description;
    private boolean completed;
    private LocalDate dueDate;
    private Category category;
    
    
	public Task(Long id, String title, String description, boolean completed, LocalDate dueDate, Category category) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.completed = completed;
		this.dueDate = dueDate;
		this.category = category;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isCompleted() {
		return completed;
	}


	public void setCompleted(boolean completed) {
		this.completed = completed;
	}


	public LocalDate getDueDate() {
		return dueDate;
	}


	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}
    
    
    
    
    
}
