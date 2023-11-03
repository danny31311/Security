package com.example.FirstSecurityApp.services;

import com.example.FirstSecurityApp.models.Person;
import com.example.FirstSecurityApp.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//PersonService был создан ради корректного использования валидатора, если использовать PersonDetailsService, то мы будем полагать на
//выброшенное исключение
@Service
public class PersonService {
    private final PeopleRepository peopleRepository;
    @Autowired
    public PersonService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public Optional<Person> findByUsername (String Username){
        return peopleRepository.findByUsername(Username);

    }

}
