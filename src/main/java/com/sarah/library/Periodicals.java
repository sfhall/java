package com.sarah.library;
import java.util.ArrayList;
import java.util.List;

public class Periodicals extends Media
{
    String author;
    public Periodicals(String name, String author, String date)
    {
        super(name, date);
        this.author = author;
    }

    public void printDetails()
    {
        String base = printInfo();
        String full = "Author: " + author + base;
        System.out.println(full);
    }
}
