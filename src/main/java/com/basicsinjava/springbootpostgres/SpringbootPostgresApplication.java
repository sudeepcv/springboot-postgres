package com.basicsinjava.springbootpostgres;

import com.basicsinjava.springbootpostgres.model.Person;
import com.basicsinjava.springbootpostgres.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPostgresApplication implements ApplicationRunner {
    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPostgresApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        for (int i = 0; i < 5; i++) {
            Person person = new Person();
            person.setName("sudeep-" + i);
            personRepository.save(person);

        }

    }

}
