package pkg10_herencia2;
import java.util.Calendar;
public class Document extends File {
    //attributes/properties
    public Author author;
    public Calendar modificationDate;
    public int words;
    //constructor
    public Document(Author author, Calendar modificationDate, int words, String name, long size, String extension, Calendar creationDate) {
        //construct the super class
        super(name, size, "Document", extension, creationDate);
        //initialize this class attributes
        this.author = author;
        this.modificationDate = modificationDate;
        this.words = words;
    }
}
