package com.vijay.mongoTemplateIntegration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

@Document(collection = "person")

public class Person {

    @Id
    private String personId;
    private String name;
    private int age;
    private List<String> favouriteBooks;
    private Date dob;

    public Person(){

    }

    public Person(String personId, String name, int age, List<String> favouriteBooks, Date dob) {
        this.personId = personId;
        this.name = name;
        this.age = age;
        this.favouriteBooks = favouriteBooks;
        this.dob = dob;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFavouriteBooks() {
        return favouriteBooks;
    }

    public void setFavouriteBooks(List<String> favouriteBooks) {
        this.favouriteBooks = favouriteBooks;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    private int getDiffYears(Date first, Date last) {
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int diff = b.get(YEAR) - a.get(YEAR);
        if (a.get(MONTH) > b.get(MONTH) ||
                (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
            diff--;
        }
        return diff;
    }
    private Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", favouriteBooks=" + favouriteBooks +
                ", dob=" + dob +
                '}';
    }
}