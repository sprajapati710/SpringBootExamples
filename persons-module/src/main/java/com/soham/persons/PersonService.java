package com.soham.persons;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public List<PersonEntity> getAllPersons() {
		List<PersonEntity> persons = new ArrayList<>(); 
		personRepository.findAll().forEach(persons::add);;
		return persons;
	}

	public void addPerson(PersonEntity person) {
		personRepository.save(person);
	}

	public void updatePerson(int id) {
	}

	public void deletePerson(int id) {
		// TODO Auto-generated method stub
	}

}
