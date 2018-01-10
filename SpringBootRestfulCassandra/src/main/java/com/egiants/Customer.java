package com.egiants;

import org.springframework.data.annotation.Id;

public class Customer {
	@Id
	private String id;
	private String description;
	private String title;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", description=" + description + ", title=" + title + "]";
	}

	public Customer(String id, String description, String title) {
		super();
		this.id = id;
		this.description = description;
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
