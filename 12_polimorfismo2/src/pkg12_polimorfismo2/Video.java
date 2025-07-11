package pkg12_polimorfismo2;
import java.util.Calendar;
import java.util.LinkedList;
public class Video extends Media {
    //attributes/properties
    public String codec;
    public int chapters;
    public String[] audio;
    public LinkedList<Subtitle> subtitles;
    //constructor
    public Video(String codec, int chapters, String[] audio, LinkedList<Subtitle> subtitles, Author author, int duration, String name, long size, String extension, Calendar creationDate) {
        super(author, duration, name, size, "Video file", extension, creationDate);
        this.codec = codec;
        this.chapters = chapters;
        this.audio = audio;
        this.subtitles = subtitles;
    }
    //methods
    @Override
    public void print() {
        super.print(); //parcial override
        System.out.println("Codec: "+this.codec);
        System.out.println("Chapters: "+this.chapters);
        //audio track collection
        if( this.audio != null ){
            if( this.audio.length > 0 ){
                System.out.println("Audio tracks:");
                for( int i = 0; i < this.audio.length; i++ ){
                    if( this.audio[i] != null )
                        System.out.println("\t-"+this.audio[i]);
                }
            }
        }
        //subtitle collection
        if( this != null ){
            if( this.subtitles.size() > 0 ){
                System.out.println("Subtitles:");
                for( int i = 0; i < this.subtitles.size(); i++ ){
                    if( this.subtitles.get(i) != null )
                        System.out.println("\t-"+this.subtitles.get(i).language);
                }
            }
        }
    }
    
}
