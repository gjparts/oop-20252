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
    }
    
}
