package ru.geekbrains.lesson5.models;

import java.util.Date;
// одна запись бронирования по имени и дате для какого-то столика
public class Reservation {

    private static int counter = 1000;
    private final int id;

    private Date date;
    private String name;

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    {
        id = ++counter;
    }


    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }
}
