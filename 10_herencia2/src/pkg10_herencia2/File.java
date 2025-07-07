package pkg10_herencia2;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class File {
    //atributes/properties
    public String name;
    public long size;
    private String type;
    public String extension;
    public Calendar creationDate;
    //constructor
    public File(String name, long size, String type, String extension, Calendar creationDate) {
        this.name = name;
        this.size = size;
        this.setType(type);
        this.extension = extension;
        this.creationDate = creationDate;
    }
    //methods
    public String getType(){
        return this.type;
    }
    public void setType(String type) {
        if( type != null )
            this.type = type; //is acepted
        else
            throw new IllegalArgumentException("Type cannot be null in File.");
    }
    public void print(){
        System.out.println("******** FILE ********");
        System.out.println("Name: "+this.name);
        System.out.println("Size in bytes: "+this.size);
        System.out.println("Type: "+this.type);
        System.out.println("Extension: "+this.extension);
        //if creationDate is null should not be printed
        if( this.creationDate != null ){
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
            System.out.println("Creation date: "+f.format( this.creationDate.getTime() ));
        }
    }
}
