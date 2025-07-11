package pkg12_polimorfismo2;

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
    //methods
    @Override
    public void print() {
        super.print(); //parcial override
        if( this.author != null )
            System.out.println("Author: "+this.author.name);
        System.out.println("Duration: "+this.duration);
    }
    
}
