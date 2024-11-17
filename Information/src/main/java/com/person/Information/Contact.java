package com.person.Information;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Contact {
	@Id
	private int id;
	
	private int contactid;
	
	@ManyToOne
	 private Voter voter;
	
	private int contactNum;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContactid() {
		return contactid;
	}

	public void setContactid(int contactid) {
		this.contactid = contactid;
	}

	public Voter getVoter() {
		return voter;
	}

	public void setVoter(Voter voter) {
		this.voter = voter;
	}

	public int getContactNum() {
		return contactNum;
	}

	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", contactid=" + contactid + ", voter=" + voter + ", contactNum=" + contactNum
				+ "]";
	}

	public Contact(int id, int contactid, Voter voter, int contactNum) {
		super();
		this.id = id;
		this.contactid = contactid;
		this.voter = voter;
		this.contactNum = contactNum;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
