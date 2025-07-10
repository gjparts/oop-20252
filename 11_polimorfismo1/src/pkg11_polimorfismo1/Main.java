package pkg11_polimorfismo1;
public class Main {
    public static void main(String[] args) {
        Animal anim1 = new Animal("Hipopotamo", "Mamifero", 4, true);
        anim1.imprimir();
        anim1.hablar();
        
        Gato g1 = new Gato("Naranjoso", true, true);
        g1.imprimir();
        g1.hablar();
        g1.ronronear();
        
        Perro p1 = new Perro("Benji", "Pequines", true);
        p1.jugar();
        p1.hablar();
        p1.imprimir();
        
        /*Tambien se puede hacer polimorfismo en la instanciacion de un objeto*/
        Animal anim2 = new Animal("Elefante", "Paquidermo", 4, true){
            public String comidaFavorita = "Mani"; //en JAVA este atributo no esta disponible afuera
            @Override
            public void hablar(){
                System.out.println("Le hace como claxon de furgon.");
            }
            @Override
            public void imprimir(){
                super.imprimir(); //overide Parcial de la propia clase
                System.out.println("Comida favorita: "+this.comidaFavorita);
            }
        };
        anim2.imprimir();
        anim2.hablar();
        
        System.out.println("**************************");
        //en JAVA toda clase hereda de Object de forma nativa, Object
        //tiene un metodo llamado toString() veamos:
        System.out.println( g1.toString() );
        System.out.println( p1.toString() );
        //en el caso de objetos de clases definidas por nosotros toString() imprime
        //la direccion de memoria; pero podemos hacerle polimorfismo a toString()
        //vaya a ver la definicion de la clase Gato y Perro.
        //en JAVA si imprime un Object de la siguiente forma es como si lo hiciera con toString():
        System.out.println( g1 );
        System.out.println( p1 );
    }
    
}
