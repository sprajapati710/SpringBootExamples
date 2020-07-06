package com.soham.persons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/hi")
	public String getHello() {
		return "Hello!";
	}
	
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public List<PersonEntity> getAllPersons() {
		List<PersonEntity> persons = personService.getAllPersons(); 
		return persons;
	}
	
	@RequestMapping(value = "/persons", method = RequestMethod.POST)
	public void addPerson(@RequestBody PersonEntity person) {
		personService.addPerson(person); 
	}
	
	@RequestMapping(value = "/persons/{id}", method = RequestMethod.PUT)
	public void updatePerson(@PathVariable int id) {
		personService.updatePerson(id); 
	}
	
	@RequestMapping(value = "/persons/{id}", method = RequestMethod.DELETE)
	public void deletePerson(@PathVariable int id) {
		personService.deletePerson(id); 
	}

}
