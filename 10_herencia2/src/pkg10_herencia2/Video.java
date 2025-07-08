package pkg10_herencia2;
import java.util.Calendar;
import java.util.LinkedList;
public class Video extends Media {
    //attributes/properties
    public String codec;
    public int chapters;
    public String[] audio;
    public LinkedList<Subtitle> Subtitle;
    //constructor
    public Video(String codec, int chapters, String[] audio, LinkedList<Subtitle> Subtitle, Author author, int duration, String name, long size, String extension, Calendar creationDate) {
        super(author, duration, name, size, "Video file", extension, creationDate);
        this.codec = codec;
        this.chapters = chapters;
        this.audio = audio;
        this.Subtitle = Subtitle;
    }
}
