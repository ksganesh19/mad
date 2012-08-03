package com.durasoft;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="courses")
public class Course {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Course() {
		super();
	}
}