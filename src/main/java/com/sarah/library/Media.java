package com.sarah.library;

public class Media {
    protected String name;
    protected String date;
    protected boolean available;


    //constructor
    public Media(String name, String date)
    {
        this.name = name;
        this.date = date;
        this.available = true;
    }

    //functions
    public boolean isAvailable() {
        return available;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String printInfo()
    {
        String availablity = "Available";

        if(!this.available)
            availablity = "Currently Checked out";

        String info = "Name: " + this.name + " Date published: " + this.date + " Status: " + availablity;
        return info;
    }


}
