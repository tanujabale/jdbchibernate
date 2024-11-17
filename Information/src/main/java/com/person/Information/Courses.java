package com.person.Information;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Courses {
	@Id
	private int S_id;
	
	private String coursename;
	
	@ManyToMany
	private List<Student>st;

	public int getS_id() {
		return S_id;
	}

	public void setS_id(int s_id) {
		S_id = s_id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public List<Student> getSt() {
		return st;
	}

	public void setSt(List<Student> st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "Courses [S_id=" + S_id + ", coursename=" + coursename + ", st=" + st + "]";
	}

	public Courses(int s_id, String coursename, List<Student> st) {
		super();
		S_id = s_id;
		this.coursename = coursename;
		this.st = st;
	}

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}