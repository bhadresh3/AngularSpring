package com.sysetm27.AngularSpring.Service;
import com.sysetm27.AngularSpring.Model.Person;
import com.sysetm27.AngularSpring.Repo.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepo personRepo;

    @Override
    public List<Person> findAll() {
        return (List<Person>) personRepo.findAll();
    }

    @Override
    public Person addPerson(Person person) {
        return personRepo.save(person);
    }

    @Override
    public List<Person> findByNameLike(String search) {
        return personRepo.findByNameLikeIgnoreCase(search);
    }

    @Override
    public List<Person> findByAboutLike(String search) {
        return personRepo.findByAboutLikeIgnoreCase(search);
    }
}
