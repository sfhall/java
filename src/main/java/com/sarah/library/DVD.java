package com.sarah.library;
import java.util.ArrayList;
import java.util.List;

public class DVD extends Media
{
    String director;

    public DVD(String name, String director, String date)
    {
        super(name, date);
        this.director = director;
    }

    public void printDetails()
    {
        String base = printInfo();
        String full = "Director: " + director + base;
        System.out.println(full);
    }

}