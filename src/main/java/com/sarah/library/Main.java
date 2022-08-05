package com.sarah.library;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        library theLib = new library();
        Book test1 = new Book("test", "Author","12.3.05");
        CD lz = new CD("Led Zeppelin III", "Led Zeppelin", "'69");
        DVD fullMetal = new DVD("Full Metal Jacket", "Stanely Kubrick", "'70");
        DVD rushmore = new DVD("Rushmore", "Wes Anderson", "1999");
        CD dk = new CD("Fresh Fruit for Rotting Vegetables", "Dead Kennedys", "'78");
        Book breakfast = new Book("Breakfast of Champions", "Kurt Vonengut", "'80");
        Periodicals science = new Periodicals("Science", "Dr. Hogwash", "1999");

        //add media
        theLib.addMedia(test1);
        theLib.addMedia(lz);
        theLib.addMedia(fullMetal);
        theLib.addMedia(rushmore);
        theLib.addMedia(dk);
        theLib.addMedia(breakfast);
        theLib.addMedia(science);

        //check out and check in
        theLib.checkOut(test1);
        theLib.printLib();
        theLib.printAvailable();

        theLib.checkOut(science);

        theLib.checkOut(breakfast);
        theLib.printChecked();

        theLib.checkIn(breakfast);

        test1.printDetails();
        lz.printDetails();


        theLib.printLib();
    }
}
