package com.FourDataFormat.json;

import java.util.ArrayList;
import java.util.List;

public class PersonGroup {
    private String name;
    private List<Person> persons=new ArrayList<>();

    public PersonGroup(String name, List<Person> persons) {
        this.name = name;
        this.persons = persons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "PersonGroup{" +
                "name='" + name + '\'' +
                ", persons=" + persons +
                '}';
    }
}
