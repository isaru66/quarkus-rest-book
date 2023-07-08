package org.agoncal.quarkus.microservices.book;

import java.time.LocalDate;

public class Person  {
    public String name;
    public String birth;
    public String status;

    public Person(String name, String birth, String status) {
        this.name = name;
        this.birth = birth;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", status='" + status + '\'' +
                '}';
    }
}