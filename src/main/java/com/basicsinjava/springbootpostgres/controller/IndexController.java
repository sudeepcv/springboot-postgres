package com.basicsinjava.springbootpostgres.controller;

import com.basicsinjava.springbootpostgres.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.basicsinjava.springbootpostgres.model.Person;

@RestController
public class IndexController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public List<Person> getPersons() {

        return personService.getPersons();

    }

}