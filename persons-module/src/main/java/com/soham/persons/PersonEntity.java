package com.soham.persons;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Person")
public class PersonEntity {
	
	@Id
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	public PersonEntity() {
		
	}

	public PersonEntity(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
