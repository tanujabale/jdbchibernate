package com.person.Information;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
@Cacheable
@Cache(usage= CacheConcurrencyStrategy.READ_WRITE)
public class Person {
	@Id
	private int id;
	
	private String name;
	
	@OneToOne(mappedBy="person",cascade=CascadeType.MERGE)
	private Adhar adhar_detail;
	public Adhar getAdhar_detail() {
		return adhar_detail;
	}
	public void setAdhar_detail(Adhar adhar_detail) {
		this.adhar_detail = adhar_detail;
	}
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
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", adhar_detail=" + adhar_detail + "]";
	}
	public Person(int id, String name, Adhar adhar_detail) {
		super();
		this.id = id;
		this.name = name;
		this.adhar_detail = adhar_detail;
	}
	public Person(Adhar adhar_detail) {
		super();
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
