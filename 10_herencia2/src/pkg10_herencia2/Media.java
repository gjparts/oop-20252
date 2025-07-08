package pkg10_herencia2;

import java.util.Calendar;

public class Media extends File {
    //attributes/properties
    public Author author;
    public int duration;
    //constructor
    public Media(Author author, int duration, String name, long size, String type, String extension, Calendar creationDate) {
        //construct the super class
        super(name, size, type, extension, creationDate);
        //initialize this class attributes
        this.author = author;
        this.duration = duration;
    }
}
