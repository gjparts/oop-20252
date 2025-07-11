package pkg12_polimorfismo2;
import java.util.Calendar;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        Author aut1 = new Author("Gerardo", "califik.com", "");
        Author aut2 = new Author("Warmen", "", "");
        Document d1 = new Document(aut1, Calendar.getInstance(), 27176, "Tesis", 7429759, "docx", Calendar.getInstance());
        d1.print();
        
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2001, 12, 21);
        Audio aud1 = new Audio("Warmen", "Beyond abilities", 2001, 5, aut2, 3, "Spark", 3245012, "mp3", fecha1);
        aud1.print();
        
        String[] pistas = {"Español","Inglés"};
        
        LinkedList<Subtitle> subtitulos = new LinkedList();
        subtitulos.add( new Subtitle("Español",aut1) );
        subtitulos.add( new Subtitle("Ingles",aut1) );
        subtitulos.add( new Subtitle("Chino",aut1) );
        
        Video vid1 = new Video("H264", 5, pistas, subtitulos, aut1, 180, "Flow", 218453017, "mkv", Calendar.getInstance());
        vid1.print();
    }    
}
