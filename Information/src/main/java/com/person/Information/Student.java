package com.person.Information;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Student {
	@Id
	private int rollno;
	
	private String name;
	
	@ManyToMany(mappedBy="st")
	private List<Courses>courses;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", courses=" + courses + "]";
	}

	public Student(int rollno, String name, List<Courses> courses) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.courses = courses;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}