/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13_abstraccion1;


/**
 *
 * @author Gerardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //una clase abstracta no puede ser instanciada de
        //manera tradicional
        //SerVivo s = new SerVivo();
        
        Gato g1 = new Gato("Oscurano", "Gato Bombay");
        g1.vivir();
        System.out.println("----------------");
        Humano h1 = new Humano("Pedro Picapiedra", "Neandertal");
        h1.vivir();
        
        //otra ventaja de usar abstraccion es que se puede
        //instanciar un objeto compatible con la clase
        //abstracta y hacer intercambiables los tipos:
        SerVivo s1 = new Humano("Gerardo","Homo Sapiens");
        SerVivo s2 = new Gato("Naranjoso","Gato Angora");
        //observe que SerVivo puede alojar un objeto instanciado
        //de la clase Gato o de la clase Humano.
        s1.vivir();
        System.out.println("----------------");
        s2.vivir();
    }
    
}
