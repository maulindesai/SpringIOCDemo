package model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String email;
    ArrayList<Expenses> expensesList;

    public static Person createInstance(String name, String email, List<Expenses> expenses) {
        Person person = new Person();
        person.name=name;
        person.email=email;
        person.expensesList=new ArrayList<>(expenses);
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", expensesList=" + expensesList +
                '}';
    }
}
