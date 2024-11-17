package com.person.Information;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Adhar {
	@Id
	private int adharnum;
	@OneToOne
	@JoinColumn(name="data")
	private Person person;
	
	private String city;

	public int getAdharnum() {
		return adharnum;
	}

	public void setAdharnum(int adharnum) {
		this.adharnum = adharnum;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Adhar [adharnum=" + adharnum + ", person=" + person + ", city=" + city + "]";
	}

	public Adhar(int adharnum, Person person, String city) {
		super();
		this.adharnum = adharnum;
		this.person = person;
		this.city = city;
	}

	public Adhar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
