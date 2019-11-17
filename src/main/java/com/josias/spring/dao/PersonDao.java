package com.josias.spring.dao;

import com.josias.spring.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person Person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();
}
