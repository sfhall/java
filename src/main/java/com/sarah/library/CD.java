package com.sarah.library;

public class CD extends Media
{
    String artist;
    public CD(String name, String artist, String date)
    {
        super(name, date);
        this.artist = artist;
    }

    public void printDetails()
    {
        String base = printInfo();
        String full = "Artist: " + artist + base;
        System.out.println(full);
    }
}

