package com.arcesium.axl.rest.api.service;

import java.util.List;

import com.arcesium.axl.rest.api.model.Person;

public interface IPeopleService {
	public List<Person> getPeople();
	public List<Person> getPeople(String name);
	public Person getPerson(int id);
	public int addPerson(Person person);
	public void updatePerson(int id, Person person);
	public void deletePerson(int id);
}
