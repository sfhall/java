package com.sarah.library;

import java.util.ArrayList;
import java.util.List;

public class library {

    /*

    public class DVD extends Media
    {
        String director;
        public DVD(String name, String director, String date)
        {
            super(name, date);
            this.director = director;
        }
    }

    public class Periodical extends Media
    {
        String author;
        public Periodical(String name, String author, String date)
        {
            super(name, date);
            this.author = author;
        }
    }*/
    //end media and subclasses ------------------------------------

    //Lib.com.sarah.library.library info
    private List<Media> mediaList;


    public library()
    {
        this.mediaList = new ArrayList<Media>();
    }

    public List<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    public void checkOut(Media out)
    {
        //find media the set available to false
        if(out instanceof Periodicals)
        {
            System.out.println("Cannot check out periodicals.");
            return;
        }

        if(mediaList.contains(out))
        {
            if(out.available) {
                out.setAvailable(false);
                System.out.println("Successfully checked out " + out.getName());
            }
        }
    }

    public void checkIn(Media in)
    {
        //find media then set available to true
        if(mediaList.contains(in))
        {
            if(!in.available)
            {
                in.setAvailable(true);
                System.out.println("Successfully check in " + in.getName());
            }

        }
    }

    public void printLib()
    {
        System.out.println("Library contents:");
        for (Media media : mediaList) {
            System.out.println(media.printInfo());
        }
    }

    public void printAvailable()
    {
        System.out.println("Currently Available:");
        for (Media media : mediaList) {
            if (media.isAvailable())
                System.out.println(media.printInfo());
        }
    }

    public void printChecked()
    {
        System.out.println("Currently Checked Out:");
        for (Media media : mediaList) {
            if (!media.isAvailable())
                System.out.println(media.printInfo());
        }
    }


    public void addMedia(Media in)
    {
        //add media into list
        mediaList.add(in);
    }

}
