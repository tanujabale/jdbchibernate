package com.person.Information;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Voter {
	@Id
	private int id2;
	
	private String name;
	
	@OneToMany(mappedBy="voter",fetch=FetchType.LAZY)
	private List<Contact>contact;

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Voter [id2=" + id2 + ", name=" + name + ", contact=" + contact + "]";
	}

	public Voter(int id2, String name, List<Contact> contact) {
		super();
		this.id2 = id2;
		this.name = name;
		this.contact = contact;
	}

	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}

}
