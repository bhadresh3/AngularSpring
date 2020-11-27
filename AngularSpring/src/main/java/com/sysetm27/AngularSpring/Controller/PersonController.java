package com.sysetm27.AngularSpring.Controller;
import com.sysetm27.AngularSpring.Model.Person;
import com.sysetm27.AngularSpring.Service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

    private final PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Person> findAllPerson() {
        return personService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/find")
    @ResponseStatus(HttpStatus.OK)
    public List<Person> search(@RequestParam("category") String category, @RequestParam("search") String search){
        if(category.equals("name")){
            return personService.findByNameLike("%" + search + "%");
        } else {
            return personService.findByAboutLike("%" + search + "%");
        }
    }
}