package pkg10_herencia2;

import java.util.Calendar;

public class Audio extends Media {
    //attributes/properties
    public String artist;
    public String album;
    public int year;
    public int track;
    //constructor
    public Audio(String artist, String album, int year, int track, Author author, int duration, String name, long size, String extension, Calendar creationDate) {
        //construct the super class
        super(author, duration, name, size, "Audio file", extension, creationDate);
        //initialize this class attributes
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.track = track;
    }
}
