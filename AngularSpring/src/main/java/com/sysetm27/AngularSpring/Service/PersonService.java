package com.sysetm27.AngularSpring.Service;
import com.sysetm27.AngularSpring.Model.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person addPerson(Person person);

    List<Person> findByNameLike(String search);

    List<Person> findByAboutLike(String search);
}
