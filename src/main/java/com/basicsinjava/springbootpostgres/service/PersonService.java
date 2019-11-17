package com.basicsinjava.springbootpostgres.service;

import java.util.List;

import com.basicsinjava.springbootpostgres.model.Person;

public interface PersonService {

    List<Person> getPersons();

}