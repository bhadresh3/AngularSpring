package com.sysetm27.AngularSpring.Repo;

import com.sysetm27.AngularSpring.Model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person, Integer> {
}
