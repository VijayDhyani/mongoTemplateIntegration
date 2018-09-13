package com.vijay.mongoTemplateIntegration.dal;

import com.vijay.mongoTemplateIntegration.model.Person;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface PersonDal {

        Person savePerson(Person person);
        List<Person> getAllPerson();
        List<Person> getAllPersonPaginated(int pageNumber, int pageSize);
        Person findOneByName(String name);
        List<Person> findByBirthDateAfter(Date date);
        List<Person> findByAgeRange(int lowerBound, int upperBound);
        List<Person> findByFavoriteBooks(String favoriteBook);
        void updateMultiplePersonAge(int age);
        Person updateOnePerson(Person person);
        void deletePerson(Person person);
    }

