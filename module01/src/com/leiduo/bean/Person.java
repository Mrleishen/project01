package com.leiduo.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Person {
    private String name;
    private Date date;
    private static int num;

    public Person(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public static void main(String[] args) {
        //region Description
        System.out.println("ddddddddffff21");

        System.out.println("ddddddddffff222");

        System.out.println("ddddddddffff3333");
        //endregion

        Date date = new Date();

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(123);

        methods();


    }

    public static void methods() {
        num = 0;


        try {
            FileInputStream stream = new FileInputStream("ddd");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(date, person.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, date);
    }
}
