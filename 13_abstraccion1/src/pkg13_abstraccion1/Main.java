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
        
        //prueba de los metodos estaticos
        SerVivo.algo();
        System.out.println( SerVivo.sumar(4, 5) );
        //con el metodo de instanciacion es posible crear un nuevo
        //objeto de clase SerVivo que en realidad es un objeto hijo compatible
        System.out.println("--------s3------------");
        SerVivo s3 = SerVivo.getInstance();
        s3.vivir();
        
        //tambien es posible instanciar un objeto de la clase abstracta
        //por medio de la implementacion de sus metodos abstractos en el
        //momento de la inicializacion del objeto
        SerVivo loro = new SerVivo("Ave"){
            @Override
            public void hablar() {
                System.out.println("Fiufiuuuuuuu");
            }
            @Override
            public void desplazarse() {
                System.out.println("Puede volar pero no lo dejan");
            }
            @Override
            public void alimentarse() {
                System.out.println("Come semillas, bichos y masa");
            }
            @Override
            public void dormir() {
                System.out.println("Duerme de pie");
            }
        };
        System.out.println("---------------------------");
        loro.vivir();
    }
    
}
