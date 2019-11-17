package com.basicsinjava.springbootpostgres.service;

import java.util.List;

import com.basicsinjava.springbootpostgres.model.Person;
import com.basicsinjava.springbootpostgres.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

}