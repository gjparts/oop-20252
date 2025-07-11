package pkg12_polimorfismo2;
import java.util.Calendar;
import java.text.SimpleDateFormat;
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
    //methods
    @Override
    public void print(){
        super.print(); //parcial
        /*Author viene por agregacion y es publico, Calrndar en publico:
        pueden llegar a ser null, los ignoramos si asi fuere.*/
        if( this.author != null )
            System.out.println("Author: "+this.author.name);
        if( this.modificationDate != null ){
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Modification date: "+f.format(this.modificationDate.getTime()) );
        }
        System.out.println("Words: "+this.words);
    }
}
