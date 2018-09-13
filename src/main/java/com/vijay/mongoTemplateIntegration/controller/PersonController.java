package com.vijay.mongoTemplateIntegration.controller;

import com.vijay.mongoTemplateIntegration.dal.PersonDal;
import com.vijay.mongoTemplateIntegration.dal.PersonDalImplementation;
import com.vijay.mongoTemplateIntegration.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private PersonDalImplementation personDalImplementation;


    @GetMapping(value = "/")
    public List<Person> getAll() {
        return personDalImplementation.getAllPerson();
    }
    @RequestMapping(value = "/")
    public Person getOnePersonByName(@PathVariable(value = "{name}") String name) {
        return personDalImplementation.findOneByName(name);
    }
    @RequestMapping(value = "/date")
    public List<Person> getByBirthDateAfter(@PathVariable(value = "{date}") Date date) {
        return personDalImplementation.findByBirthDateAfter(date);
    }
    @RequestMapping(value = "/age")
    public List<Person> getPersonsByAgeRange(@PathVariable(value = "{age}") int lowerbound, int upperbound) {
        return personDalImplementation.findByAgeRange(lowerbound, upperbound);
    }
    @RequestMapping(value = "/book")
    public List<Person> getPersonsByFavouriteBook(@PathVariable(value = "{book}") String favouriteBook) {
        return personDalImplementation.findByFavoriteBooks(favouriteBook);
    }
    @RequestMapping(value = "/pageno")
    public List<Person> getPersonsPaginated(int pageNumber, int pageSize) {
        return personDalImplementation.getAllPersonPaginated(pageNumber, pageSize);
    }
    @PutMapping(value = "/")
    public Person updateOnePerson(@RequestBody Person person) {
        return personDalImplementation.updateOnePerson(person);
    }
    @PostMapping(value = "/age")
    public  void updateMultiplePersonAge(@PathVariable(value = "{age}") int age) {
        personDalImplementation.updateMultiplePersonAge(age);
    }
    @PostMapping(value = "/")
    public Person savePerson(@RequestBody Person person) {
        personDalImplementation.savePerson(person);
        return person;
    }
    @DeleteMapping(value = "/")
    public void deletePerson(Person person) {
        personDalImplementation.deletePerson(person);
    }

}
